package org.zimgo.aliensvshumans.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.zimgo.aliensvshumans.game.MusicManager;

public class MainController {


    private Parent root;
    private Scene scene;
    private Stage stage;

    @FXML
    Button startButton;
    @FXML
    Button settingButton;





    public void startGame(ActionEvent event) throws Exception{

        MusicManager.playSoundEffect("ClickSound");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxmlFiles/StoryIntroductionMenu.fxml"));
        root = loader.load();

        stage =(Stage)((Node)event.getSource()).getScene().getWindow();


        scene = new Scene(root, 600,600);

        //CSS
        String css = this.getClass().getResource("/cssFiles/StoryIntroductionMenu.css").toExternalForm();
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



}