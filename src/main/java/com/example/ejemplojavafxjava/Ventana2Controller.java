package com.example.ejemplojavafxjava;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Ventana2Controller {
    @FXML
    private Label welcomeText;
    @FXML
    private Button sendInfo;

    private HelloController controllerVentana1;
    private int pulsaciones = 0;

    public void initialize() {
        sendInfo.setOnMouseClicked(event -> {
            controllerVentana1.actualizarNumeroDeClick(pulsaciones);
        });
    }
    public void funcionPublica(int pulsaciones) {
        this.pulsaciones = pulsaciones;
        welcomeText.setText("Pulsado " + pulsaciones + " veces.");
    }

    public void enviarController1(HelloController controllerVentana1) {
        this.controllerVentana1 = controllerVentana1;
    }
}