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
        this.stage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/addActivity-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 600);
        stage.setTitle("Iniciar Sesión");
        stage.setScene(scene);
        stage.show();
    }

    public static void  changeScene(String fxml, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/"+fxml));
        Scene scene = new Scene(fxmlLoader.load(), 750, 600);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
        System.out.println("branch");
        System.out.println("branch2");
        System.out.println("branch3");
        System.out.println("branch4");
        System.out.println("conocimiento");
        System.out.println("cositis");
        System.out.println("cositis2");
        System.out.println("botoncito");
    }


    public static void main(String[] args) {
        launch();
    }
}