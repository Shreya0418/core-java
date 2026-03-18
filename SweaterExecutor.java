class SweaterExecutor {

    public static void main(String[] args) {

        String brand = Sweater.getBrand();
        System.out.println("Brand: " + brand);

        String material = Sweater.getMaterial();
        System.out.println("Material: " + material);

        String fit = Sweater.getFitType();
        System.out.println("Fit Type: " + fit);

        String color = Sweater.getColor();
        System.out.println("Color: " + color);

        double price = Sweater.getPrice();
        System.out.println("Price: " + price);
    }
}