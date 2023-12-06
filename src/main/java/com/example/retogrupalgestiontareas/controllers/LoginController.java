package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.domain.entities.user.Usuario;
import com.example.retogrupalgestiontareas.domain.entities.user.UsuarioDAO;
import com.example.retogrupalgestiontareas.Session;
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
        String email = txtEmail.getText();
        String pass = txtPassword.getText();

        if (email.length() < 4 || pass.length() < 4) {
            info.setText("Introduce datos de una longitud válida");
            info.setStyle("-fx-text-fill: red;");

        } else {
            Usuario u = (new UsuarioDAO()).validateUser(email, pass);

            if (u == null) {
                info.setText("No encontrado");
                info.setStyle("-fx-text-fill: red;");
            } else {
                info.setText("Usuario: " + email + "(" + pass + ") correcto");
                info.setStyle("-fx-text-fill: green;");

                /*Session.setCurrentUser(u);

                try {
                    App.changeScene("addActivity-view.fxml","Añadir Actividad");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }*/

            }

        }
    }





}