class Flower {

    String name;
    String color;
    String fragrance;
    int numberOfPetals;
    boolean isSeasonal;
    double price;
    String countryOfOrigin;

    // constructor
    Flower(String name, String color, String fragrance, int numberOfPetals,
           boolean isSeasonal, double price, String countryOfOrigin) {

        this.name = name;
        this.color = color;
        this.fragrance = fragrance;
        this.numberOfPetals = numberOfPetals;
        this.isSeasonal = isSeasonal;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
    }

    // display method
    public void displayDetails() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(fragrance);
        System.out.println(numberOfPetals);
        System.out.println(isSeasonal);
        System.out.println(price);
        System.out.println(countryOfOrigin);
        System.out.println("----------------------");
    }
}