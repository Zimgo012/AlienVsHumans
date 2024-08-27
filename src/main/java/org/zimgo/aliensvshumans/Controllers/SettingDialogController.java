package org.zimgo.aliensvshumans.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.zimgo.aliensvshumans.game.MusicManager;
import org.zimgo.aliensvshumans.game.GlobalSettings;

public class SettingDialogController {

    @FXML
    private Button exitButton;

    @FXML
    private Button backgroundMusicControl;

    @FXML
    private Button clickSoundControl;

    private Stage stage;

    @FXML
    public void initialize() {
        // Initialize button text based on the global settings
        if (GlobalSettings.isBackgroundMusicEnabled()) {
            backgroundMusicControl.setText("Toggle off background music");
        } else {
            backgroundMusicControl.setText("Toggle on background music");
        }

        if (GlobalSettings.isClickSoundEnabled()) {
            clickSoundControl.setText("Toggle off click sound");
        } else {
            clickSoundControl.setText("Toggle on click sound");

        }
    }

    @FXML
    public void exit(ActionEvent event) {
        if (stage != null) {
            stage.close(); // Close the Stage
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void backgroundMusicControl(ActionEvent event) {
        boolean isEnabled = GlobalSettings.isBackgroundMusicEnabled();
        if (isEnabled) {
            backgroundMusicControl.setText("Toggle on background music");
            MusicManager.stopCurrentTrack();
        } else {
            backgroundMusicControl.setText("Toggle off background music");
            MusicManager.playTrack("BackgroundMusicMenu"); // Ensure this track name is correct
        }
        GlobalSettings.setBackgroundMusicEnabled(!isEnabled);
    }

    @FXML
    public void clickMusicControl(ActionEvent event) {
        boolean isEnabled = GlobalSettings.isClickSoundEnabled();
        if (isEnabled) {
            clickSoundControl.setText("Toggle on click sound");
        } else {
            clickSoundControl.setText("Toggle off click sound");
        }
        GlobalSettings.setClickSoundEnabled(!isEnabled);
    }
}
