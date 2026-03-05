class IWatchExecutor {

    public static void main(String[] args) {

        String brand = IWatch.getBrand();
        System.out.println("Brand: " + brand);

        double price = IWatch.getPrice();
        System.out.println("Price: " + price);

        String model = IWatch.getModel();
        System.out.println("Model: " + model);

        String display = IWatch.getDisplayType();
        System.out.println("Display Type: " + display);

        int battery = IWatch.getBatteryLifeHours();
        System.out.println("Battery Life (Hours): " + battery);
    }
}