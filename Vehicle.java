package com.example.parkinglotapi.controller.model;

public class Vehicle {

    private String licensePlate;
    private String type;
    private boolean parked;

    public Vehicle(String licensePlate, String type) {

        // TODO
        this.licensePlate = licensePlate;
        this.type = type;



    }

    public String getLicensePlate() {

        // TODO
        return licensePlate;

    }

    public String getType() {

        // TODO
        return type;

    }

    public boolean isParked() {

        // TODO
        return parked;

    }

    public void setParked(boolean parked) {

        // TODO
        this.parked = parked;

    }

    public String toString(){
        return "License plate: " + licensePlate + " Type: " + type + " Parked: " + parked;

    }

}