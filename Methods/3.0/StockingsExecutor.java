class StockingsExecutor {

    public static void main(String[] args) {

        String brand = Stockings.getBrand();
        System.out.println("Brand: " + brand);

        double price = Stockings.getPrice();
        System.out.println("Price: " + price);

        String color = Stockings.getColor();
        System.out.println("Color: " + color);

        String material = Stockings.getMaterial();
        System.out.println("Material: " + material);
    }
}