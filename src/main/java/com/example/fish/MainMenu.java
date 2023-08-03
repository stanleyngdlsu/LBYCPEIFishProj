// MainController.java
package com.example.fish;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MainMenu {

    public FishApp app = new FishApp();


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
    private void onLearnMoreButtonClick(ActionEvent event) throws IOException {
        app.changeScene("LearnMore.fxml");
    }

    @FXML
    private void onLogout(ActionEvent event) throws IOException{
        app.changeScene("Login.fxml");
    }

    @FXML
    private void onExit(ActionEvent e) {
        Platform.exit();
    }

}
