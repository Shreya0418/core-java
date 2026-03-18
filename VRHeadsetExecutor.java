class VRHeadsetExecutor {

    public static void main(String[] args) {

        String brand = VRHeadset.getBrand();
        System.out.println("Brand: " + brand);

        double price = VRHeadset.getPrice();
        System.out.println("Price: " + price);

        String model = VRHeadset.getModel();
        System.out.println("Model: " + model);

        String resolution = VRHeadset.getResolution();
        System.out.println("Resolution: " + resolution);

        int storage = VRHeadset.getStorageGB();
        System.out.println("Storage: " + storage + " GB");
    }
}