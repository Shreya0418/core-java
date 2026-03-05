class UnicycleExecutor {

    public static void main(String[] args) {

        String brand = Unicycle.getBrand();
        System.out.println("Brand: " + brand);

        int wheelSize = Unicycle.getWheelSizeInches();
        System.out.println("Wheel Size: " + wheelSize + " Inches");

        String material = Unicycle.getFrameMaterial();
        System.out.println("Frame Material: " + material);

        String type = Unicycle.getType();
        System.out.println("Type: " + type);

        double price = Unicycle.getPrice();
        System.out.println("Price: " + price);
    }
}