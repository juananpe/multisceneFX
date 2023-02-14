package eus.ehu.multiscenefx.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import eus.ehu.multiscenefx.MultiSceneApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController implements FxController {

    private MultiSceneApplication mainApp;

    @FXML
    void logout(ActionEvent event) {
        System.out.println("Logout");
        mainApp.changeScene("Login");
    }

    public void setMain(MultiSceneApplication multiSceneApplication) {
        this.mainApp = multiSceneApplication;
    }


    @FXML
    void initialize() {

    }

}
