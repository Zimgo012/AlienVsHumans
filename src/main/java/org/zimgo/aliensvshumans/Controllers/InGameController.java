package org.zimgo.aliensvshumans.Controllers;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.zimgo.aliensvshumans.game.GameLogic;
import org.zimgo.aliensvshumans.game.GameState;
import org.zimgo.aliensvshumans.game.Story;

import java.io.IOException;


public class InGameController {

    Parent root;
    Stage stage;
    Scene scene;
    Timeline timeline;

    boolean inFight = false;



    @FXML
    public Text dialogHolder;
    public Button startGame;
    public Button backToMain;
    public Button fight;
    public Button continueButton;
    public Button nextButton;



    //Buttons on Action

    public void setBackToMain(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxmlFiles/Main.fxml"));
        root = loader.load();

        stage =(Stage)((Node)event.getSource()).getScene().getWindow();


        scene = new Scene(root, 600,600);

        //CSS
        String css = this.getClass().getResource("/cssFiles/Main.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Invasion Earth 3195");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        GameState.resetStoryPoint();
    }

    public void startGame(ActionEvent event) throws IOException {

        GameLogic.startGame(this);
        startGame.setVisible(false);
        nextButton.setVisible(true);
    }

    //This will trigger the fight Scene
    public void fight(ActionEvent event) throws IOException {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxmlFiles/InFightScene.fxml"));
        Parent fightRoot = loader.load();


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene fightScene = new Scene(fightRoot, 600, 600);


        String css = this.getClass().getResource("/cssFiles/FightScene.css").toExternalForm();
        fightScene.getStylesheets().add(css);


        stage.setTitle("Invasion Earth 3195");
        stage.setScene(fightScene);
        stage.setResizable(false);
        stage.show();



    }


    //Next Button for dialogs
    public void nextButton(ActionEvent event) throws IOException {

        GameState.setCurrentStoryPoint(next(GameState.getCurrentStoryPoint()));
        System.out.println(GameState.getCurrentStoryPoint());
        setDialog(Story.storyline.get(GameState.getCurrentStoryPoint()));


        switch (GameState.getCurrentStoryPoint()){
            case 4:
            case 7:

                fight.setVisible(true);
                startGame.setVisible(false);
                nextButton.setVisible(false);
        }
    }


    //Helper Class
    public void setDialog(String message) {
        dialogHolder.setText(message);
    }

    public void clearDialog(){
        dialogHolder.setText("");
    }

    public void showButtons(){
       nextButton.setVisible(true);
    }

    public void hideStartButton(){
        startGame.setVisible(false);
    }



    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public int next(int current){
        return current + 1;

    }

}
