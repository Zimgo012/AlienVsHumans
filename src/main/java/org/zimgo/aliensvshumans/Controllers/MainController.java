package org.zimgo.aliensvshumans.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {


    private Parent root;
    private Scene scene;
    private Stage stage;




    public void startGame(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxmlFiles/StoryIntroductionMenu.fxml"));
        root = loader.load();

        stage =(Stage)((Node)event.getSource()).getScene().getWindow();


        scene = new Scene(root, 600,600);

        //CSS
        String css = this.getClass().getResource("/cssFiles/StoryIntroductionMenu.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);


    }




}