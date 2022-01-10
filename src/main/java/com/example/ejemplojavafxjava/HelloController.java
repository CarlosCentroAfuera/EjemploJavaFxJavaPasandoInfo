package com.example.ejemplojavafxjava;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    private int contadorDePulsaciones = 0;

    @FXML
    protected void onHelloButtonClick() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));

            VBox root = (VBox) loader.load();
            Scene scene = new Scene(root, 500, 500);
            stage.setScene(scene);
            stage.show();

            Ventana2Controller v = loader.getController();
            contadorDePulsaciones++;
            v.funcionPublica(contadorDePulsaciones);
        } catch (IOException e) {
            e.printStackTrace();
        }
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}