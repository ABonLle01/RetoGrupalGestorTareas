module com.example.retogrupalgestiontareas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.retogrupalgestiontareas to javafx.fxml;
    exports com.example.retogrupalgestiontareas;
    exports com.example.retogrupalgestiontareas.controllers;
    opens com.example.retogrupalgestiontareas.controllers to javafx.fxml;
}