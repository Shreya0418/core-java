class HairDryerExecutor {

    public static void main(String[] args) {

        String brand = HairDryer.getBrand();
        System.out.println("Brand: " + brand);

        String model = HairDryer.getModel();
        System.out.println("Model: " + model);

        double price = HairDryer.getPrice();
        System.out.println("Price: " + price);

        String power = HairDryer.getPower();
        System.out.println("Power: " + power);

        int heat = HairDryer.getHeatSettings();
        System.out.println("Heat Settings: " + heat);

        int speed = HairDryer.getSpeedSettings();
        System.out.println("Speed Settings: " + speed);

        double weight = HairDryer.getWeightInGrams();
        System.out.println("Weight: " + weight + " grams");

        String tech = HairDryer.getTechnology();
        System.out.println("Technology: " + tech);

        String cord = HairDryer.getCordLength();
        System.out.println("Cord Length: " + cord);

        String warranty = HairDryer.getWarranty();
        System.out.println("Warranty: " + warranty);
    }
}