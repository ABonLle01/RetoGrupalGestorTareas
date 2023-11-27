package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class TeacherProfileController {
    @javafx.fxml.FXML
    private Button btnvolver;
    @javafx.fxml.FXML
    private Button btnLogOut;
    @javafx.fxml.FXML
    private TextField txtNombre;
    @javafx.fxml.FXML
    private TextField txtApellidos;
    @javafx.fxml.FXML
    private TextField txtEmail;
    @javafx.fxml.FXML
    private Button btnPass;
    @javafx.fxml.FXML
    private Button btnSave;

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        App.changeScene("alumnList-view.fxml","Listado de Alumnos");
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        App.changeScene("login-view.fxml","Iniciar Sesión");
    }

    @javafx.fxml.FXML
    public void changePassword(ActionEvent actionEvent) {
        // TODO: modal para cambiar contraseña
    }

    @javafx.fxml.FXML
    public void saveChanges(ActionEvent actionEvent) {
    }
}
