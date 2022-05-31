module com.example.jdbc_labb1 {

    requires java.sql;
    requires javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.jdbc_labb1 to javafx.base, javafx.fxml;
    opens com.example.jdbc_labb1.model to javafx.base;
    exports com.example.jdbc_labb1;
    opens com.example.jdbc_labb1.view to javafx.base;
}