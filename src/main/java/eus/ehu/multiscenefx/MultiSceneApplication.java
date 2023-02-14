package eus.ehu.multiscenefx;

import eus.ehu.multiscenefx.controllers.FxController;
import eus.ehu.multiscenefx.controllers.MainMenuController;
import eus.ehu.multiscenefx.controllers.MultiSceneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MultiSceneApplication extends Application {

    class Window {
        Parent ui;
        FxController controller;
    }

    private Stage stage;
    private Scene scene;
    private Parent loginUI;
    private Parent mainUI;

    @Override
    public void start(Stage stage) throws IOException {

        this.stage = stage;

        FXMLLoader fxmlLoaderLogin = new FXMLLoader(MultiSceneApplication.class.getResource("login.fxml"));
        loginUI = fxmlLoaderLogin.load();
        MultiSceneController loginController = fxmlLoaderLogin.getController();
        loginController.setMain(  this  );

        FXMLLoader fxmlLoaderMain = new FXMLLoader(MultiSceneApplication.class.getResource("main-menu.fxml"));
        mainUI = fxmlLoaderMain.load();
        MainMenuController mainMenuController = fxmlLoaderMain.getController();
        mainMenuController.setMain(  this  );

        scene = new Scene( loginUI );
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
                scene.setRoot(loginUI);
                // stage.setScene(loginScene);
                break;
            case "Main Menu":
                stage.setTitle("Main Menu");
                scene.setRoot(mainUI);
                break;
        }
    }
}
