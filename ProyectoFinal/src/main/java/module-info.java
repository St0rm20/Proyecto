module co.edu.uniquindio.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.proyectofinal.app to javafx.fxml;
    opens co.edu.uniquindio.proyectofinal.controladores to javafx.fxml;

    exports co.edu.uniquindio.proyectofinal.app;
    exports co.edu.uniquindio.proyectofinal.controladores;
}