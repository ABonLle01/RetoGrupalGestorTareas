package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.domain.entities.Empresa;
import com.example.retogrupalgestiontareas.domain.entities.user.Usuario;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

public class AlumnListController {
    @javafx.fxml.FXML
    private MenuItem miAddEnterprise;
    @javafx.fxml.FXML
    private MenuItem miEnterpriseList;
    @javafx.fxml.FXML
    private MenuItem miProfile;

    @javafx.fxml.FXML
    private TableView<Usuario> tblAlumnos;
    @javafx.fxml.FXML
    private TableColumn<Usuario, String> cNombre;
    @javafx.fxml.FXML
    private TableColumn<Usuario, String> cApellidos;
    @javafx.fxml.FXML
    private TableColumn<Empresa, String> cEmpresa;
    @javafx.fxml.FXML
    private TableColumn<Usuario, Integer> cHorasRestantes;

    @javafx.fxml.FXML
    private Button btnDelete;

    @javafx.fxml.FXML
    public void addEnterprise(ActionEvent actionEvent) throws IOException {
        App.changeScene("addEnterprise-view.fxml","Añadir Empresa");
    }

    @javafx.fxml.FXML
    public void gotToEnterpriseList(ActionEvent actionEvent) throws IOException {
        App.changeScene("enterpriseList-view.fxml","Lista de Empresas");
    }

    @javafx.fxml.FXML
    public void goToProfile(ActionEvent actionEvent) throws IOException {
        App.changeScene("teacherProfile-view.fxml","Perfil del Profesor");
    }

    @javafx.fxml.FXML
    public void selectedAlumn(Event event) {
    }

    @javafx.fxml.FXML
    public void delete(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Borrar Alumno");
        alerta.setContentText("¿Está seguro de que desea borrar al alumno?");
        alerta.showAndWait();
    }
}
