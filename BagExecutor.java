class BagExecutor {
    public static void main(String[] args) {

        Bag bagOne = new Bag();
        bagOne.id = 1;
        bagOne.brand = "Skybags";
        bagOne.color = "Black";
        bagOne.capacity = 25;
        bagOne.price = 2200;

        Bag bagTwo = new Bag();
        bagTwo.id = 2;
        bagTwo.brand = "Wildcraft";
        bagTwo.color = "Blue";
        bagTwo.capacity = 30;
        bagTwo.price = 2800;

        Bag bagThree = new Bag();
        bagThree.id = 3;
        bagThree.brand = "American Tourister";
        bagThree.color = "Grey";
        bagThree.capacity = 35;
        bagThree.price = 3500;

        Bag bagFour = new Bag();
        bagFour.id = 4;
        bagFour.brand = "Nike";
        bagFour.color = "Red";
        bagFour.capacity = 20;
        bagFour.price = 2600;

        Bag bagFive = new Bag();
        bagFive.id = 5;
        bagFive.brand = "Adidas";
        bagFive.color = "White";
        bagFive.capacity = 28;
        bagFive.price = 3000;

        Bag bagSix = new Bag();
        bagSix.id = 6;
        bagSix.brand = "Puma";
        bagSix.color = "Green";
        bagSix.capacity = 22;
        bagSix.price = 2400;

        Bag bagSeven = new Bag();
        bagSeven.id = 7;
        bagSeven.brand = "Safari";
        bagSeven.color = "Brown";
        bagSeven.capacity = 40;
        bagSeven.price = 4200;

        Bag bagEight = new Bag();
        bagEight.id = 8;
        bagEight.brand = "Tommy Hilfiger";
        bagEight.color = "Navy";
        bagEight.capacity = 18;
        bagEight.price = 5500;

        Bag bagNine = new Bag();
        bagNine.id = 9;
        bagNine.brand = "Lavie";
        bagNine.color = "Pink";
        bagNine.capacity = 15;
        bagNine.price = 3200;

        Bag bagTen = new Bag();
        bagTen.id = 10;
        bagTen.brand = "F Gear";
        bagTen.color = "Orange";
        bagTen.capacity = 26;
        bagTen.price = 2100;

        Bag bagEleven = new Bag();
        bagEleven.id = 11;
        bagEleven.brand = "Aristocrat";
        bagEleven.color = "Purple";
        bagEleven.capacity = 38;
        bagEleven.price = 3900;

        Bag bagTwelve = new Bag();
        bagTwelve.id = 12;
        bagTwelve.brand = "Caprese";
        bagTwelve.color = "Maroon";
        bagTwelve.capacity = 12;
        bagTwelve.price = 4600;

        Bag bagThirteen = new Bag();
        bagThirteen.id = 13;
        bagThirteen.brand = "Baggit";
        bagThirteen.color = "Beige";
        bagThirteen.capacity = 16;
        bagThirteen.price = 3400;

        Bag bagFourteen = new Bag();
        bagFourteen.id = 14;
        bagFourteen.brand = "Gucci";
        bagFourteen.color = "Gold";
        bagFourteen.capacity = 14;
        bagFourteen.price = 55000;

        Bag bagFifteen = new Bag();
        bagFifteen.id = 15;
        bagFifteen.brand = "Louis Vuitton";
        bagFifteen.color = "Cream";
        bagFifteen.capacity = 17;
        bagFifteen.price = 85000;


        Bag bags[] = new Bag[15];

        bags[0] = bagOne;
        bags[1] = bagTwo;
        bags[2] = bagThree;
        bags[3] = bagFour;
        bags[4] = bagFive;
        bags[5] = bagSix;
        bags[6] = bagSeven;
        bags[7] = bagEight;
        bags[8] = bagNine;
        bags[9] = bagTen;
        bags[10] = bagEleven;
        bags[11] = bagTwelve;
        bags[12] = bagThirteen;
        bags[13] = bagFourteen;
        bags[14] = bagFifteen;


        for (Bag bag : bags) {
            System.out.println("ID: " + bag.id);
            System.out.println("Brand: " + bag.brand);
            System.out.println("Color: " + bag.color);
            System.out.println("Capacity: " + bag.capacity + "L");
            System.out.println("Price: " + bag.price);
            System.out.println("----");
        }
    }
}