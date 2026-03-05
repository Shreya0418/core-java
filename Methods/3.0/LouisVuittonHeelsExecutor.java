class LouisVuittonHeelsExecutor {

    public static void main(String[] args) {

        String brand = LouisVuittonHeels.getBrand();
        System.out.println("Brand: " + brand);

        double price = LouisVuittonHeels.getPrice();
        System.out.println("Price: " + price);

        String heelType = LouisVuittonHeels.getHeelType();
        System.out.println("Heel Type: " + heelType);

        String material = LouisVuittonHeels.getMaterial();
        System.out.println("Material: " + material);

        String color = LouisVuittonHeels.getColor();
        System.out.println("Color: " + color);
    }
}