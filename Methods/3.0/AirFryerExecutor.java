class AirFryerExecutor {

    public static void main(String[] args) {

        String brand = AirFryer.getBrand();
        System.out.println("Brand: " + brand);

        double price = AirFryer.getPrice();
        System.out.println("Price: " + price);

        int capacity = AirFryer.getCapacityLiters();
        System.out.println("Capacity: " + capacity + " Liters");

        String power = AirFryer.getPowerConsumption();
        System.out.println("Power Consumption: " + power);

        String color = AirFryer.getColor();
        System.out.println("Color: " + color);
    }
}