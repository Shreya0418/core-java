class Kajal {

    String brand;
    String color;
    String type;
    String finishType;
    String specialFeature;
    String packagingType;
    double price;

    
    Kajal(String brand, String color, String type, String finishType,
          String specialFeature, String packagingType, double price) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.finishType = finishType;
        this.specialFeature = specialFeature;
        this.packagingType = packagingType;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(type);
        System.out.println(finishType);
        System.out.println(specialFeature);
        System.out.println(packagingType);
        System.out.println(price);
        System.out.println("----------------------");
    }
}