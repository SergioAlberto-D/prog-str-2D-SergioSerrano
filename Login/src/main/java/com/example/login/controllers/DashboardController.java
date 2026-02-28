package com.example.login.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {
    @FXML
    private Label labelNombre;
    public void setNombreUsuario(String nombre) {
        labelNombre.setText("Bienvenido "+nombre);
    }
}
