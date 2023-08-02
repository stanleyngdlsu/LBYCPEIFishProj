module com.example.fish {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.fish to javafx.fxml;
    exports com.example.fish;
}