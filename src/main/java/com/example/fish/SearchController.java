package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Random;

public class SearchController {
    @FXML
    private TextField fishName;

    @FXML
    private Label notif;
    private FishApp fishapp = new FishApp();

    private FishDictionary fishList = FishDictionary.getInstance();

    @FXML
    private ListView<String> fishes;

    @FXML
    public void initialize() {
        setName();
    }

    private void setName(){
        fishes.getItems().clear();
        for (int i = 0; i < fishList.getSize(); i++) {
            fishes.getItems().add(fishList.getFish(i).getName());
        }
    }

    @FXML
    private void onReturnToMain(ActionEvent e) throws IOException {
        fishapp.changeScene("Main.fxml");
    }


    public FishController display = new FishController();

    @FXML
    private void onSearchFish(ActionEvent e) throws IOException {
        int index = compareName(fishName.getText());
        if(index>=0) {
            display.setSelectedFish(fishList.getFish(index));
            fishapp.changeScene("Fish.fxml");
        }
        else{
            notif.setText("Error, Fish Not Found");
        }
    }

    private int compareName(String name) {
        for (int i = 0; i < fishList.getSize(); i++) {
            Fish fish = fishList.getFish(i);
            if (fish.getName().equalsIgnoreCase(name.trim())) {
                return i;
            }
        }
        return -1;
    }


}
