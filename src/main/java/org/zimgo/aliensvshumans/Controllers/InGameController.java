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
    }

    public void startGame(ActionEvent event) throws IOException {
        startGame.setVisible(false);
        timeline = new Timeline();
        GameLogic.startGame(this, timeline);
    }

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

    public void continueButton(ActionEvent event) throws IOException {
        GameLogic.resumeGame(this, timeline);
    }


    //Helper Class
    public void setDialog(String message) {
        dialogHolder.setText(message);
    }

    public void clearDialog(){
        dialogHolder.setText("");
    }

    public void showButtons(){
        fight.setVisible(true);
    }

    public void hideContinueButton(){
        continueButton.setVisible(false);
    }

    public void showContinueButton(){
        continueButton.setVisible(true);
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

}
