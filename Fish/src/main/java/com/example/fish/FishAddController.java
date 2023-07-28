package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FishAddController {
    private FishDictionary fishList = FishDictionary.getInstance();

    public FishApp app = new FishApp();
    @FXML
    private TextField newName, newScienceName, newType, newLocation, newWeight, newLength, newStatus;

    @FXML
    private void initialize(){

    }

    @FXML
    private void onAddButtonClick(ActionEvent e){
        String name = newName.getText();
        String scienceName = newScienceName.getText();
        String type = newType.getText();
        String location = newLocation.getText();
        String weight = newWeight.getText();
        String length = newLength.getText();
        String status = newStatus.getText();
        Fish newFish = new Fish(name, scienceName, type, location, weight, length, status);
        fishList.addFish(newFish);
    }

    @FXML
    private void onBackButtonClick(ActionEvent event) throws IOException {
        app.changeScene("Main.fxml");
    }

}
