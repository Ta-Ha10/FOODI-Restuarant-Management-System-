module com.example.designpattern1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires fontawesomefx;


    opens com.example.designpattern1 to javafx.fxml;
    exports com.example.designpattern1;
}