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
import org.zimgo.aliensvshumans.characters.Characters;
import org.zimgo.aliensvshumans.game.GameLogic;
import org.zimgo.aliensvshumans.game.GameState;
import org.zimgo.aliensvshumans.game.Utilities;

import java.io.IOException;

public class InFightController {

    @FXML
    Parent root;
    Stage stage;
    Scene scene;
    Timeline timeline;

    //Text
    @FXML
    Text characterInformation;
    @FXML
    public Text dialogHolder;
    public Button startFight;
    public Button attackButton;
    public Button exitButton;


    //Buttons
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

    //Buttons
    public void attack(ActionEvent event) throws IOException {

        Characters attacker = GameLogic.getPlayer();
        Characters defender = GameLogic.getOpponent();

        attacker.attack(defender);


        disableAttackButton();
        updateUI();

        
    }

    //Enable attack Button
    public void enableAttackButton(){
        attackButton.setDisable(false);
    }

    //Disable attack Button
    public void disableAttackButton(){
        attackButton.setDisable(true);
    }


    public void startFight(ActionEvent event) throws IOException {
        startFight.setDisable(true);
        attackButton.setDisable(true);
        timeline = new Timeline();
        GameLogic.inFight(this, timeline);



    }

    public void exitFight(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxmlFiles/InGame.fxml"));
        Parent inGameRoot = loader.load();

        InGameController inGameController = loader.getController();

        inGameController.setTimeline(timeline);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene inGameScene = new Scene(inGameRoot, 600, 600);

        String css = this.getClass().getResource("/cssFiles/InGame.css").toExternalForm();
        inGameScene.getStylesheets().add(css);

        stage.setScene(inGameScene);
        stage.setTitle("Invasion Earth 3195");
        stage.setResizable(false);
        stage.show();

        inGameController.showButtons();
        inGameController.hideStartButton();

    }

    //Helper Methods

    public void setDialog(String message) {
        dialogHolder.setText(message);
    }

    public void clearDialog(){
        dialogHolder.setText("");
    }


    private void updateUI(){

        setDialog("Alien took " + GameLogic.getPlayer().getDamage() + " damage.");
    }
    
    public void hideExitButton(){
       exitButton.setVisible(true);
    }




}
