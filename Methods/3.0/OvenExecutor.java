class OvenExecutor {

    public static void main(String[] args) {

        String brand = Oven.getBrand();
        System.out.println("Brand: " + brand);

        int capacity = Oven.getCapacityLiters();
        System.out.println("Capacity: " + capacity + " Liters");

        String type = Oven.getType();
        System.out.println("Type: " + type);

        String power = Oven.getPowerConsumption();
        System.out.println("Power Consumption: " + power);

        double price = Oven.getPrice();
        System.out.println("Price: " + price);
    }
}