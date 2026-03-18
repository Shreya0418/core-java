class GuitarExecutor {

    public static void main(String[] args) {

        String brand = Guitar.getBrand();
        System.out.println("Brand: " + brand);

        String type = Guitar.getType();
        System.out.println("Type: " + type);

        int strings = Guitar.getNumberOfStrings();
        System.out.println("Number of Strings: " + strings);

        String material = Guitar.getBodyMaterial();
        System.out.println("Body Material: " + material);

        double price = Guitar.getPrice();
        System.out.println("Price: " + price);
    }
}