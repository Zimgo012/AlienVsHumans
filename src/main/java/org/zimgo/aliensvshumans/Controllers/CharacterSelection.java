package org.zimgo.aliensvshumans.Controllers;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.zimgo.aliensvshumans.game.Story;

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



    int clickCounter = 0;


    //Buttons
    @FXML
    public void nextButton(){
        clickCounter++;
        updateCharInfo();
    }
    @FXML
    private void previousButton(){
        clickCounter--;
        updateCharInfo();
    }

    //Dialogs
    private void updateCharInfo() {
        if (clickCounter == 1) {
            char1Info();
            nextButton.setText("next");
            previousButton.setVisible(true);
            nextButton.setDisable(false);
            previousButton.setDisable(true);
        } else if (clickCounter == 2) {
            char2Info();
            nextButton.setDisable(true);
            previousButton.setDisable(false);
        }
    }

    private void char1Info(){
        characterInformation.setText(Story.soldierInfo());
    }
    private void char2Info(){
        characterInformation.setText(Story.assassinInfo());
    }





}
