module com.example.retogrupalgestiontareas {
    requires javafx.controls;
    requires javafx.fxml;

    requires lombok;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;


    opens com.example.retogrupalgestiontareas to javafx.fxml;
    opens com.example.retogrupalgestiontareas.controllers to javafx.fxml;

    opens com.example.retogrupalgestiontareas.domain.entities.user;
    opens com.example.retogrupalgestiontareas.domain.entities;

    exports com.example.retogrupalgestiontareas;
    exports com.example.retogrupalgestiontareas.controllers;
}