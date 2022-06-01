package com.driverlodge.driverlodge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class DriverLodge extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DriverLodge.class.getResource("startUpView.fxml"));

        Image image = new Image(getClass().getResource("images/LodgeImage.png").toExternalForm());
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("DriverLodge");
        stage.setResizable(false);
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}