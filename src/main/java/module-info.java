module com.example.localizationdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.localizationdemo to javafx.fxml;
    exports com.example.localizationdemo;
}