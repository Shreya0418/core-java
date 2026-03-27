class Mascara {

    String brand;
    String type;
    String color;
    boolean isWaterproof;
    boolean isSmudgeProof;
    boolean isLongLasting;
    double price;
    String countryOfOrign;

    // constructor
    Mascara(String brand, String type, String color,
            boolean isWaterproof, boolean isSmudgeProof,
            boolean isLongLasting, double price, String countryOfOrign) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.isWaterproof = isWaterproof;
        this.isSmudgeProof = isSmudgeProof;
        this.isLongLasting = isLongLasting;
        this.price = price;
        this.countryOfOrign = countryOfOrign;
    }

    // display method
    public void displayDetails() {
        System.out.println(brand);
        System.out.println(type);
        System.out.println(color);
        System.out.println(isWaterproof);
        System.out.println(isSmudgeProof);
        System.out.println(isLongLasting);
        System.out.println(price);
        System.out.println(countryOfOrign);
        System.out.println("----------------------");
    }
}