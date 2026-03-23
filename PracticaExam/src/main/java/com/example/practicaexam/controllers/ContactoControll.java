package com.example.practicaexam.controllers;

import com.example.practicaexam.modelo.Contacto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ContactoControll {
    @FXML private TextField txtNombre, txtTelefono,txtBuscar;
    @FXML private ComboBox<String> comboParentesco;
    @FXML private ListView<Contacto> listContactos;

    private ObservableList<Contacto> listaContactos = FXCollections.observableArrayList();
    private FilteredList<Contacto> listaFiltrada = new FilteredList<>(listaContactos, p -> true);
    private String[] opParentes = {
            "Padre", "Madre", "Hermano", "Hermana", "Abuelo", "Abuela", "Tío", "Tía"
    };

    @FXML
    public void initialize() {
        comboParentesco.setItems(FXCollections.observableArrayList(opParentes));
        listContactos.setItems(listaFiltrada);
        listContactos.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> {
            if (newV != null) {
                txtNombre.setText(newV.getNombre());
                txtTelefono.setText(newV.getTelefono());
                comboParentesco.setValue(newV.getParentesco());
            }
        });
    }

    @FXML
    private void btnAgregarClick() {
        String nom = txtNombre.getText();
        String tel = txtTelefono.getText();
        String par = comboParentesco.getValue();

        if (validarDatos(nom, tel, par)) {
            if (buscarPorNombre(nom) == null) {
                listaContactos.add(new Contacto(nom, tel, par));
                limpiarCampos();
            } else {
                mostrarAlerta("Error", "Ya existe un contacto con ese nombre.");
            }
        }
    }

    @FXML
    private void btnBuscarClick() {
        String busque = txtBuscar.getText().toLowerCase().trim();
        listContactos.getSelectionModel().clearSelection();
        listaFiltrada.setPredicate(contacto -> {
            if (busque == null || busque.isEmpty()) {
                return true;
            }
            return contacto.getNombre().toLowerCase().contains(busque);
        });
        if (listaFiltrada.isEmpty()) {
            mostrarAlerta("Búsqueda", "No se encontraron contactos que contengan: " + busque);

        }
    }

    @FXML
    private void btnActualizarClick() {
        Contacto selec = listContactos.getSelectionModel().getSelectedItem();
        if (selec != null) {
            if (validarDatos(txtNombre.getText(), txtTelefono.getText(), comboParentesco.getValue())) {
                selec.setNombre(txtNombre.getText());
                selec.setTelefono(txtTelefono.getText());
                selec.setParentesco(comboParentesco.getValue());
                listContactos.refresh();
                mostrarAlerta("Éxito", "Contacto actualizado correctamente.");
            }
        } else {
            mostrarAlerta("Error", "Error");
        }
    }

    @FXML
    private void btnEliminarClick() {
        Contacto select = listContactos.getSelectionModel().getSelectedItem();

        if (select != null) {
            listaContactos.remove(select);
            limpiarCampos();
        } else {
            mostrarAlerta("Error", "Selecciona el contacto que deseas eliminar.");
        }
    }

    @FXML
    private void limpiarCampos() {
        txtNombre.clear();
        txtTelefono.clear();
        comboParentesco.getSelectionModel().clearSelection();
    }

    private Contacto buscarPorNombre(String nombre) {
        for (Contacto c : listaContactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) return c;
        }
        return null;
    }

    private boolean validarDatos(String nom, String tel, String par) {
        if (nom.isEmpty() || tel.isEmpty() || par == null) {
            mostrarAlerta("Validación", "Todos los campos son obligatorios.");
            return false;
        }
        if (tel.length() != 10 || !tel.matches("\\d+")) {
            mostrarAlerta("Validación", "El teléfono debe tener 10 dígitos numéricos.");
            return false;
        }
        return true;
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
