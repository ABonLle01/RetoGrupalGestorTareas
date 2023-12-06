package com.example.retogrupalgestiontareas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Stage stage;


    @Override
    public void start(Stage stage) throws IOException {
        App.stage =stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 600);
        stage.setTitle("Iniciar Sesión");
        stage.setScene(scene);
        stage.show();
    }

    public static void changeScene(String fxml, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/"+fxml));
        Scene scene = new Scene(fxmlLoader.load(), 750, 600);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();

    }

    //este método abre una nueva ventana de un tamaño más reducido,simulando un modal
    //hay que pasarle por parámetros el stage y el archivo fxml.
    public static void modal(Stage stage, String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/"+fxml));
        Scene scene = new Scene(fxmlLoader.load(), 450, 300);
        stage.setTitle("Cambiar contraseña");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}