package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.Session;
import com.example.retogrupalgestiontareas.domain.entities.activity.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.user.Usuario;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
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
    private TextField txtDualHours;
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
    private TableView<Actividad> table;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cName;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cHours;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cType;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cDate;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cObservations;

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

    //este es el stage para el modal de cambiar de contraseña
    public static Stage pass = new Stage();

    //este es el stage para el modal de observaciones
    public static Stage obs = new Stage();



    @javafx.fxml.FXML
    public void initialize() {
        Usuario u = Session.getCurrentUser();

        txtName.setText(u.getNombre());
        txtSurname.setText(u.getApellido());
        txtEmail.setText(u.getEmail());
        txtPass.setText(u.getPassword());
        txtDNI.setText(u.getDni().toString());
        txtBirth.setText(u.getFecha_nac().toString());
        txtPhone.setText(u.getTelefono().toString());
        txtTutor.setText(u.getTutor());
        txtEmpresa.setText(u.getCompany().getNombre());
        txtDualHours.setText(u.getRestantesdual().toString());
        txtFctHours.setText(u.getRestantesfct().toString());
        txtDualTotal.setText(u.getTotalhorasdual().toString());
        txtFctTotal.setText(u.getTotalhorasfct().toString());


        cName.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getNombre())
        );

        cHours.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getHoras()+"")
        );

        cType.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getTipo())
        );

        cDate.setCellValueFactory((fila)->
                new SimpleStringProperty(fila.getValue().getFecha()+"")
        );

        cObservations.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getObservaciones())
        );

        table.getSelectionModel().selectedItemProperty().addListener(((observableValue, o, t1) -> {
            Session.setCurrentActivity((Actividad) t1);
            System.out.println(Session.getCurrentActivity());
        }));


        table.getItems().addAll(Session.getCurrentActivity());


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
    public void goToChange(ActionEvent actionEvent) throws IOException {
        App.modal(pass,"passModal-view.fxml");
    }

    @javafx.fxml.FXML
    public void addObservations(ActionEvent actionEvent) throws IOException {
        App.modal(obs,"obsModal-view.fxml");
    }


    @Deprecated
    public void cancel(ActionEvent actionEvent) throws IOException {
        pass.close();
        obs.close();
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        Session.setCurrentUser(null);
        App.changeScene("login-view.fxml","Iniciar Sesión");
    }

    @javafx.fxml.FXML
    public void goToActivities(ActionEvent actionEvent) throws IOException {
        App.changeScene("addActivity-view.fxml","Añadir Actividad");
    }
}