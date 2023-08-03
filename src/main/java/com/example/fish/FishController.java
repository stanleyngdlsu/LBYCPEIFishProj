package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;


public class FishController extends FishDesign{

    public FishApp app = new FishApp();
    public static Fish selectedFish;

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
    @FXML
    public ImageView bgImg;

    @FXML
    private void initialize() {
       createDesign(this, selectedFish);
    }

    public static void setSelectedFish(Fish fish){
        selectedFish = fish;
    }

    @FXML
    private void onBackButtonClick(ActionEvent event) throws IOException {
        app.changeScene("Main.fxml");
    }
}
