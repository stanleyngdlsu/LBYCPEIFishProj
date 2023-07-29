package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MapController {
    private FishDictionary fishList = FishDictionary.getInstance();

    public FishApp app = new FishApp();
    public ListView <String> fishPerLocation;

    @FXML
    private void onBackButtonClick(ActionEvent event) throws IOException {
        app.changeScene("Main.fxml");
    }

    @FXML
    private void onGlobalButtonClick(ActionEvent event){
        String location = "Global";
        updateFishList(location);
    }

    @FXML
    private void onTropicalButtonClick(ActionEvent event){
        String location = "Tropical Seas";
        updateFishList(location);
    }
    @FXML
    private void onAtlanticButtonClick(ActionEvent event){
        String location = "Atlantic";
        updateFishList(location);
    }

    @FXML
    private void onPacificButtonClick(ActionEvent event){
        String location = "Pacific";
        updateFishList(location);
    }

    @FXML
    private void onIndoPacificButtonClick(ActionEvent event){
        String location = "Indo-Pacific";
        updateFishList(location);
    }

    @FXML
    private void onAustraliaButtonClick(ActionEvent event){
        String location = "Australia";
        updateFishList(location);
    }

    @FXML
    private void onSouthAmericaButtonClick(ActionEvent event){
        String location = "South America";
        updateFishList(location);
    }

    private void updateFishList(String location) {
        fishPerLocation.getItems().clear();
        for (int i = 0; i < fishList.getSize(); i++) {
            Fish fish = fishList.getFish(i);
            if (fish.getLocationLabel().equalsIgnoreCase(location)) {
                fishPerLocation.getItems().add(fish.getName());
            }
        }

        fishPerLocation.setOnMouseClicked(event -> {
            String selectedFish = fishPerLocation.getSelectionModel().getSelectedItem();
            if (selectedFish != null) {
                try {
                    onFishItemClick(selectedFish);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void onFishItemClick(String fishName) throws IOException {
        for (int i = 0; i < fishList.getSize(); i++) {
            Fish fish = fishList.getFish(i);
            if (fish.getName().equalsIgnoreCase(fishName)) {
                FishController.setSelectedFish(fish);
                app.changeScene("Fish.fxml");
                return;
            }
        }
    }
}
