package com.example.fish;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.io.IOException;

public class FishSlideshowController {
    @FXML
    public Label name;
    @FXML
    public Label sciencename;
    @FXML
    public Label type;
    @FXML
    public Label locationLabel;

    @FXML
    public Label weight;
    @FXML
    public Label length;
    @FXML
    public Label status;

    @FXML
    public ImageView fishImg;
    private int currentIndex = 0;
    private Timeline slideshowTimeline;
    private FishApp pokemonApp = new FishApp();
    private FishDictionary fishDict = FishDictionary.getInstance();


    @FXML
    private void onExit(ActionEvent e) {
        Platform.exit();
    }

    @FXML
    private void onReturnToMain(ActionEvent e) throws IOException {
        pokemonApp.changeScene("Main.fxml");
    }

    @FXML
    private void initialize(){
        viewAll();
    }


    public void createCard(Fish fish) {
        FishDesign.createDesign(this, fish);
    }

    public void viewAll() {
        currentIndex = 0;
        showNextPokemon();
        slideshowTimeline = new Timeline(new KeyFrame(Duration.seconds(1.15), e -> showNextPokemon()));
        slideshowTimeline.setCycleCount(fishDict.getSize());
        slideshowTimeline.play();
    }

    void stopSlideshow() {
        if (slideshowTimeline != null) {
            slideshowTimeline.stop();
        }
    }

    private void showNextPokemon() {
        if (currentIndex < fishDict.getSize()) {
            createCard(fishDict.getFish(currentIndex));
            currentIndex++;
        } else {
            stopSlideshow();
        }
    }
}