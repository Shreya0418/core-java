class LipStick {

    String brand;
    String color;
    String itemForm;
    String finishType;
    boolean isTransferable;
    int itemWeight;
    int netQuantity;
    String countryOfOrigin;
s
    // constructor
    LipStick(String brand, String color, String itemForm, String finishType,
             boolean isTransferable, int itemWeight, int netQuantity, String countryOfOrigin) {

        this.brand = brand;
        this.color = color;
        this.itemForm = itemForm;
        this.finishType = finishType;
        this.isTransferable = isTransferable;
        this.itemWeight = itemWeight;
        this.netQuantity = netQuantity;
        this.countryOfOrigin = countryOfOrigin;
    }

    // display method
    public void displayDetails() {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(itemForm);
        System.out.println(finishType);
        System.out.println(isTransferable);
        System.out.println(itemWeight);
        System.out.println(netQuantity);
        System.out.println(countryOfOrigin);
        System.out.println("----------------------");
    }
}