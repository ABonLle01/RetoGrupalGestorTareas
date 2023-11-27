package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class AddAlumnController {
    @javafx.fxml.FXML
    private TextField txtNombre;
    @javafx.fxml.FXML
    private TextField txtEmail;
    @javafx.fxml.FXML
    private TextField txtFechaNac;
    @javafx.fxml.FXML
    private TextField txtTelefono;
    @javafx.fxml.FXML
    private TextField txtApellidos;
    @javafx.fxml.FXML
    private TextField txtDNI;
    @javafx.fxml.FXML
    private TextField txtPassword;
    @javafx.fxml.FXML
    private ChoiceBox<String> cbEmpresa;
    @javafx.fxml.FXML
    private ChoiceBox<String> cbTutor;
    @javafx.fxml.FXML
    private Spinner<Integer> spinnerDual;
    @javafx.fxml.FXML
    private Spinner<Integer> spinnerFCT;
    @javafx.fxml.FXML
    private TextArea taObservaciones;
    @javafx.fxml.FXML
    private Button btnAlumns;
    @javafx.fxml.FXML
    private Button btnAñadir;

    @javafx.fxml.FXML
    public void goToAlumns(ActionEvent actionEvent) throws IOException {
        App.changeScene("alumnList-view.fxml","Lista de Alumnos");
    }

    @javafx.fxml.FXML
    public void addAlumn(ActionEvent actionEvent) throws IOException {
        App.changeScene("alumnList-view.fxml","Lista de Alumnos");
    }
}
