class ScrunchieExecutor {

    public static void main(String[] args) {

        String brand = Scrunchie.getBrand();
        System.out.println("Brand: " + brand);

        double price = Scrunchie.getPrice();
        System.out.println("Price: " + price);

        String material = Scrunchie.getMaterial();
        System.out.println("Material: " + material);

        String color = Scrunchie.getColor();
        System.out.println("Color: " + color);

        String size = Scrunchie.getSize();
        System.out.println("Size: " + size);
    }
}