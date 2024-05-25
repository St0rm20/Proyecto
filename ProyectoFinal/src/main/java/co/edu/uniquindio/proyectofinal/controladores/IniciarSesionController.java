package co.edu.uniquindio.proyectofinal.controladores;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class IniciarSesionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField claimTextContrasenia;

    @FXML
    private TextField claimTextCorreo;

    @FXML
    private Button onListo;

    @FXML
    private Label textContrasenia;

    @FXML
    private Label textCorreo;

    @FXML
    private Label textInicioDeSesion;

    @FXML
    void onListo() {
        System.out.println("Listo");
    }


}