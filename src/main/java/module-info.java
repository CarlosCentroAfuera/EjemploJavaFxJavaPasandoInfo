module com.example.ejemplojavafxjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.ejemplojavafxjava to javafx.fxml;
    exports com.example.ejemplojavafxjava;
}