class Medicine {

    String name;
    String brand;
    String type;
    int dosageMg;
    boolean isPrescriptionRequired;
    double price;
    String expiryDate;

    Medicine(String name, String brand, String type, int dosageMg,
             boolean isPrescriptionRequired, double price, String expiryDate) {

        this.name = name;
        this.brand = brand;
        this.type = type;
        this.dosageMg = dosageMg;
        this.isPrescriptionRequired = isPrescriptionRequired;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public void displayDetails() {
        System.out.println(name);
        System.out.println(brand);
        System.out.println(type);
        System.out.println(dosageMg);
        System.out.println(isPrescriptionRequired);
        System.out.println(price);
        System.out.println(expiryDate);
        System.out.println("----------------------");
    }
}