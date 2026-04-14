class KeyboardExecutor {
    public static void main(String[] args) {
        Keyboard keyOne = new Keyboard();
        keyOne.id = 1;
        keyOne.brand = "Logitech";
        keyOne.type = "Mechanical";
        keyOne.isWireless = true;
        keyOne.price = 4500;

        Keyboard keyTwo = new Keyboard();
        keyTwo.id = 2;
        keyTwo.brand = "HP";
        keyTwo.type = "Membrane";
        keyTwo.isWireless = false;
        keyTwo.price = 1200;

        Keyboard keyThree = new Keyboard();
        keyThree.id = 3;
        keyThree.brand = "Dell";
        keyThree.type = "Membrane";
        keyThree.isWireless = false;
        keyThree.price = 1000;

        Keyboard keyFour = new Keyboard();
        keyFour.id = 4;
        keyFour.brand = "Redragon";
        keyFour.type = "Mechanical";
        keyFour.isWireless = true;
        keyFour.price = 5200;

        Keyboard keyFive = new Keyboard();
        keyFive.id = 5;
        keyFive.brand = "Razer";
        keyFive.type = "Mechanical";
        keyFive.isWireless = true;
        keyFive.price = 9500;

        Keyboard keySix = new Keyboard();
        keySix.id = 6;
        keySix.brand = "Corsair";
        keySix.type = "Mechanical";
        keySix.isWireless = false;
        keySix.price = 8700;

        Keyboard keySeven = new Keyboard();
        keySeven.id = 7;
        keySeven.brand = "Zebronics";
        keySeven.type = "Gaming";
        keySeven.isWireless = false;
        keySeven.price = 2300;

        Keyboard keyEight = new Keyboard();
        keyEight.id = 8;
        keyEight.brand = "Lenovo";
        keyEight.type = "Membrane";
        keyEight.isWireless = false;
        keyEight.price = 1400;

        Keyboard keyNine = new Keyboard();
        keyNine.id = 9;
        keyNine.brand = "Asus";
        keyNine.type = "Gaming";
        keyNine.isWireless = true;
        keyNine.price = 6100;

        Keyboard keyTen = new Keyboard();
        keyTen.id = 10;
        keyTen.brand = "Apple";
        keyTen.type = "Magic";
        keyTen.isWireless = true;
        keyTen.price = 9900;

        Keyboard keyEleven = new Keyboard();
        keyEleven.id = 11;
        keyEleven.brand = "Acer";
        keyEleven.type = "Membrane";
        keyEleven.isWireless = false;
        keyEleven.price = 1300;

        Keyboard keyTwelve = new Keyboard();
        keyTwelve.id = 12;
        keyTwelve.brand = "Microsoft";
        keyTwelve.type = "Ergonomic";
        keyTwelve.isWireless = true;
        keyTwelve.price = 7200;

        Keyboard keyThirteen = new Keyboard();
        keyThirteen.id = 13;
        keyThirteen.brand = "Ant Esports";
        keyThirteen.type = "Mechanical";
        keyThirteen.isWireless = false;
        keyThirteen.price = 3400;

        Keyboard keyFourteen = new Keyboard();
        keyFourteen.id = 14;
        keyFourteen.brand = "HyperX";
        keyFourteen.type = "Gaming";
        keyFourteen.isWireless = true;
        keyFourteen.price = 8000;

        Keyboard keyFifteen = new Keyboard();
        keyFifteen.id = 15;
        keyFifteen.brand = "Portronics";
        keyFifteen.type = "Compact";
        keyFifteen.isWireless = true;
        keyFifteen.price = 2500;


        Keyboard keyboards[] = new Keyboard[15];

        keyboards[0] = keyOne;
        keyboards[1] = keyTwo;
        keyboards[2] = keyThree;
        keyboards[3] = keyFour;
        keyboards[4] = keyFive;
        keyboards[5] = keySix;
        keyboards[6] = keySeven;
        keyboards[7] = keyEight;
        keyboards[8] = keyNine;
        keyboards[9] = keyTen;
        keyboards[10] = keyEleven;
        keyboards[11] = keyTwelve;
        keyboards[12] = keyThirteen;
        keyboards[13] = keyFourteen;
        keyboards[14] = keyFifteen;


        for (Keyboard keyboard : keyboards) {
            System.out.println("ID: " + keyboard.id);
            System.out.println("Brand: " + keyboard.brand);
            System.out.println("Type: " + keyboard.type);
            System.out.println("Wireless: " + keyboard.isWireless);
            System.out.println("Price: " + keyboard.price);
            System.out.println("----------------");
        }
    }
}