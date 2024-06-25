package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label ClickText;

    @FXML
    protected void onHelloButtonClick() { welcomeText.setText("МОЛОДЧИНА");}

    @FXML
    protected void onHelloButtonClick1() { welcomeText.setText("ЧЕЛ, ТЫ ЗАБАНЕН");}



}