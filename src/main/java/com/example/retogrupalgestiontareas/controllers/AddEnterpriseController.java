package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class AddEnterpriseController {
    @javafx.fxml.FXML
    private TextField txtNombre;
    @javafx.fxml.FXML
    private TextField txtTelefono;
    @javafx.fxml.FXML
    private TextField txtResponsable;
    @javafx.fxml.FXML
    private TextField txtEmail;
    @javafx.fxml.FXML
    private TextArea taObservaciones;

    @javafx.fxml.FXML
    private Button btnAñadir;
    @javafx.fxml.FXML
    private Button btnAlumns;


    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void gotToAlumns(ActionEvent actionEvent) throws IOException {
        App.changeScene("alumnList-view.fxml","Lista de Alumnos");
    }

    @javafx.fxml.FXML
    public void addEnterprise(ActionEvent actionEvent) throws IOException {
        App.changeScene("enterpriseList-view.fxml","Lista de empresas");
    }


}
