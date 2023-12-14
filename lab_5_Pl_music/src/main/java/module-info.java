module com.example.pl_music {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.pl_music to javafx.fxml;
    exports com.example.pl_music;
}