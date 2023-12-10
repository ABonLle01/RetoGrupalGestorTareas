package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.Session;
import com.example.retogrupalgestiontareas.domain.entities.activity.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.activity.ActividadDAO;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class StudentProfileAlumn {
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

    //este es el stage para el modal de cambiar de contraseña
    public static Stage pass = new Stage();

    //este es el stage para el modal de observaciones
    public static Stage obs = new Stage();

    private final ActividadDAO actividadDAO = new ActividadDAO();



    @javafx.fxml.FXML
    public void initialize() {
        Alumno a = Session.getCurrentAlumn();

        txtName.setText(a.getNombre());
        txtSurname.setText(a.getApellido());
        txtEmail.setText(a.getEmail());
        txtPass.setText(a.getPassword());
        txtDNI.setText(a.getDni());
        txtBirth.setText(a.getFecha_nac().toString());
        txtPhone.setText(a.getTelefono().toString());
        txtTutor.setText(a.getProfesor().getNombre());
        txtEmpresa.setText(a.getEmpresa().getNombre());
        txtDualHours.setText(a.getRestantesdual().toString());
        txtFctHours.setText(a.getRestantesfct().toString());
        txtDualTotal.setText(a.getTotalhorasdual().toString());
        txtFctTotal.setText(a.getTotalhorasfct().toString());


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

        List<Actividad> lista = actividadDAO.getAllByAlumno(Session.getCurrentAlumn());
        table.getItems().addAll(lista);

        table.getSelectionModel().selectedItemProperty().addListener(((observableValue, o, t1) -> {
            Session.setCurrentActivity(t1);
            System.out.println(Session.getCurrentActivity());
        }));





    }



    @javafx.fxml.FXML
    public void goToChange(ActionEvent actionEvent) throws IOException {
        App.modal(pass,"passModal-view.fxml");
    }

    @Deprecated
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
        Session.logOut();
        App.changeScene("login-view.fxml","Iniciar Sesión");
    }

    @javafx.fxml.FXML
    public void goToActivities(ActionEvent actionEvent) throws IOException {
        App.changeScene("addActivity-view.fxml","Añadir Actividad");
    }

}