class FlipFlopsExecutor {

    public static void main(String[] args) {

        String brand = FlipFlops.getBrand();
        System.out.println("Brand: " + brand);

        double price = FlipFlops.getPrice();
        System.out.println("Price: " + price);

        String material = FlipFlops.getMaterial();
        System.out.println("Material: " + material);

        String color = FlipFlops.getColor();
        System.out.println("Color: " + color);

        int size = FlipFlops.getSize();
        System.out.println("Size: " + size);
    }
}