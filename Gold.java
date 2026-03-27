class Gold {

    String brand;
    String type;
    double weight;
    int purity;
    boolean isHallmarked;
    double price;
    String countryOfOrigin;

    // constructor
    Gold(String brand, String type, double weight, int purity,
         boolean isHallmarked, double price, String countryOfOrigin) {

        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.purity = purity;
        this.isHallmarked = isHallmarked;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
    }

    // display method
    public void displayDetails() {
        System.out.println(brand);
        System.out.println(type);
        System.out.println(weight);
        System.out.println(purity);
        System.out.println(isHallmarked);
        System.out.println(price);
        System.out.println(countryOfOrigin);
        System.out.println("----------------------");
    }
}