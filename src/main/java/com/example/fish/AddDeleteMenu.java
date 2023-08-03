package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class AddDeleteMenu {
    public FishApp app = new FishApp();
    @FXML
    private void onAddFishButtonClick(ActionEvent event) throws IOException {
        app.changeScene("AddFish.fxml");
    }
    @FXML
    private void onDeleteButtonClick(ActionEvent event) throws IOException {
        app.changeScene("Delete.fxml");
    }
    @FXML
    private void onReturnToMain(ActionEvent e) throws IOException {
        app.changeScene("Main.fxml");
    }

}
