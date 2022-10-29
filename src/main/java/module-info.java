module com.example.redpandaorganizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens irnin.redpandaorganizer to javafx.fxml;
    exports irnin.redpandaorganizer;
    exports irnin.controlers;
    opens irnin.controlers to javafx.fxml;
}