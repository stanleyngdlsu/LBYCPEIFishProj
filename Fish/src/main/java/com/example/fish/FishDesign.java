package com.example.fish;

import javafx.scene.image.*;

public class FishDesign {

    public static void createDesign(FishController controller, Fish fish) {
        controller.name.setText(fish.getName());
        controller.sciencename.setText(fish.getSciencename());
        controller.type.setText(fish.getType());
        controller.locationLabel.setText(fish.getLocationLabel());
        controller.weight.setText(fish.getWeight());
        controller.length.setText(fish.getLength());
        controller.status.setText(fish.getStatus());
        controller.fishImg.setImage(new Image("file:src/main/resources/FishImages/" + fish.getName()+".png"));
    }

    public static void createDesign(FishSlideshowController controller, Fish fish) {
        controller.name.setText(fish.getName());
        controller.sciencename.setText(fish.getSciencename());
        controller.type.setText(fish.getType());
        controller.locationLabel.setText(fish.getLocationLabel());
        controller.weight.setText(fish.getWeight());
        controller.length.setText(fish.getLength());
        controller.status.setText(fish.getStatus());
        controller.fishImg.setImage(new Image("file:src/main/resources/FishImages/" + fish.getName()+".png"));
    }
}

