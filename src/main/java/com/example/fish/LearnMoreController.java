package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LearnMoreController {
    public FishApp app = new FishApp();

    @FXML
    private void onQuizButtonClick(ActionEvent event) throws IOException{
        app.changeScene("Quiz.fxml");
    }

    @FXML
    private void onEnvironmentClick(ActionEvent event) throws IOException{
        app.changeScene("SaveOcean.fxml");
    }

    @FXML
    private void onReturnToMain(ActionEvent e) throws IOException {
        app.changeScene("Main.fxml");
    }
}
