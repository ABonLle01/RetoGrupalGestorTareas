package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.Session;
import com.example.retogrupalgestiontareas.domain.entities.Usuario;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import com.example.retogrupalgestiontareas.domain.entities.alumn.AlumnoDAO;
import com.example.retogrupalgestiontareas.domain.entities.Usuario;
import com.example.retogrupalgestiontareas.domain.entities.teacher.Profesor;
import com.example.retogrupalgestiontareas.domain.entities.teacher.ProfesorDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.xml.transform.Source;
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
            if (Usuario.validateAlumn(email,pass)!=null){
                Alumno u = new AlumnoDAO().validateUser(email, pass);
                Session.setCurrentAlumn(u);
                App.changeScene("addActivity-view.fxml","Añadir Actividad");

            } else if (Usuario.validateTeacher(email,pass)!=null) {
                Profesor p = ProfesorDAO.validateTeacher(email, pass);
                Session.setCurrentTeacher(p);
                App.changeScene("alumnList-view.fxml","Añadir Actividad");

            }else {
                info.setText("El usuario no existe");
                info.setStyle("-fx-text-fill: red");
            }




        }

    }


}