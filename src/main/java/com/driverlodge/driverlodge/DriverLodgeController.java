package com.driverlodge.driverlodge;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DriverLodgeController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}