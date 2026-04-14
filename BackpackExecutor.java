class BackpackExecutor {
    public static void main(String[] args) {

        Backpack bagOne = new Backpack();
        bagOne.id = 1;
        bagOne.brand = "Wildcraft";
        bagOne.color = "Black";
        bagOne.capacity = 25;
        bagOne.waterproof = true;

        Backpack bagTwo = new Backpack();
        bagTwo.id = 2;
        bagTwo.brand = "Skybags";
        bagTwo.color = "Blue";
        bagTwo.capacity = 30;
        bagTwo.waterproof = false;

        Backpack bagThree = new Backpack();
        bagThree.id = 3;
        bagThree.brand = "American Tourister";
        bagThree.color = "Grey";
        bagThree.capacity = 35;
        bagThree.waterproof = true;

        Backpack bagFour = new Backpack();
        bagFour.id = 4;
        bagFour.brand = "Nike";
        bagFour.color = "Red";
        bagFour.capacity = 20;
        bagFour.waterproof = false;

        Backpack bagFive = new Backpack();
        bagFive.id = 5;
        bagFive.brand = "Adidas";
        bagFive.color = "White";
        bagFive.capacity = 28;
        bagFive.waterproof = true;

        Backpack[] backpacks = new Backpack[5];
        backpacks[0] = bagOne;
        backpacks[1] = bagTwo;
        backpacks[2] = bagThree;
        backpacks[3] = bagFour;
        backpacks[4] = bagFive;

        for (Backpack bag : backpacks) {
            System.out.println("ID: " + bag.id);
            System.out.println("Brand: " + bag.brand);
            System.out.println("Color: " + bag.color);
            System.out.println("Capacity: " + bag.capacity);
            System.out.println("Waterproof: " + bag.waterproof);
            System.out.println("----------------");
        }
    }
}