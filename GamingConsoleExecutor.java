class GamingConsoleExecutor {

    public static void main(String[] args) {

        String brand = GamingConsole.getBrand();
        System.out.println("Brand: " + brand);

        String model = GamingConsole.getModel();
        System.out.println("Model: " + model);

        int storage = GamingConsole.getStorageGB();
        System.out.println("Storage: " + storage + " GB");

        String resolution = GamingConsole.getResolutionSupport();
        System.out.println("Resolution: " + resolution);

        double price = GamingConsole.getPrice();
        System.out.println("Price: " + price);
    }
}