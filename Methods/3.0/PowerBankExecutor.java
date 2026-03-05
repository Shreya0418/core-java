class PowerBankExecutor {

    public static void main(String[] args) {

        String brand = PowerBank.getBrand();
        System.out.println("Brand: " + brand);

        double price = PowerBank.getPrice();
        System.out.println("Price: " + price);

        int capacity = PowerBank.getCapacitymAh();
        System.out.println("Capacity: " + capacity + " mAh");

        String color = PowerBank.getColor();
        System.out.println("Color: " + color);
    }
}