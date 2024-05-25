package co.edu.uniquindio.proyectofinal.app;

import co.edu.uniquindio.proyectofinal.modulo.cafeteria.Cafeteria;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/proyectofinal/EmpleadoManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Cafetería");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Cafeteria cafeteria = Cafeteria.getInstance();
        launch();
    }
}