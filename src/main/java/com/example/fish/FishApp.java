package com.example.fish;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javafx.animation.FadeTransition;

/**Flow of the Classes:
 * As this program contains many classes, it may be difficult to differentiate what each does. Thus, the flow
 * of the classes will be as seen below.
 *
 * > Main Classes - containing the classes that create the stage, load data files, extract the needed data, and
 *                  design certain aspects of the app.
 *      - AbstractFish
 *      - Fish
 *      - FishDictionary
 *      - FishDesign
 *
 * > "Main" or Menu Controllers - the controller classes for the menu portions of the app.
 *      - MainMenu
 *      - ViewingMenu
 *      - LearnMenu
 *      - AddDeleteMenu
 *      - Login
 * > Sub-Controllers - these are controllers for the options that can be selected from the menu portions.
 *                     These can be seen as "sub" controllers as they are under a specific menu choice.
 *      - Under ViewingMenu
 *          - FishController
 *          - SlideshowController
 *          - MapController
 *      - Under AddDeleteMenu
 *          - AddController
 *          - DeleteController
 *      - Under LearnMenu
 *          - QuizController
 *          - QuizFinishController
 *          - SaveOceanController
 *      - SearchController (exemption as it is technically not part of a menu choice) **/

public class FishApp extends Application {

    private static Stage window;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setResizable(false);
        window.initStyle(StageStyle.UNDECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);
        scene.getStylesheets().add("design.css");
        window.setScene(scene);
        window.show();
    }

    public FXMLLoader changeScene(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        Parent root = fxmlLoader.load();

        Scene currentScene = window.getScene();
        Scene newScene = new Scene(root, 600, 400);
        newScene.getStylesheets().add("design.css");
        FadeTransition fadeOut = new FadeTransition(Duration.millis(500), currentScene.getRoot());
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setOnFinished(e -> {
            window.setScene(newScene);
            FadeTransition fadeIn = new FadeTransition(Duration.millis(500), newScene.getRoot());
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();
        });
        fadeOut.play();
        return fxmlLoader;
    }


    public static void main(String[] args) {
        launch();
    }
}
