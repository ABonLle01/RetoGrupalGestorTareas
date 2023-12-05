package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TeacherProfileController {
    @javafx.fxml.FXML
    private Button btnvolver;
    @javafx.fxml.FXML
    private Button btnLogOut;
    @javafx.fxml.FXML
    private TextField txtNombre;
    @javafx.fxml.FXML
    private TextField txtApellidos;
    @javafx.fxml.FXML
    private TextField txtEmail;
    @javafx.fxml.FXML
    private Button btnPass;
    @javafx.fxml.FXML
    private Button btnSave;

    public static Stage profile = new Stage();

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
        modal(profile);

    }

    @javafx.fxml.FXML
    public void saveChanges(ActionEvent actionEvent) {
    }

    public void modal(Stage stage) throws IOException {
        this.profile=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/passModal-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 300);
        profile.setTitle("Cambiar contraseña");
        profile.setScene(scene);
        profile.show();
    }

}
