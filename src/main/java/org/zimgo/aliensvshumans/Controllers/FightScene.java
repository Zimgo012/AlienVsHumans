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
import org.zimgo.aliensvshumans.game.Story;

import java.io.IOException;

public class FightScene {

    Parent root;
    Stage stage;
    Scene scene;

    //Text
    @FXML
    Text characterInformation;
    @FXML
    public Button backToMain;
    public Text dialogHolder;


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

    public void attack(ActionEvent event) throws IOException {}

    //Helper Methods

    public void setDialog(String message) {
        dialogHolder.setText(message);
    }

    public void clearDialog(){
        dialogHolder.setText("");
    }






}
