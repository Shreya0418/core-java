class SunScreen {

    String brand;
    int spf;
    String type;
    String skinType;
    boolean isWaterResistant;
    boolean isDermatologistTested;
    double price;

    SunScreen(String brand, int spf, String type, String skinType,
              boolean isWaterResistant, boolean isDermatologistTested, double price) {

        this.brand = brand;
        this.spf = spf;
        this.type = type;
        this.skinType = skinType;
        this.isWaterResistant = isWaterResistant;
        this.isDermatologistTested = isDermatologistTested;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(brand);
        System.out.println(spf);
        System.out.println(type);
        System.out.println(skinType);
        System.out.println(isWaterResistant);
        System.out.println(isDermatologistTested);
        System.out.println(price);
        System.out.println("----------------------");
    }
}