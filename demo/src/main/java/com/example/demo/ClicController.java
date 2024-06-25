package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ClicController {
    @FXML
    private Label Text;

    @FXML
    protected void onHelloButtonClick() {
        Text.setText("Доброе утро!");
    }
}