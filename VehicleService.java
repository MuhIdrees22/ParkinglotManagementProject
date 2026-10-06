package com.example.parkinglotapi.controller.service;

import com.example.parkinglotapi.controller.model.Vehicle;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {
    private List<Vehicle> vehicles = new ArrayList<>();
    public List<Vehicle> getVehicles(){
        return vehicles;
    }

    public Vehicle addVehicle(Vehicle vehicle) {

        // YOU FILL
        vehicles.add(vehicle);

        return vehicle;


    }
    public Vehicle removeVehicle(String plate) {

        // move your loop here
        for (Vehicle vehicle : getVehicles()) {

            if (vehicle.getLicensePlate().equals(plate)) {
                getVehicles().remove(vehicle);
                return vehicle;
            }

        }
        return null;

    }
    public Vehicle updateVehicle(String plate, Vehicle updatedVehicle) {
        for (Vehicle vehicle: getVehicles()){
            if (vehicle.getLicensePlate().equals(plate)){
                vehicle.setParked(updatedVehicle.isParked());
                return vehicle;
            }
        }
        return null;

    }


}
