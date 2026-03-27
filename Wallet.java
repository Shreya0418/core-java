class Wallet {

    String brand;
    String material;
    String color;
    String type;
    String closureType;
    int numberOfCompartments;
    double price;
    int quality;

    Wallet(String brand, String material, String color, String type,
           String closureType, int numberOfCompartments, double price, int quality) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.closureType = closureType;
        this.numberOfCompartments = numberOfCompartments;
        this.price = price;
        this.quality = quality;
    }

    public void displayDetails() {
        System.out.println(brand);
        System.out.println(material);
        System.out.println(color);
        System.out.println(type);
        System.out.println(closureType);
        System.out.println(numberOfCompartments);
        System.out.println(price);
        System.out.println(quality);
        System.out.println("----------------------");
    }
}