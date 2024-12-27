module com.example.bancocliente {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bancocliente to javafx.fxml;
    exports com.example.bancocliente;
}