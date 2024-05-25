package co.edu.uniquindio.proyectofinal.controladores;

import co.edu.uniquindio.proyectofinal.modulo.empleados.Empleado;
import co.edu.uniquindio.proyectofinal.modulo.empleados.Mesero;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import  javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;


public class EmpleadoManagerController {
    private ObservableList<Empleado> empleados = FXCollections.observableArrayList();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button onActualizar;

    @FXML
    private Button onAgregar;

    @FXML
    private Button onEliminar;

    @FXML
    private TableColumn<Empleado, String> colApellido;

    @FXML
    private TableColumn<Empleado, String> colCelular;

    @FXML
    private TableColumn<Empleado, String> colDireccion;

    @FXML
    private TableColumn<Empleado, LocalDate> colFechaNacimiento;

    @FXML
    private TableColumn<Empleado, String>colID;
    @FXML
    private TableColumn<Empleado, String> colNombre;

    @FXML
    private TableColumn<Empleado, Double> colSueldo;

    @FXML
    private DatePicker getDateFechaNacimiento;

    @FXML
    private TextField getTextApellido;

    @FXML
    private TextField getTextCelular;

    @FXML
    private TextField getTextDireccion;

    @FXML
    private TextField getTextID;

    @FXML
    private TextField getTextNombre;

    @FXML
    private TextField getTextSueldo;

    @FXML
    private TableView<Empleado> tablaEmpleados;

    @FXML
    private Label textApellido;

    @FXML
    private Label textCelular;

    @FXML
    private Label textDireccion;

    @FXML
    private Label textFechaNacimiento;

    @FXML
    private Label textID;

    @FXML
    private Label textNombre;

    @FXML
    private Label textSueldo;

    @FXML
    void initialize() {

    }
    @FXML
    void onAgregar() {
        System.out.println("Listo");
    }


    private void agregarEmpleado(){
        Empleado empleado = new Mesero(getTextNombre    .getText(),
                getTextApellido  .getText(),
                getTextCelular   .getText(),
                getTextID        .getText(),
                getDateFechaNacimiento.getValue(),
                getTextDireccion .getText(),
                Double.parseDouble(getTextSueldo.getText()));
        empleados.add(empleado);
        empleados.get(0);

    }

}
