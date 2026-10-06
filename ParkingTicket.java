package com.example.parkinglotapi.controller.model;

public class ParkingTicket {

    private int ticketId;
    private String licensePlate;
    private double fee;

    public ParkingTicket(
            int ticketId,
            String licensePlate) {

        // TODO
        this.ticketId = ticketId;
        this.licensePlate = licensePlate;

    }

    public int getTicketId() {

        // TODO
        return ticketId;


    }

    public String getLicensePlate() {

        // TODO
        return licensePlate;

    }

    public double getFee() {

        // TODO
        return fee;

    }

    public void setFee(double fee) {

        // TODO
        this.fee = fee;

    }

}