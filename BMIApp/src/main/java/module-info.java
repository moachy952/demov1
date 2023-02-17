module com.thy.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.thy.bmiapp to javafx.fxml;
    exports com.thy.bmiapp;
}
