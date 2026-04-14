class MobileExecutor {
    public static void main(String[] args) {

        Mobile mobOne = new Mobile();
        mobOne.id = 1;
        mobOne.brand = "Samsung";
        mobOne.color = "Black";
        mobOne.storage = 128;
        mobOne.price = 45000;

        Mobile mobTwo = new Mobile();
        mobTwo.id = 2;
        mobTwo.brand = "Apple";
        mobTwo.color = "White";
        mobTwo.storage = 256;
        mobTwo.price = 85000;

        Mobile mobThree = new Mobile();
        mobThree.id = 3;
        mobThree.brand = "OnePlus";
        mobThree.color = "Blue";
        mobThree.storage = 128;
        mobThree.price = 38000;

        Mobile mobFour = new Mobile();
        mobFour.id = 4;
        mobFour.brand = "Xiaomi";
        mobFour.color = "Purple";
        mobFour.storage = 64;
        mobFour.price = 22000;

        Mobile mobFive = new Mobile();
        mobFive.id = 5;
        mobFive.brand = "Realme";
        mobFive.color = "Gold";
        mobFive.storage = 128;
        mobFive.price = 18000;

        Mobile mobSix = new Mobile();
        mobSix.id = 6;
        mobSix.brand = "Vivo";
        mobSix.color = "Silver";
        mobSix.storage = 256;
        mobSix.price = 27000;

        Mobile mobSeven = new Mobile();
        mobSeven.id = 7;
        mobSeven.brand = "Oppo";
        mobSeven.color = "Green";
        mobSeven.storage = 128;
        mobSeven.price = 25000;

        Mobile mobEight = new Mobile();
        mobEight.id = 8;
        mobEight.brand = "Motorola";
        mobEight.color = "Grey";
        mobEight.storage = 64;
        mobEight.price = 20000;

        Mobile  mobNine = new Mobile();
        mobNine.id= 9;
        mobNine.brand = "Google";
        mobNine.color = "Black";
        mobNine.storage = 256;
        mobNine.price = 65000;

        Mobile mobTen = new Mobile();
         mobTen.id = 10;
        mobTen.brand = "Nothing";
        mobTen.color = "Transparent";
        mobTen.storage = 128;
        mobTen.price = 32000;

        Mobile mobEleven = new Mobile();
        mobEleven.id = 11;
        mobEleven.brand = "Nokia";
        mobEleven.color = "Blue";
        mobEleven.storage = 32;
        mobEleven.price = 9000;

        Mobile mobTwelve = new Mobile();
        mobTwelve.id = 12;
        mobTwelve.brand = "IQOO";
        mobTwelve.color = "Orange";
        mobTwelve.storage = 256;
        mobTwelve.price = 34000;

        Mobile mobThirteen = new Mobile();
        mobThirteen.id = 13;
        mobThirteen.brand = "Poco";
        mobThirteen.color = "Yellow";
        mobThirteen.storage = 128;
        mobThirteen.price = 21000;

        Mobile mobFourteen = new Mobile();
        mobFourteen.id = 14;
        mobFourteen.brand = "Asus";
        mobFourteen.color = "Red";
        mobFourteen.storage = 512;
        mobFourteen.price = 75000;

        Mobile mobFifteen = new Mobile();
        mobFifteen.id = 15;
        mobFifteen.brand = "Sony";
        mobFifteen.color = "White";
        mobFifteen.storage = 256;
        mobFifteen.price = 68000;

        Mobile mobiles[] = new Mobile[15];

        mobiles[0] = mobOne;
        mobiles[1] = mobTwo;
        mobiles[2] = mobThree;
        mobiles[3] = mobFour;
        mobiles[4] = mobFive;
        mobiles[5] = mobSix;
        mobiles[6] = mobSeven;
        mobiles[7] = mobEight;
        mobiles[8] = mobNine;
        mobiles[9] = mobTen;
        mobiles[10] = mobEleven;
        mobiles[11] = mobTwelve;
        mobiles[12] = mobThirteen;
        mobiles[13] = mobFourteen;
        mobiles[14] = mobFifteen;


        for (Mobile mobile : mobiles) {
            System.out.println("ID: " + mobile.id);
            System.out.println("Brand: " + mobile.brand);
            System.out.println("Color: " + mobile.color);
            System.out.println("Storage: " + mobile.storage + "GB");
            System.out.println("Price: " + mobile.price);
            System.out.println("-------");
        }
    }
}