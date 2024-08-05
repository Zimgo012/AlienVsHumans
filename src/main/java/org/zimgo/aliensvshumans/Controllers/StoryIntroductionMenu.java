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

public class StoryIntroductionMenu {


    @FXML
    private Parent root;
    @FXML
    private Scene scene;
    @FXML
    private Stage stage;

    //Text
    @FXML
    private Text IntroDialog;

    //Buttons
    @FXML
    private Button settingButton;

    @FXML
    private Button createChar;

    @FXML
    private Button loadChar;

    @FXML
    private Button backToMain;

    private int clickState = 0;


    @FXML
    private void dialog() {

        switch (clickState) {
            case 0 -> {
                text1();
                clickState = 1;
            }
            case 1 -> {
                text2();
                clickState = 2;
                createChar.setVisible(true);
                loadChar.setVisible(true);
                backToMain.setVisible(true);
            }
            default -> {
                clickState = 0;
                createChar.setVisible(false);
                loadChar.setVisible(false);
                backToMain.setVisible(false);
            }
        }
    }

    private void text1() {
        IntroDialog.setText(Story.intro()); // Assuming intro() is static
    }

    private void text2() {
        IntroDialog.setText(Story.intro2()); // Assuming intro2() is static
    }

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

    public void createCharacter(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxmlFiles/CharacterSelection.fxml"));
        root = loader.load();

        stage =(Stage)((Node)event.getSource()).getScene().getWindow();


        scene = new Scene(root, 600,600);

        //CSS
        String css = this.getClass().getResource("/cssFiles/CharacterSelection.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);
    }
}
