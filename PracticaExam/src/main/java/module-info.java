module com.example.practicaexam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicaexam to javafx.fxml;
    opens com.example.practicaexam.modelo to javafx.fxml;
    opens com.example.practicaexam.controllers to javafx.fxml;
    exports com.example.practicaexam;
    exports com.example.practicaexam.modelo;
    exports com.example.practicaexam.controllers;
}