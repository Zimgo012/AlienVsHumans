package org.zimgo.aliensvshumans.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.zimgo.aliensvshumans.game.Story;

import java.io.IOException;

public class CharacterSelection {

    Parent root;
    Stage stage;
    Scene scene;

    //Text
    @FXML
    Text characterInformation;
    @FXML
    Button nextButton;
    @FXML
    Button previousButton;
    @FXML
    Button chooseCharacter;


    int clickCounter = 0;


    //Buttons
    @FXML
    public void nextButton(){
        clickCounter++;
        updateCharInfo();
        System.out.println(clickCounter);
    }

    @FXML
    private void previousButton(){
        clickCounter--;
        updateCharInfo();
        System.out.println(clickCounter);
    }

    @FXML
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

    public  void setChooseCharacter(ActionEvent event) throws IOException {
        if (clickCounter == 1) {
            //CREATE CHARACTER OBJECT OF SOLDIER AND PLAY AS A SOLDIER
        }else if(clickCounter == 2){
            //CREATE CHARACTER OBJECT OF ASSASSIN AND PLAY AS AN ASSASSIN
        }

    }

    //Dialogs
    private void updateCharInfo() {
        if (clickCounter == 1) {
            char1Info();
            nextButton.setText("next");
            previousButton.setVisible(true);
            nextButton.setDisable(false);
            previousButton.setDisable(true);
            chooseCharacter.setVisible(true);
            chooseCharacter.setText("Choose Soldier");


        } else if (clickCounter == 2) {
            char2Info();
            nextButton.setDisable(true);
            previousButton.setDisable(false);
            chooseCharacter.setText("Choose Assassin");
        }
    }
    private void char1Info(){
        characterInformation.setText(Story.soldierInfo());
    }
    private void char2Info(){
        characterInformation.setText(Story.assassinInfo());
    }

    //Helper Methods

    public void startGameWithCharacter(Character character){

    }





}
