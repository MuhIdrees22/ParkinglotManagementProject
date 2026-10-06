import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<Vehicle> vehicles;
    private List<ParkingSpot> spots;
    private List<ParkingTicket> tickets;

    public ParkingLot() {

        // TODO
        this.vehicles = new ArrayList<>();
        this.spots = new ArrayList<>();
        this.tickets = new ArrayList<>();

    }

    public void addVehicle(Vehicle vehicle) {

        // TODO
        vehicles.add(vehicle);
        vehicles.add(vehicle);

    }

    public void addSpot(ParkingSpot spot) {

        // TODO
        spots.add(spot);

    }

    public void addTicket(ParkingTicket ticket) {

        // TODO
        tickets.add(ticket);

    }

    public Vehicle findVehicleByPlate(String plate) {

        for (Vehicle vehicle : vehicles) {

            // TODO
            if(vehicle.getLicensePlate().equals(plate)){
                return vehicle;
            }

        }

        return null;
    }

    public ParkingSpot findSpot(int number) {

        for (ParkingSpot spot : spots) {

            // TODO
            if(spot.getSpotNumber() == number){
                return spot;
            }

        }

        return null;
    }

    public ParkingTicket findTicket(int ticketId) {

        for (ParkingTicket ticket : tickets) {

            // TODO
            if (ticket.getTicketId() == ticketId){
                return ticket;
            }

        }

        return null;
    }

    public Vehicle removeVehicle(String plate) {

        for (Vehicle vehicle : vehicles) {

            // TODO
            if(vehicle.getLicensePlate().equals(plate)){
                vehicles.remove(vehicle);
            }
            return vehicle;

        }

        return null;
    }

    public ParkingSpot removeSpot(int number) {

        for (ParkingSpot spot : spots) {

            // TODO
            if(spot.getSpotNumber() == number){
                spots.remove(spot);

            }
            return spot;

        }

        return null;
    }

    public ParkingTicket removeTicket(int ticketId) {

        for (ParkingTicket ticket : tickets) {

            // TODO
            if(ticket.getTicketId() == ticketId){
                tickets.remove(ticket);
            }

        }

        return null;
    }

    public boolean vehicleExists(String plate) {

        for (Vehicle vehicle : vehicles) {

            // TODO
            if (vehicle.getLicensePlate().equals(plate)){
                return true;
            }

        }

        return false;
    }

    public boolean spotExists(int number) {

        for (ParkingSpot spot : spots) {

            // TODO
            if(spot.getSpotNumber() == number){
                return true;
            }

        }

        return false;
    }

    public int countOccupiedSpots() {

        int count = 0;

        for (ParkingSpot spot : spots) {

            // TODO
            if (spot.isOccupied()){
                count++;
            }

        }

        return count;
    }

    public int countAvailableSpots() {

        int count = 0;

        for (ParkingSpot spot : spots) {

            // TODO
            if(!spot.isOccupied()){
                count++;
            }

        }

        return count;
    }

    public int countParkedVehicles() {

        int count = 0;

        for (Vehicle vehicle : vehicles) {

            // TODO
            if(vehicle.isParked()){
                count++;
            }

        }

        return count;
    }

    public ParkingSpot findFirstAvailableSpot() {

        for (ParkingSpot spot : spots) {

            // TODO
            if(!spot.isOccupied()){
                return spot;
            }

        }

        return null;
    }

    public Vehicle findFirstParkedVehicle() {

        for (Vehicle vehicle : vehicles) {

            // TODO
            if(vehicle.isParked()){
                return vehicle;
            }

        }

        return null;
    }

    public Vehicle findFirstUnparkedVehicle() {

        for (Vehicle vehicle : vehicles) {

            // TODO
            if(!vehicle.isParked()){
                return vehicle;
            }

        }

        return null;
    }

    public boolean parkVehicle(String plate) {

        Vehicle vehicle = findVehicleByPlate(plate);

        ParkingSpot spot = findFirstAvailableSpot();

        // TODO
        if(vehicle == null){
            return false;
        }
        else {
            vehicle.setParked(true);
        }
        if(spot == null){
            return false;
        }
        else{
            spot.setOccupied(true);

        }

        return true;



    }

    public boolean unparkVehicle(String plate) {

        Vehicle vehicle = findVehicleByPlate(plate);

        // TODO
        if (vehicle == null){
            return false;
        }

        vehicle.setParked(false);


        return true;

    }


}