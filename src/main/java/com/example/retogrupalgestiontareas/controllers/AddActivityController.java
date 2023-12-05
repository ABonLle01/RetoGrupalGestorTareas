package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

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

    @javafx.fxml.FXML
    public void addActivity(ActionEvent actionEvent) throws IOException {
        App.changeScene("studentProfileStudent-view.fxml","Detalles Alumno");
    }

    @javafx.fxml.FXML
    public void goToActivities(ActionEvent actionEvent) throws IOException {
        App.changeScene("studentProfileStudent-view.fxml","Detalles Alumno");

    }
}
