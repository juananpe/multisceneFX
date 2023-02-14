package eus.ehu.multiscenefx;

import eus.ehu.multiscenefx.controllers.FxController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MultiSceneApplication extends Application {

    private Window loginWindow;
    private Window mainMenu;

    class Window {
        Parent ui;
        FxController controller;
    }

    private Window load(String fxmlFile) throws IOException {
        Window window = new Window();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        window.ui = fxmlLoader.load();
        window.controller =  fxmlLoader.getController() ;
        window.controller.setMain(this);
        return window;
    }

    private Stage stage;
    private Scene scene;


    @Override
    public void start(Stage stage) throws IOException {

        this.stage = stage;

        loginWindow = load("login.fxml");
        mainMenu = load("main-menu.fxml");

        scene = new Scene( loginWindow.ui );
        stage.setTitle("Login");
        stage.setScene( scene );
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void changeScene(String sceneName) {
        switch (sceneName) {
            case "Login":
                stage.setTitle("Login");
                scene.setRoot(loginWindow.ui);
                break;
            case "Main Menu":
                stage.setTitle("Main Menu");
                scene.setRoot(mainMenu.ui);
                break;
        }
    }
}
