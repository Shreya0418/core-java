class Bag {

    String brand;
    String type;
    String color;
    boolean isWaterproof;
    boolean hasLaptopCompartment;
    boolean isLightWeight;
    double price;

    Bag(String brand, String type, String color,
        boolean isWaterproof, boolean hasLaptopCompartment,
        boolean isLightWeight, double price) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.isWaterproof = isWaterproof;
        this.hasLaptopCompartment = hasLaptopCompartment;
        this.isLightWeight = isLightWeight;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(brand);
        System.out.println(type);
        System.out.println(color);
        System.out.println(isWaterproof);
        System.out.println(hasLaptopCompartment);
        System.out.println(isLightWeight);
        System.out.println(price);
        System.out.println("----------------------");
    }
}