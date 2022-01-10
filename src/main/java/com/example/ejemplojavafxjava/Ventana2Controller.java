package com.example.ejemplojavafxjava;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Ventana2Controller {
    @FXML
    private Label welcomeText;

    public void funcionPublica(int pulsaciones) {
        welcomeText.setText("Pulsado " + pulsaciones + " veces.");
    }

}