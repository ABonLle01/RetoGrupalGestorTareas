package com.example.retogrupalgestiontareas.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    public void addActivity(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goToActivities(ActionEvent actionEvent) {
    }
}
