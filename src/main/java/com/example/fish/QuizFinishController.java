package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class QuizFinishController {


    @FXML
    private Label score;

    public void setCorrect(int correct) {
        score.setText(Integer.toString(correct));
    }
    @FXML
    private void onBackButtonClick(ActionEvent e){
        FishApp app = new FishApp();
        try {
            app.changeScene("Main.fxml");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
