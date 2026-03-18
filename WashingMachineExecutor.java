class WashingMachineExecutor {

    public static void main(String[] args) {

        String brand = WashingMachine.getBrand();
        System.out.println("Brand: " + brand);

        int capacity = WashingMachine.getCapacityKG();
        System.out.println("Capacity: " + capacity + " KG");

        String type = WashingMachine.getType();
        System.out.println("Type: " + type);

        int spinSpeed = WashingMachine.getSpinSpeedRPM();
        System.out.println("Spin Speed: " + spinSpeed + " RPM");

        double price = WashingMachine.getPrice();
        System.out.println("Price: " + price);
    }
}