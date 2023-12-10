package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.Session;
import com.example.retogrupalgestiontareas.domain.entities.teacher.Profesor;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TeacherProfileController {
    @javafx.fxml.FXML
    private TextField txtNombre;
    @javafx.fxml.FXML
    private TextField txtApellidos;
    @javafx.fxml.FXML
    private TextField txtEmail;

    @javafx.fxml.FXML
    private Button btnvolver;
    @javafx.fxml.FXML
    private Button btnLogOut;
    @javafx.fxml.FXML
    private Button btnPass;
    @javafx.fxml.FXML
    private Button btnSave;

    public static Stage profile = new Stage();

    @javafx.fxml.FXML
    public void initialize(){
        Profesor p = Session.getCurrentTeacher();

        txtNombre.setText(p.getNombre());
        txtApellidos.setText(p.getApellidos());
        txtEmail.setText(p.getEmail());

    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        App.changeScene("alumnList-view.fxml","Listado de Alumnos");
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        App.changeScene("login-view.fxml","Iniciar Sesión");
    }

    @javafx.fxml.FXML
    public void changePassword(ActionEvent actionEvent) throws IOException {
        //modal(profile);
        App.modal(profile,"passModal-view.fxml");
    }

    @javafx.fxml.FXML
    public void saveChanges(ActionEvent actionEvent) {
    }



}
