package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;

import static com.example.retogrupalgestiontareas.controllers.TeacherProfileController.profile;


public class PassModalView {
    @javafx.fxml.FXML
    private PasswordField txtOldPass;
    @javafx.fxml.FXML
    private PasswordField txtNewPass;
    @javafx.fxml.FXML
    private PasswordField txtRepPass;

    @javafx.fxml.FXML
    private Button btnAceptar;
    @javafx.fxml.FXML
    private Button btnCancelar;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void accept(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void cancel(ActionEvent actionEvent) throws IOException {
        profile.close();
    }

}