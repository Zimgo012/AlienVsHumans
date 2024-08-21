package org.zimgo.aliensvshumans;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/fxmlFiles/Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600, Color.BLACK);


        String css = this.getClass().getResource("/cssFiles/Main.css").toExternalForm(); //place holder for css  file
        scene.getStylesheets().add(css); //

        stage.setTitle("Invasion Earth 3195");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}