package com.example.parkinglotapi.controller;

import com.example.parkinglotapi.controller.model.Vehicle;
import com.example.parkinglotapi.controller.service.VehicleService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehicleController {


    private VehicleService vehicleService;

    public VehicleController(
            VehicleService vehicleService) {

        this.vehicleService = vehicleService;

    }
    @GetMapping("/vehicles")
    public List<Vehicle> getVehicles() {
        return vehicleService.getVehicles();
    }

    @PostMapping("/vehicles")
    public Vehicle addVehicle(
            @RequestBody Vehicle vehicle) {
        vehicleService.addVehicle(vehicle);
        return vehicle;

    }
    @DeleteMapping("/vehicles/{plate}")
    public Vehicle removeVehicle(@PathVariable String plate){
        for (Vehicle vehicle : getVehicles()) {

            if (vehicle.getLicensePlate().equals(plate)) {
                getVehicles().remove(vehicle);
                return vehicleService.removeVehicle(plate);
            }

        }

        return null;
    }

    @GetMapping("/vehicles/{plate}")
    public Vehicle getVehicle(@PathVariable String plate) {

        for (Vehicle vehicle : getVehicles()) {

            if (vehicle.getLicensePlate().equals(plate)) {
                return vehicle;
            }

        }

        return null;
    }

    @PutMapping("/vehicles/{plate}")
    public Vehicle updateVehicle(@PathVariable String plate, @RequestBody Vehicle updatedVehicle){

        return vehicleService.updateVehicle(plate,
                updatedVehicle);
    }



}


