class WatchExecutor {
    public static void main(String[] args) {

        Watch watchOne = new Watch();
        watchOne.id = 1;
        watchOne.brand = "Titan";
        watchOne.type = "Analog";
        watchOne.isSmart = false;
        watchOne.price = 2500;

        Watch watchTwo = new Watch();
        watchTwo.id = 2;
        watchTwo.brand = "Apple";
        watchTwo.type = "Digital";
        watchTwo.isSmart = true;
        watchTwo.price = 42000;

        Watch watchThree = new Watch();
        watchThree.id = 3;
        watchThree.brand = "Fossil";
        watchThree.type = "Analog";
        watchThree.isSmart = false;
        watchThree.price = 6500;

        Watch watchFour = new Watch();
        watchFour.id = 4;
        watchFour.brand = "Samsung";
        watchFour.type = "Digital";
        watchFour.isSmart = true;
        watchFour.price = 18000;

        Watch watchFive = new Watch();
        watchFive.id = 5;
        watchFive.brand = "Casio";
        watchFive.type = "Digital";
        watchFive.isSmart = false;
        watchFive.price = 3200;

        Watch watchSix = new Watch();
        watchSix.id = 6;
        watchSix.brand = "Rolex";
        watchSix.type = "Luxury";
        watchSix.isSmart = false;
        watchSix.price = 250000;

        Watch watchSeven = new Watch();
        watchSeven.id = 7;
        watchSeven.brand = "Boat";
        watchSeven.type = "Digital";
        watchSeven.isSmart = true;
        watchSeven.price = 3500;

        Watch watchEight = new Watch();
        watchEight.id = 8;
        watchEight.brand = "Noise";
        watchEight.type = "Digital";
        watchEight.isSmart = true;
        watchEight.price = 2800;

        Watch watchNine = new Watch();
        watchNine.id = 9;
        watchNine.brand = "Timex";
        watchNine.type = "Analog";
        watchNine.isSmart = false;
        watchNine.price = 2200;

        Watch watchTen = new Watch();
        watchTen.id = 10;
        watchTen.brand = "Sonata";
        watchTen.type = "Analog";
        watchTen.isSmart = false;
        watchTen.price = 1800;

        Watch watchEleven = new Watch();
        watchEleven.id = 11;
        watchEleven.brand = "Garmin";
        watchEleven.type = "Fitness";
        watchEleven.isSmart = true;
        watchEleven.price = 22000;

        Watch watchTwelve = new Watch();
        watchTwelve.id = 12;
        watchTwelve.brand = "Fitbit";
        watchTwelve.type = "Fitness";
        watchTwelve.isSmart = true;
        watchTwelve.price = 12000;

        Watch watchThirteen = new Watch();
        watchThirteen.id = 13;
        watchThirteen.brand = "Michael Kors";
        watchThirteen.type = "Luxury";
        watchThirteen.isSmart = false;
        watchThirteen.price = 15000;

        Watch watchFourteen = new Watch();
        watchFourteen.id = 14;
        watchFourteen.brand = "GShock";
        watchFourteen.type = "Sport";
        watchFourteen.isSmart = false;
        watchFourteen.price = 9000;

        Watch watchFifteen = new Watch();
        watchFifteen.id = 15;
        watchFifteen.brand = "Amazfit";
        watchFifteen.type = "Digital";
        watchFifteen.isSmart = true;
        watchFifteen.price = 7000;


        Watch watches[] = new Watch[15];

        watches[0] = watchOne;
        watches[1] = watchTwo;
        watches[2] = watchThree;
        watches[3] = watchFour;
        watches[4] = watchFive;
        watches[5] = watchSix;
        watches[6] = watchSeven;
        watches[7] = watchEight;
        watches[8] = watchNine;
        watches[9] = watchTen;
        watches[10] = watchEleven;
        watches[11] = watchTwelve;
        watches[12] = watchThirteen;
        watches[13] = watchFourteen;
        watches[14] = watchFifteen;


        for (Watch watch : watches) {
            System.out.println("ID: " + watch.id);
            System.out.println("Brand: " + watch.brand);
            System.out.println("Type: " + watch.type);
            System.out.println("Smart Watch: " + watch.isSmart);
            System.out.println("Price: " + watch.price);
            System.out.println("----------------");
        }
    }
}