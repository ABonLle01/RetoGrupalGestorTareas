package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.Session;
import com.example.retogrupalgestiontareas.domain.entities.activity.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.activity.ActividadDAO;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.time.LocalDate;

public class AddActivityController {
    @javafx.fxml.FXML
    private TextField txtNombreActividad;
    @javafx.fxml.FXML
    private Spinner<Integer> spinnerHoras;
    @javafx.fxml.FXML
    private ComboBox<String> comboTipoPractica;
    @javafx.fxml.FXML
    private DatePicker dpFecha;
    @javafx.fxml.FXML
    private TextArea txtObservaciones;

    @javafx.fxml.FXML
    private Button btnAñadir;
    @javafx.fxml.FXML
    private Button btnActivities;

    private final ActividadDAO actividadDAO = new ActividadDAO();

    @javafx.fxml.FXML
    public void initialize() {
        txtNombreActividad.setText("Nombre de prueba");
        spinnerHoras.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,1,1));
        comboTipoPractica.getItems().addAll("Dual","FCT");
        comboTipoPractica.setValue("FCT");
        dpFecha.setValue(LocalDate.now());

        actividadDAO.getAllByAlumno(Session.getCurrentAlumn());
    }

    @javafx.fxml.FXML
    public void addActivity(ActionEvent actionEvent) throws IOException {
        Actividad activity = newActivity();
        activity.setAlumno(Session.getCurrentAlumn());
        Session.setCurrentActivity(activity);

        System.out.println(Session.getCurrentActivity());
        App.changeScene("studentProfileStudent-view.fxml","Detalles Alumno");
    }

    private Actividad newActivity() {
        Actividad a = new Actividad();
        a.setNombre(txtNombreActividad.getText());
        a.setHoras(spinnerHoras.getValue());
        a.setTipo(comboTipoPractica.getValue());
        a.setFecha(dpFecha.getValue());
        a.setObservaciones(txtObservaciones.getText());
        return a;
    }

    @javafx.fxml.FXML
    public void goToActivities(ActionEvent actionEvent) throws IOException {
        App.changeScene("studentProfileStudent-view.fxml","Detalles Alumno");

    }



}
