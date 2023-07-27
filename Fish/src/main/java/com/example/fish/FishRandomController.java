package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.Random;

public class FishRandomController {

    private FishDictionary fishList = FishDictionary.getInstance();

    public FishApp app = new FishApp();

    @FXML
    private Label name;
    @FXML
    private Label sciencename;
    @FXML
    private Label type;
    @FXML
    private Label locationLabel;

    @FXML
    private Label weight;
    @FXML
    private Label length;
    @FXML
    private Label status;

    @FXML
    private void initialize() {
        Fish fish = getRandomFish();
        setname(fish.getName());
        setsciencename(fish.getSciencename());
        settype(fish.getType());
        setLocationLabel(fish.getLocationLabel());
        setweight(fish.getWeight());
        setlength(fish.getLength());
        setstatus(fish.getStatus());
    }

    private Fish getRandomFish() {
        if (fishList.getSize() > 0) {
            Random random = new Random();
            int randomNumber = random.nextInt(fishList.getSize());
            return fishList.getFish(randomNumber);
        } else {
            // Handle the case when fishList is empty
            return new Fish("No Fish Available", "", "", "", "", "", "");
        }
    }

    public void setname(String message) {
        name.setText(message);
    }

    public void setsciencename(String message) {
        sciencename.setText(message);
    }

    public void settype(String message) {
        type.setText(message);
    }

    public void setLocationLabel(String message) {
        locationLabel.setText(message);
    }

    public void setweight(String message) {
        weight.setText(message);
    }

    public void setlength(String message) {
        length.setText(message);
    }

    public void setstatus(String message) {
        status.setText(message);
    }

    @FXML
    private void onBackButtonClick(ActionEvent event) throws IOException {
        app.changeScene("Main.fxml");
    }
}