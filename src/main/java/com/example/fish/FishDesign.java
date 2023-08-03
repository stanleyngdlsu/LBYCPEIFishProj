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
        if (fish.getImagePath() != null) {
            controller.fishImg.setImage(new Image("file:" + fish.getImagePath()));
        } else {
            controller.fishImg.setImage(new Image("file:src/main/resources/FishImages/" + fish.getName()+".png"));
        }
        controller.bgImg.setImage(new Image("file:src/main/resources/Background_Icons/"+fish.getLocationLabel()+".gif"));
    }

    public static void createDesign(SlideshowController controller, Fish fish) {
        controller.name.setText(fish.getName());
        controller.sciencename.setText(fish.getSciencename());
        controller.type.setText(fish.getType());
        controller.locationLabel.setText(fish.getLocationLabel());
        controller.weight.setText(fish.getWeight());
        controller.length.setText(fish.getLength());
        controller.status.setText(fish.getStatus());
        if (fish.getImagePath() != null) {
            controller.fishImg.setImage(new Image("file:" + fish.getImagePath()));
        } else {
            controller.fishImg.setImage(new Image("file:src/main/resources/FishImages/" + fish.getName()+".png"));
        }
        controller.bgImg.setImage(new Image("file:src/main/resources/Background_Icons/"+fish.getLocationLabel()+".gif"));
    }
}

