package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.io.IOException;

public class QuizFinishController {

    FishApp app = new FishApp();
    @FXML
    Text Correct;


    public void setCorrect(int correct) {
        Correct.setText(Integer.toString(correct));
    }
    @FXML
    private void onBackButtonClick(ActionEvent e){
        try {
            app.changeScene("Main.fxml");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


}
