package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.Session;
import com.example.retogrupalgestiontareas.domain.entities.alumn.AlumnoDAO;
import com.example.retogrupalgestiontareas.domain.entities.company.Empresa;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.*;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class AlumnListController {
    @javafx.fxml.FXML
    private MenuItem miAddEnterprise;
    @javafx.fxml.FXML
    private MenuItem miEnterpriseList;
    @javafx.fxml.FXML
    private MenuItem miProfile;

    @javafx.fxml.FXML
    private TableView<Alumno> tblAlumnos;
    @javafx.fxml.FXML
    private TableColumn<Alumno, String> cNombre;
    @javafx.fxml.FXML
    private TableColumn<Alumno, String> cApellidos;
    @javafx.fxml.FXML
    private TableColumn<Alumno, String> cEmpresa;
    @javafx.fxml.FXML
    private TableColumn<Alumno, String> cHorasRestantes;

    private final AlumnoDAO alumnoDAO = new AlumnoDAO();

    @javafx.fxml.FXML
    public void initialize() {
        Session.setCurrentCompany(null);

        cNombre.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getNombre())
        );

        cApellidos.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getApellido())
        );

        cEmpresa.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getEmpresa().getNombre())
        );

        //he puesto las horas de dual totales
        //habrá que cambiarlo
        cHorasRestantes.setCellValueFactory((fila)->
            new SimpleStringProperty(fila.getValue().getTotalhorasdual()+"")
        );


        List<Alumno> lista = alumnoDAO.getAll(Math.toIntExact(Session.getCurrentTeacher().getId_profesor()));
        tblAlumnos.getItems().addAll(lista);


        tblAlumnos.getSelectionModel().selectedItemProperty().addListener(((observableValue, alumno, t1) -> {
            Session.setCurrentAlumn(t1);
            System.out.println(Session.getCurrentAlumn());
            try {
                App.changeScene("studentProfileTeacher-view.fxml","Perfil del Alumno");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));


    }


    @javafx.fxml.FXML
    public void addEnterprise(ActionEvent actionEvent) throws IOException {
        App.changeScene("addEnterprise-view.fxml","Añadir Empresa");
    }

    @javafx.fxml.FXML
    public void gotToEnterpriseList(ActionEvent actionEvent) throws IOException {
        App.changeScene("enterpriseList-view.fxml","Lista de Empresas");
    }

    @javafx.fxml.FXML
    public void goToProfile(ActionEvent actionEvent) throws IOException {
        App.changeScene("teacherProfile-view.fxml","Perfil del Profesor");
    }


}
