package com.example.fish;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FishDictionary {
    private static FishDictionary instance;
    protected List<Fish> fishList;

    public FishDictionary() {
        fishList = new ArrayList<>();
        loadFromFile("src/main/resources/fish.txt"); // Assuming "fish.txt" is in the resources folder
    }

    public static FishDictionary getInstance() {
        if (instance == null) {
            instance = new FishDictionary();
        }
        return instance;
    }

    private void loadFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fishStats = line.split(","); // Limiting the split to 7 elements
                String name = fishStats[0];
                String sciencename = fishStats[1];
                String type = fishStats[2];
                String locationLabel = fishStats[3];
                String weight = fishStats[4];
                String length = fishStats[5];
                String status = fishStats[6];
                Fish fish = new Fish(name, sciencename, type, locationLabel, weight, length, status);
                fishList.add(fish);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    public int getSize() {
        return fishList.size();
    }

    public Fish getFish(int index) {
        return fishList.get(index);
    }

    public void remove(int index) {
        if (index >= 0 && index < fishList.size()) {
            fishList.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void addFish(Fish newFish){
        fishList.add(newFish);
    }

    public int searchFish(String name) {
        for (int i = 0; i < fishList.size(); i++) {
            if (fishList.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

}