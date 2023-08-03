package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.Random;

public class ViewingMenu {
    public FishApp app = new FishApp();
    private FishDictionary fishList = FishDictionary.getInstance();
    public FishController display = new FishController();
    @FXML
    private void onViewOneButtonClick(ActionEvent event) throws IOException {
        Random rgen = new Random();
        int index = rgen.nextInt(fishList.getSize());
        display.setSelectedFish(fishList.getFish(index));
        app.changeScene("Fish.fxml");
    }

    @FXML
    public void onSlideshowButtonClick() throws IOException {
        app.changeScene("FishSlideshow.fxml");
    }

    @FXML
    private void onMapButtonClick(ActionEvent event) throws IOException {
        app.changeScene("Map.fxml");
    }

    @FXML
    private void onReturnToMain(ActionEvent e) throws IOException {
        app.changeScene("Main.fxml");
    }
}
