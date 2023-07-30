// MainController.java
package com.example.fish;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MainMenuController {
    private FishDictionary fishList = FishDictionary.getInstance();

    public FishApp app = new FishApp();
    public FishController fishC = new FishController();



    @FXML
    private void onSearchFishButtonClick(ActionEvent event) throws IOException {
        app.changeScene("SearchFish.fxml");
    }

    @FXML
    private void onViewFishButtonClick(ActionEvent event) throws IOException{
        app.changeScene("ViewingMenu.fxml");
    }


    @FXML
    private void onAddDeleteButtonClick(ActionEvent event) throws IOException {
        app.changeScene("AddRemoveMenu.fxml");
    }

    @FXML
    private void onExit(ActionEvent e) {
        Platform.exit();
    }

}
