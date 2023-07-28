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
    private FishDictionary fishList = FishDictionary.getInstance();

    public FishApp app = new FishApp();
    public FishController fishC = new FishController();

    @FXML
    private void onViewOneButtonClick(ActionEvent event) throws IOException {
        Random rgen = new Random();
        int index = rgen.nextInt(fishList.getSize());
        fishC.setFish(fishList.getFish(index));
        app.changeScene("Fish.fxml");
    }

    @FXML
    private void onAddFishButtonClick(ActionEvent event) throws IOException {
        app.changeScene("AddFish.fxml");
    }

    @FXML
    private void onSearchFishButtonClick(ActionEvent event) throws IOException {
        app.changeScene("SearchFish.fxml");
    }

    @FXML
    public void onSlideshowButtonClick() throws IOException {
        app.changeScene("FishSlideshow.fxml");
    }


    @FXML
    private void onDeleteButtonClick(ActionEvent event) throws IOException {
        app.changeScene("Delete.fxml");
    }

    @FXML
    private void onExit(ActionEvent e) {
        Platform.exit();
    }

}
