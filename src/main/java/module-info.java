module com.example.githubdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.githubdemo to javafx.fxml;
    exports com.example.githubdemo;
}