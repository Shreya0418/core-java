class USBExecutor {

    public static void main(String[] args) {

        String brand = USB.getBrand();
        System.out.println("Brand: " + brand);

        double price = USB.getPrice();
        System.out.println("Price: " + price);

        int capacity = USB.getStorageCapacityGB();
        System.out.println("Storage Capacity: " + capacity + "GB");

        String type = USB.getType();
        System.out.println("Type: " + type);
    }
}