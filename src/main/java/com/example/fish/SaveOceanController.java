package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class SaveOceanController {

    FishApp app = new FishApp();
    @FXML
    private void onBack(ActionEvent event) throws IOException {
        app.changeScene("LearnMore.fxml");
    }
}
