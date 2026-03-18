class DroneExecutor {

    public static void main(String[] args) {

        String brand = Drone.getBrand();
        System.out.println("Brand: " + brand);

        double price = Drone.getPrice();
        System.out.println("Price: " + price);

        String camera = Drone.getCameraQuality();
        System.out.println("Camera Quality: " + camera);

        int flightTime = Drone.getFlightTimeMinutes();
        System.out.println("Flight Time: " + flightTime + " minutes");

        String range = Drone.getControlRange();
        System.out.println("Control Range: " + range);
    }
}