package com.example.fish;

public class Fish{
    private String name;

    private String sciencename;

    private String type;

    private String locationLabel;

    private String weight;

    private String length;

    private String status;
    private String imagePath;

    public Fish(String name, String sciencename, String type, String locationLabel, String weight, String length, String status) {
        this.name = name;
        this.sciencename = sciencename;
        this.type = type;
        this.locationLabel = locationLabel;
        this.weight = weight;
        this.length = length;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public String getSciencename() {
        return sciencename;
    }


    public String getType() {
        return type;
    }


    public String getLocationLabel() {
        return locationLabel;
    }


    public String getWeight() {
        return weight;
    }


    public String getLength() {
        return length;
    }


    public String getStatus() {
        return status;
    }
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSciencename(String sciencename) {
        this.sciencename = sciencename;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocationLabel(String locationLabel) {
        this.locationLabel = locationLabel;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
