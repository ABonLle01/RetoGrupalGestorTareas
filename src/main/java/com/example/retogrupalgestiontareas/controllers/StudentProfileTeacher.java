package com.example.retogrupalgestiontareas.controllers;

import com.example.retogrupalgestiontareas.App;
import com.example.retogrupalgestiontareas.Session;
import com.example.retogrupalgestiontareas.domain.HibernateUtil;
import com.example.retogrupalgestiontareas.domain.entities.activity.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.activity.ActividadDAO;
import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import com.example.retogrupalgestiontareas.domain.entities.alumn.AlumnoDAO;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.hibernate.Transaction;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class StudentProfileTeacher {

    @javafx.fxml.FXML
    private TextField txtName;
    @javafx.fxml.FXML
    private TextField txtSurname;
    @javafx.fxml.FXML
    private TextField txtDualHours;
    @javafx.fxml.FXML
    private TextField txtFctHours;
    @javafx.fxml.FXML
    private TextField txtFctTotal;
    @javafx.fxml.FXML
    private TextField txtDualTotal;
    @javafx.fxml.FXML
    private TextField txtTutor;
    @javafx.fxml.FXML
    private PasswordField txtPass;
    @javafx.fxml.FXML
    private TextField txtDNI;
    @javafx.fxml.FXML
    private TextField txtBirth;
    @javafx.fxml.FXML
    private TextField txtPhone;
    @javafx.fxml.FXML
    private TextField txtEmail;
    @javafx.fxml.FXML
    private TextField txtEmpresa;

    @javafx.fxml.FXML
    private TableView<Actividad> table;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cName;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cHours;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cType;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cDate;
    @javafx.fxml.FXML
    private TableColumn<Actividad, String> cObservations;


    @javafx.fxml.FXML
    private Button btnObserv;
    @javafx.fxml.FXML
    private Button btnVerAlumnos;
    @javafx.fxml.FXML
    private Button btnGuardar;
    @javafx.fxml.FXML
    private Button btnActualizar;
    @javafx.fxml.FXML
    private Button btnEliminar;

    public static Stage obs = new Stage();

    private final ActividadDAO actividadDAO = new ActividadDAO();

    private final AlumnoDAO alumnoDAO = new AlumnoDAO();

    @javafx.fxml.FXML
    public void initialize(){
        Alumno a = Session.getCurrentAlumn();

        txtName.setText(a.getNombre());
        txtSurname.setText(a.getApellido());
        txtEmail.setText(a.getEmail());
        txtPass.setText(a.getPassword());
        txtDNI.setText(a.getDni());
        txtBirth.setText(a.getFecha_nac().toString());
        txtPhone.setText(a.getTelefono().toString());
        txtTutor.setText(a.getProfesor().getNombre());
        txtEmpresa.setText(a.getEmpresa().getNombre());
        txtDualHours.setText(a.getRestantesdual().toString());
        txtFctHours.setText(a.getRestantesfct().toString());
        txtDualTotal.setText(a.getTotalhorasdual().toString());
        txtFctTotal.setText(a.getTotalhorasfct().toString());


        cName.setCellValueFactory((fila)->
                new SimpleStringProperty(fila.getValue().getNombre())
        );

        cHours.setCellValueFactory((fila)->
                new SimpleStringProperty(fila.getValue().getHoras()+"")
        );

        cType.setCellValueFactory((fila)->
                new SimpleStringProperty(fila.getValue().getTipo())
        );

        cDate.setCellValueFactory((fila)->
                new SimpleStringProperty(fila.getValue().getFecha()+"")
        );

        cObservations.setCellValueFactory((fila)->
                new SimpleStringProperty(fila.getValue().getObservaciones())
        );

        List<Actividad> lista = actividadDAO.getAllByAlumno(Session.getCurrentAlumn());
        table.getItems().addAll(lista);

        table.getSelectionModel().selectedItemProperty().addListener(((observableValue, o, t1) -> {
            Session.setCurrentActivity(t1);
            System.out.println(Session.getCurrentActivity());
        }));

    }



    @javafx.fxml.FXML
    public void addObservations(ActionEvent actionEvent) throws IOException {
        App.modal(obs,"obsModal-view.fxml");
    }

    @javafx.fxml.FXML
    public void save(ActionEvent actionEvent) {
        Alumno alumno = Session.getCurrentAlumn();
        alumno.setNombre(txtName.getText());
        alumno.setApellido(txtSurname.getText());
        alumno.setEmail(txtEmail.getText());
        alumno.setPassword(txtPass.getText());
        alumno.setDni(txtDNI.getText());
        alumno.setFecha_nac(LocalDate.parse(String.valueOf(txtBirth.getText())));
        alumno.setTelefono(Integer.valueOf(txtPhone.getText()));
//      alumno.setProfesor(txtTutor.getText()); no funciona espera un objeto profesor
//      alumno.setEmpresa(txtEmpresa.getText()); no funciona, espera un objeto empresa
        alumno.setRestantesdual(Integer.valueOf(txtDualHours.getText()));
        alumno.setRestantesfct(Integer.valueOf(txtFctHours.getText()));
        alumno.setTotalhorasdual(Integer.valueOf(txtDualTotal.getText()));
        alumno.setTotalhorasfct(Integer.valueOf(txtFctHours.getText()));


        alumnoDAO.save(alumno);
        System.out.println("Alumno actualizado!!");
    }
    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void delete(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goToAlumns(ActionEvent actionEvent) throws IOException {
        App.changeScene("alumnList-view.fxml","Lista de Alumnos");
    }
}
