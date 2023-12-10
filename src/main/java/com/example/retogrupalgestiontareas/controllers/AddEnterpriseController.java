package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.Session;
import com.example.retogrupalgestiontareas.domain.entities.company.Empresa;
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
        Session.setCurrentCompany(null);

    }

    @javafx.fxml.FXML
    public void gotToAlumns(ActionEvent actionEvent) throws IOException {
        App.changeScene("alumnList-view.fxml","Lista de Alumnos");
    }

    @javafx.fxml.FXML
    public void addEnterprise(ActionEvent actionEvent) throws IOException {
        Empresa e = new Empresa();

        if(txtNombre.getText().length()>1) e.setNombre(txtNombre.getText());
        if(txtResponsable.getText().length()>1) e.setResponsable(txtResponsable.getText());
        if(txtTelefono.getText().length()>8) e.setTelefono(Integer.valueOf(txtTelefono.getText()));
        if(txtEmail.getText().length()>4) e.setEmail(txtEmail.getText());
        e.setObservaciones(taObservaciones.getText());

        Session.setCurrentCompany(e);

        App.changeScene("enterpriseList-view.fxml","Lista de empresas");
    }


}
