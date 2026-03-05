class EarBuds {

    static int price = 1599;
    static String brand = "OnePlus";
    static String color = "Ash Black";
    static String earPlacement = "On Ear";
    static String formFactor = "In ear";
    static String impedance = "32 Ohms";
    static String modelNumber = "E517A";
    static String modelName = "OnePlus Nord Buds 3r";
    static String sensitivity = "112 dB";
    static String enclosureMaterial = "Silicone";

    public static void main(String[] args) {

        int price = 1999;
        String brand = "Realme";
        String color = "Blue";
        String earPlacement = "In Ear";
        String formFactor = "True Wireless";
        String impedance = "28 Ohms";
        String modelNumber = "RMA210";
        String modelName = "Realme Buds Air 5";
        String sensitivity = "108 dB";
        String enclosureMaterial = "Plastic";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Color is  " + color);
        System.out.println("The Ear Placement is  " + earPlacement);
        System.out.println("The Form Factor is  " + formFactor);
        System.out.println("The Impedance is  " + impedance);
        System.out.println("The Model Number is  " + modelNumber);
        System.out.println("The Model Name is  " + modelName);
        System.out.println("The Sensitivity is  " + sensitivity);
        System.out.println("The Enclosure Material is  " + enclosureMaterial);

        // static variables
        System.out.println("The Price is  " + EarBuds.price);
        System.out.println("The Brand is  " + EarBuds.brand);
        System.out.println("The Color is  " + EarBuds.color);
        System.out.println("The Ear Placement is  " + EarBuds.earPlacement);
        System.out.println("The Form Factor is  " + EarBuds.formFactor);
        System.out.println("The Impedance is  " + EarBuds.impedance);
        System.out.println("The Model Number is  " + EarBuds.modelNumber);
        System.out.println("The Model Name is  " + EarBuds.modelName);
        System.out.println("The Sensitivity is  " + EarBuds.sensitivity);
        System.out.println("The Enclosure Material is  " + EarBuds.enclosureMaterial);
    }
}
