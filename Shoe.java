class Shoe {
    
    String brand;
    String material;
    String closureType;
    String heelType;
    double price;
    String style;
    int quantity;
    String weight;

    Shoe(String brand, String material, String closureType, String heelType,
         double price, String style, int quantity, String weight) {

        this.brand = brand;
        this.material = material;
        this.closureType = closureType;
        this.heelType = heelType;
        this.price = price;
        this.style = style;
        this.quantity = quantity;
        this.weight = weight;
    }

    public void displayDetails() {
        System.out.println(brand);
        System.out.println(material);
        System.out.println(closureType);
        System.out.println(heelType);
        System.out.println(price);
        System.out.println(style);
        System.out.println(quantity);
        System.out.println(weight);
        System.out.println("----------------------");
    }
}