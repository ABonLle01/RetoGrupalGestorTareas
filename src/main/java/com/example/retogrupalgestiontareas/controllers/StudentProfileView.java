package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.domain.Usuario;
import javafx.event.*;
import javafx.scene.control.*;

import java.time.LocalDate;

public class StudentProfileView {
    @javafx.fxml.FXML
    private TextField txtName;
    @javafx.fxml.FXML
    private TextField txtSurname;
    @javafx.fxml.FXML
    private TextField txtDNI;
    @javafx.fxml.FXML
    private TextField txtPhone;
    @javafx.fxml.FXML
    private TextField txtEmail;
    @javafx.fxml.FXML
    private TextField txtTutor;
    @javafx.fxml.FXML
    private TextField txtHoursDual;
    @javafx.fxml.FXML
    private TextField txtFctHours;
    @javafx.fxml.FXML
    private TextField txtFctTotal;
    @javafx.fxml.FXML
    private TextField txtDualTotal;
    @javafx.fxml.FXML
    private PasswordField txtPass;
    @javafx.fxml.FXML
    private TextField txtBirth;
    @javafx.fxml.FXML
    private TextField txtEmpresa;


    @javafx.fxml.FXML
    private TableView<Usuario> tAlumn;
    @javafx.fxml.FXML
    private TableColumn<Usuario, String> cName;
    @javafx.fxml.FXML
    private TableColumn<Usuario, Integer> cHours;
    @javafx.fxml.FXML
    private TableColumn<Usuario, String> cType;
    @javafx.fxml.FXML
    private TableColumn<Usuario, LocalDate> cDate;
    @javafx.fxml.FXML
    private TableColumn<Usuario, String> cObservations;

    @javafx.fxml.FXML
    private Button btnObserv;
    @javafx.fxml.FXML
    private Button btnGuardar;
    @javafx.fxml.FXML
    private Button btnActualizar;
    @javafx.fxml.FXML
    private Button btnEliminar;
    @javafx.fxml.FXML
    private Button btnCambiar;
    @javafx.fxml.FXML
    private Button btnCerrar;
    @javafx.fxml.FXML
    private Button btnAñadir;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void goToAlumns(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addObservations(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void save(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void delete(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void goToChange(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goToActivities(ActionEvent actionEvent) {
    }
}