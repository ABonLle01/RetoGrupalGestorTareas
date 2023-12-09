package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.domain.entities.alumno.Alumno;
import com.example.retogrupalgestiontareas.domain.entities.alumno.AlumnoDAO;
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
            Alumno u = (new AlumnoDAO()).validateUser(email, pass);

            if (u == null) {
                info.setText("No encontrado");
                info.setStyle("-fx-text-fill: red;");
            } else {
                info.setText("Usuario: " + email + "(" + pass + ") correcto");
                info.setStyle("-fx-text-fill: green;");

                Session.setAlumnoLogged(u);



                try {
                    if(u.getRol().equals("Alumno")){
                        App.changeScene("addActivity-view.fxml","Añadir Actividad");
                    }else if(u.getRol().equals("Profesor")){
                        App.changeScene("alumnList-view.fxml","Añadir Actividad");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }


        }


//        if(u.getRol().equals("Alumno")){
//            App.changeScene("addActivity-view.fxml","Añadir Actividad");
//        }else if(u.getRol().equals("Profesor")){
//            App.changeScene("alumnList-view.fxml","Añadir Actividad");
//        }


    }





}