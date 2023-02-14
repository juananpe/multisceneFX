package eus.ehu.multiscenefx.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import eus.ehu.multiscenefx.MultiSceneApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MultiSceneController implements FxController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField userField;
    private MultiSceneApplication mainApp;

    @FXML
    void loginAction(ActionEvent event) {
        String user = userField.getText();
        String password = passwordField.getText();
        System.out.println("User: " + user);
        System.out.println("Password: " + password);

        // call the next scene
        mainApp.changeScene("Main Menu");
    }

    @FXML
    void initialize() {

    }

    public void setMain(MultiSceneApplication multiSceneApplication) {
        this.mainApp = multiSceneApplication;
    }
}
