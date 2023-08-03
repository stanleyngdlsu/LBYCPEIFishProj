package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class SaveOceanController {

    @FXML
    private void onBack(ActionEvent event) throws IOException {
        FishApp app = new FishApp();
        app.changeScene("LearnMore.fxml");
    }
}
