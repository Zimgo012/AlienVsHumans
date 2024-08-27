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
import org.zimgo.aliensvshumans.characters.Assasin;
import org.zimgo.aliensvshumans.characters.Soldier;
import org.zimgo.aliensvshumans.game.GameLogic;
import org.zimgo.aliensvshumans.game.MusicManager;
import org.zimgo.aliensvshumans.game.Story;

import java.io.IOException;

public class CharacterSelection {

    Parent root;
    Stage stage;
    Scene scene;

    //Text
    @FXML
    public Text characterInformation;
    @FXML
    public Button nextButton;
    @FXML
    public Button previousButton;
    @FXML
    public Button selectCharacterButton;
    @FXML
    public Button settingButton;



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

    @FXML
    private void selectCharacterButton(ActionEvent event) throws IOException {


        //Choose Character
        if (clickCounter == 1) {
            GameLogic.setPlayer(new Soldier());
        } else if (clickCounter == 2) {
            GameLogic.setPlayer(new Assasin());
            selectCharacterButton.setDisable(true);
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxmlFiles/InGame.fxml"));
        root = loader.load();

        stage =(Stage)((Node)event.getSource()).getScene().getWindow();


        scene = new Scene(root, 600,600);

        //CSS
        String css = this.getClass().getResource("/cssFiles/InGame.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);
    }

    public void settingButton(ActionEvent event) throws Exception {
        MusicManager.playSoundEffect("ClickSound");


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxmlFiles/SettingDialog.fxml"));
        Parent dialogRoot = fxmlLoader.load();

        // Create a new Stage for the settings dialog
        Stage settingsStage = new Stage();
        settingsStage.setTitle("Settings");

        Scene scene = new Scene(dialogRoot, 400, 300); // Set size
        String css = this.getClass().getResource("/cssFiles/SettingDialog.css").toExternalForm();
        scene.getStylesheets().add(css);

        settingsStage.setScene(scene);

        // Pass the Stage to the controller
        SettingDialogController controller = fxmlLoader.getController();
        controller.setStage(settingsStage);

        // Show the dialog
        settingsStage.showAndWait();
    }



    //Dialogs
    private void updateCharInfo() {
        if (clickCounter == 1) {
            char1Info();
            nextButton.setText("next");
            previousButton.setVisible(true);
            nextButton.setDisable(false);
            previousButton.setDisable(true);
            selectCharacterButton.setVisible(true);
        } else if (clickCounter == 2) {
            char2Info();
            nextButton.setDisable(true);
            previousButton.setDisable(false);
            selectCharacterButton.setVisible(true);

        }
    }


    private void char1Info(){
        characterInformation.setText(Story.soldierInfo());
    }
    private void char2Info(){
        characterInformation.setText(Story.assassinInfo());
    }





}
