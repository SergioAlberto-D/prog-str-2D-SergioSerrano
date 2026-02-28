package com.example.login.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginController {
    @FXML
    private TextField txtEmail;
    @FXML
    private  TextField txtContrasena;

    @FXML
    private Label lblResultado;

    public void onValidate(ActionEvent event) throws IOException {
        String email = txtEmail.getText() == null ? "" : txtEmail.getText();
        String contra = txtContrasena.getText() == null ? "" : txtContrasena.getText();

        List<String> errores = new ArrayList<>();

        //Validacion de e-mail
        if (contra.isBlank() || !email.contains("@") || !email.contains(".")){
            errores.add("El e-mail es invalido");
        }
        String nombreExtraido = email.split("@")[0];
        if(nombreExtraido.isBlank() || nombreExtraido.length()<4){
            errores.add("El nombre es invalido");
        }

        if(contra.isBlank() || contra.length()<6){
            errores.add("La contraseña es invalida");
        }
        if (errores.isEmpty()){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/login/dashboard.fxml"));
            Parent root = loader.load();
            DashboardController controller = loader.getController();
            controller.setNombreUsuario(nombreExtraido);
            Stage stageActual = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            Stage nuevaVentana = new Stage();
            nuevaVentana.setScene(new Scene(root));
            nuevaVentana.setTitle("Panel de Inicio");
            nuevaVentana.show();
            stageActual.close();
        }else{
            lblResultado.setText("Error de: "+String.join(", ",errores));
            lblResultado.setStyle("-fx-text-fill: red");
        }
    }

}
