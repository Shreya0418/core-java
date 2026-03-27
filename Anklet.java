class Anklet {

    String materialType;
    String designType;
    String occasion;
    String gender;
    String closureType;
    boolean adjustable;
    double weight;

    // constructor
    Anklet(String materialType, String designType, String occasion,
           String gender, String closureType, boolean adjustable, double weight) {

        this.materialType = materialType;
        this.designType = designType;
        this.occasion = occasion;
        this.gender = gender;
        this.closureType = closureType;
        this.adjustable = adjustable;
        this.weight = weight;
    }

    // display method
    public void displayDetails() {
        System.out.println(materialType);
        System.out.println(designType);
        System.out.println(occasion);
        System.out.println(gender);
        System.out.println(closureType);
        System.out.println(adjustable);
        System.out.println(weight);
        System.out.println("----------------------");
    }
}