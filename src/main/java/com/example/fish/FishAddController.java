package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

import java.io.IOException;

public class FishAddController {
    private FishDictionary fishList = FishDictionary.getInstance();

    public FishApp app = new FishApp();
    @FXML
    private TextField newName, newScienceName, newType, newLocation, newWeight, newLength, newStatus;
    @FXML
    private Label prompt;
    private String imagePath;

    @FXML
    private void onUploadImageClick(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        Stage stage = new Stage();
        File selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            imagePath = selectedFile.getAbsolutePath();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Image not selected.");
            alert.showAndWait();
        }
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
        newFish.setImagePath(imagePath);
        fishList.addFish(newFish);
        prompt.setText("Fish added!");
    }

    @FXML
    private void onBackButtonClick(ActionEvent event) throws IOException {
        app.changeScene("Main.fxml");
    }

}
