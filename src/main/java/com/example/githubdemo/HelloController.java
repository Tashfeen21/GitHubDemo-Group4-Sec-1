package com.example.githubdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField passwordField;
    @FXML
    private TextField userName;
    @FXML
    private Label msgLabel;

    @FXML
    public void onLoginButton(ActionEvent event) throws IOException {
        String username = userName.getText();
        String password = passwordField.getText();

        if (username.equals("asif") && password.equals("1234")) {
            msgLabel.setText("Log In Successfully");

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);


        }
        else {
            msgLabel.setText("Wrong username or password");
        }
    }
}