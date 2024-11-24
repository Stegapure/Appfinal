module co.edu.poli.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens co.edu.poli.demo.controlador to javafx.fxml;
    opens co.edu.poli.demo.vista to javafx.fxml;
    exports co.edu.poli.demo.vista;
}
