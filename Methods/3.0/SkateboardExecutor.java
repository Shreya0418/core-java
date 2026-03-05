class SkateboardExecutor {

    public static void main(String[] args) {

        String brand = Skateboard.getBrand();
        System.out.println("Brand: " + brand);

        String material = Skateboard.getDeckMaterial();
        System.out.println("Deck Material: " + material);

        int wheelSize = Skateboard.getWheelSizeMM();
        System.out.println("Wheel Size: " + wheelSize + " mm");

        String type = Skateboard.getBoardType();
        System.out.println("Board Type: " + type);

        double price = Skateboard.getPrice();
        System.out.println("Price: " + price);
    }
}