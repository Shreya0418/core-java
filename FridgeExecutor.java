class FridgeExecutor {
    public static void main(String[] args) {

        Fridge fridgeOne = new Fridge();
        fridgeOne.id = 1;
        fridgeOne.brand = "LG";
        fridgeOne.capacity = 190;
        fridgeOne.energyRating = "3 Star";
        fridgeOne.price = 18000;

        Fridge fridgeTwo = new Fridge();
        fridgeTwo.id = 2;
        fridgeTwo.brand = "Samsung";
        fridgeTwo.capacity = 253;
        fridgeTwo.energyRating = "4 Star";
        fridgeTwo.price = 26000;

        Fridge fridgeThree = new Fridge();
        fridgeThree.id = 3;
        fridgeThree.brand = "Whirlpool";
        fridgeThree.capacity = 340;
        fridgeThree.energyRating = "5 Star";
        fridgeThree.price = 35000;

        Fridge fridgeFour = new Fridge();
        fridgeFour.id = 4;
        fridgeFour.brand = "Godrej";
        fridgeFour.capacity = 210;
        fridgeFour.energyRating = "3 Star";
        fridgeFour.price = 22000;

        Fridge fridgeFive = new Fridge();
        fridgeFive.id = 5;
        fridgeFive.brand = "Haier";
        fridgeFive.capacity = 280;
        fridgeFive.energyRating = "4 Star";
        fridgeFive.price = 30000;

        Fridge fridgeSix = new Fridge();
        fridgeSix.id = 6;
        fridgeSix.brand = "Panasonic";
        fridgeSix.capacity = 310;
        fridgeSix.energyRating = "5 Star";
        fridgeSix.price = 37000;

        Fridge fridgeSeven = new Fridge();
        fridgeSeven.id = 7;
        fridgeSeven.brand = "Bosch";
        fridgeSeven.capacity = 350;
        fridgeSeven.energyRating = "5 Star";
        fridgeSeven.price = 48000;

        Fridge fridgeEight = new Fridge();
        fridgeEight.id = 8;
        fridgeEight.brand = "Hitachi";
        fridgeEight.capacity = 290;
        fridgeEight.energyRating = "4 Star";
        fridgeEight.price = 34000;

        Fridge fridgeNine = new Fridge();
        fridgeNine.id = 9;
        fridgeNine.brand = "Voltas";
        fridgeNine.capacity = 200;
        fridgeNine.energyRating = "3 Star";
        fridgeNine.price = 21000;

        Fridge fridgeTen = new Fridge();
        fridgeTen.id = 10;
        fridgeTen.brand = "Croma";
        fridgeTen.capacity = 185;
        fridgeTen.energyRating = "2 Star";
        fridgeTen.price = 16000;

        Fridge fridgeEleven = new Fridge();
        fridgeEleven.id = 11;
        fridgeEleven.brand = "Lloyd";
        fridgeEleven.capacity = 240;
        fridgeEleven.energyRating = "4 Star";
        fridgeEleven.price = 25000;

        Fridge fridgeTwelve = new Fridge();
        fridgeTwelve.id = 12;
        fridgeTwelve.brand = "Midea";
        fridgeTwelve.capacity = 300;
        fridgeTwelve.energyRating = "5 Star";
        fridgeTwelve.price = 33000;

        Fridge fridgeThirteen = new Fridge();
        fridgeThirteen.id = 13;
        fridgeThirteen.brand = "Electrolux";
        fridgeThirteen.capacity = 320;
        fridgeThirteen.energyRating = "4 Star";
        fridgeThirteen.price = 36000;

        Fridge fridgeFourteen = new Fridge();
        fridgeFourteen.id = 14;
        fridgeFourteen.brand = "Kelvinator";
        fridgeFourteen.capacity = 260;
        fridgeFourteen.energyRating = "3 Star";
        fridgeFourteen.price = 27000;

        Fridge fridgeFifteen = new Fridge();
        fridgeFifteen.id = 15;
        fridgeFifteen.brand = "IFB";
        fridgeFifteen.capacity = 275;
        fridgeFifteen.energyRating = "5 Star";
        fridgeFifteen.price = 39000;

        Fridge fridges[] = new Fridge[15];
        fridges[0] = fridgeOne;
        fridges[1] = fridgeTwo;
        fridges[2] = fridgeThree;
        fridges[3] = fridgeFour;
        fridges[4] = fridgeFive;
        fridges[5] = fridgeSix;
        fridges[6] = fridgeSeven;
        fridges[7] = fridgeEight;
        fridges[8] = fridgeNine;
        fridges[9] = fridgeTen;
        fridges[10] = fridgeEleven;
        fridges[11] = fridgeTwelve;
        fridges[12] = fridgeThirteen;
        fridges[13] = fridgeFourteen;
        fridges[14] = fridgeFifteen;


        for (Fridge fridge : fridges) {
            System.out.println("ID: " + fridge.id);
            System.out.println("Brand: " + fridge.brand);
            System.out.println("Capacity: " + fridge.capacity + "L");
            System.out.println("Energy Rating: " + fridge.energyRating);
            System.out.println("Price: " + fridge.price);
            System.out.println("----------------");
        }
    }
}