package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class  LoginController {

    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnAcceder;
    @FXML
    private Label info;



    @FXML
    public void login(ActionEvent actionEvent) throws IOException {
        App.changeScene("addAlumn-view.fxml","Añadir Actividad");
    }
}