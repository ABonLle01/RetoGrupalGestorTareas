package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.Session;
import com.example.retogrupalgestiontareas.domain.entities.company.Empresa;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import com.example.retogrupalgestiontareas.domain.entities.company.EmpresaDAO;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class EnterpriseListController {
    @javafx.fxml.FXML
    private TableView<Empresa> tblEmpresas;
    @javafx.fxml.FXML
    private TableColumn<Empresa, String> cNombre;
    @javafx.fxml.FXML
    private TableColumn<Empresa, String> cResponsable;
    @javafx.fxml.FXML
    private TableColumn<Empresa, String> cTelefono;
    @javafx.fxml.FXML
    private TableColumn<Empresa, String> cEmail;
    @javafx.fxml.FXML
    private TableColumn<Empresa, String> cAlumno;

    @javafx.fxml.FXML
    private Button btnVolver;
    @javafx.fxml.FXML
    private Button btnDelete;
    @javafx.fxml.FXML
    private Button btnAñadir;

    @javafx.fxml.FXML
    public void initialize(){

        cNombre.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getNombre())
        );

        cResponsable.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getResponsable())
        );

        cTelefono.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getTelefono().toString())
        );

        cEmail.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getEmail())
        );

        cAlumno.setCellValueFactory((fila) ->
                new SimpleStringProperty(getNombresAlumnos(fila.getValue().getAlumno()))
        );

        List<Empresa> lista = (new EmpresaDAO()).getAll(Math.toIntExact(Session.getCurrentTeacher().getId_profesor()));
        tblEmpresas.getItems().addAll(lista);

        tblEmpresas.getSelectionModel().selectedItemProperty().addListener((observableValue, empresa, t1) -> {
            System.out.println(t1);
            Session.setCurrentCompany(t1);
        });
    }

    private String getNombresAlumnos(List<Alumno> alumnos) {
        if (alumnos == null || alumnos.isEmpty()) {
            return "";
        }

        return alumnos.stream()
                .map(Alumno::getNombre)
                .collect(Collectors.joining(", "));
    }


    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        App.changeScene("alumnList-view.fxml","Lista de Alumnos");
    }

    @javafx.fxml.FXML
    public void newEnterprise(ActionEvent actionEvent) throws IOException {
        App.changeScene("addEnterprise-view.fxml","Nueva Empresa");
    }

    @javafx.fxml.FXML
    public void selectedEnterprise(Event event) {
    }

    @javafx.fxml.FXML
    public void delete(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Borrar Empresa");
        alerta.setContentText("¿Está seguro de que desea borrar "+ Session.getCurrentCompany().getNombre() +" ?");
        alerta.showAndWait();
    }
}
