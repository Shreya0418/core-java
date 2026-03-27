class CaromBoard {

    String brandName;
    String material;
    String theme;
    String genre;
    int numberOfPlayers;
    String edition;
    boolean areBattriesRequired;

    // constructor
    CaromBoard(String brandName, String material, String theme, String genre,
               int numberOfPlayers, String edition, boolean areBattriesRequired) {

        this.brandName = brandName;
        this.material = material;
        this.theme = theme;
        this.genre = genre;
        this.numberOfPlayers = numberOfPlayers;
        this.edition = edition;
        this.areBattriesRequired = areBattriesRequired;
    }

    // display method
    public void displayDetails() {
        System.out.println(brandName);
        System.out.println(material);
        System.out.println(theme);
        System.out.println(genre);
        System.out.println(numberOfPlayers);
        System.out.println(edition);
        System.out.println(areBattriesRequired);
        System.out.println("----------------------");
    }
}