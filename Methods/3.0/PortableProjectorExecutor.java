class PortableProjectorExecutor {

    public static void main(String[] args) {

        String brand = PortableProjector.getBrand();
        System.out.println("Brand: " + brand);

        String resolution = PortableProjector.getResolution();
        System.out.println("Resolution: " + resolution);

        int brightness = PortableProjector.getBrightnessLumens();
        System.out.println("Brightness: " + brightness + " Lumens");

        String connectivity = PortableProjector.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        double price = PortableProjector.getPrice();
        System.out.println("Price: " + price);
    }
}