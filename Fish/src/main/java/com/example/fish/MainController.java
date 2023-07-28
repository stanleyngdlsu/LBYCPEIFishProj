// MainController.java
package com.example.fish;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class MainController {

    public FishApp app = new FishApp();

    @FXML
    private void onViewOneButtonClick(ActionEvent event) throws IOException {
        app.changeScene("FishRandom.fxml");
    }

    @FXML
    private void onAddFishButtonClick(ActionEvent event) throws IOException {
        app.changeScene("AddFish.fxml");
    }

    @FXML
    private void onExit(ActionEvent e) {
        Platform.exit();
    }

}
