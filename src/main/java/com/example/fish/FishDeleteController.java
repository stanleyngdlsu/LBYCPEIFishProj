package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.List;

public class FishDeleteController {

    private FishDictionary fishList = FishDictionary.getInstance();
    private FishApp fishapp = new FishApp();

    @FXML
    private ListView<String> fishes;

    @FXML
    private TextField pick;

    @FXML
    private Label notif;

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

    private int compareName(String name) {
        for (int i = 0; i < fishList.getFishList().size(); i++) {
            Fish pokemon = getPokemonByNumber(i + 1);
            if (pokemon.getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    private Fish getPokemonByNumber(int number) {
        return fishList.getFishList().get(number - 1);
    }

    @FXML
    private void onBackButtonPress(ActionEvent event) throws IOException {
        fishapp.changeScene("Main.fxml");
    }

    @FXML
    private void onDeletePress(ActionEvent event) throws IOException {
        List<Fish> pokemonList = fishList.getFishList();

        int index = compareName(pick.getText());
        if (index >= 0 && index < pokemonList.size()) {
            pokemonList.remove(index);
            notif.setText("Fish Successfuly Removed");

        } else {
            notif.setText("Error, Fish not Found");
        }
        setName();
    }

}
