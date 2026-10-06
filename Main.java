public class Main {

    public static void main(String[] args) {

       ParkingLot lot = new ParkingLot();

        Vehicle vehicle = new Vehicle("LGH123", "Car");
        Vehicle vehicle2 = new Vehicle("AHZ456", "Truck");

        ParkingSpot spot1 = new ParkingSpot(1);
        ParkingSpot spot2 = new ParkingSpot(2);



        ParkingTicket ticket1 = new ParkingTicket(1, "ABC123");

        // TODO
        // Add vehicles
        lot.addVehicle(vehicle);
        lot.addVehicle(vehicle2);

        // TODO
        // Add spots
        lot.addSpot(spot1);
        lot.addSpot(spot2);

        // TODO
        // Add ticket
        lot.addTicket(ticket1);

        // TODO
        // Test all methods
        Vehicle found = lot.findVehicleByPlate("LGH123");
        System.out.println(found.getLicensePlate());

        Vehicle found2 = lot.findVehicleByPlate("AHZ456");
        System.out.println(found2.getLicensePlate());

        ParkingSpot spot = lot.findSpot(1);
        System.out.println(spot.getSpotNumber());

        ParkingSpot Spot = lot.findSpot(2);
        System.out.println(Spot.getSpotNumber());


        System.out.println(lot.removeVehicle("AHZ456"));

        lot.vehicleExists("LGH123");
        System.out.println(lot.vehicleExists("LGH123"));

        spot1.setOccupied(true);
        System.out.println(lot.countOccupiedSpots());

     lot.parkVehicle("LGH123");

     Vehicle car = lot.findVehicleByPlate("LGH123");
     System.out.println(car.isParked());


    }

}