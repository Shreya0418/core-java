class TeddyBearExecutor {

    public static void main(String[] args) {

        String brand = TeddyBear.getBrand();
        System.out.println("Brand: " + brand);

        double price = TeddyBear.getPrice();
        System.out.println("Price: " + price);

        String color = TeddyBear.getColor();
        System.out.println("Color: " + color);

        String material = TeddyBear.getMaterial();
        System.out.println("Material: " + material);
    }
}