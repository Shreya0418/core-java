class BikeExecutor {
    public static void main(String[] args) {
         Bike bikeOne = new Bike();
        bikeOne.id = 1;
        bikeOne.brand = "Royal Enfield";
        bikeOne.cc = 350;
        bikeOne.color = "Black";
        bikeOne.price = 210000;
        Bike bikeTwo = new Bike();
        bikeTwo.id = 2;
        bikeTwo.brand = "KTM";
        bikeTwo.cc = 390;
        bikeTwo.color = "Orange";
        bikeTwo.price = 320000;

        Bike bikeThree = new Bike();
        bikeThree.id = 3;
        bikeThree.brand = "Yamaha";
        bikeThree.cc = 155;
        bikeThree.color = "Blue";
        bikeThree.price = 180000;

        Bike bikeFour = new Bike();
        bikeFour.id = 4;
        bikeFour.brand = "Honda";
        bikeFour.cc = 160;
        bikeFour.color = "Red";
        bikeFour.price = 145000;

        Bike bikeFive = new Bike();
        bikeFive.id = 5;
        bikeFive.brand = "Bajaj";
        bikeFive.cc = 220;
        bikeFive.color= "Grey";
        bikeFive.price = 160000;
        Bike bikeSix = new Bike();
        bikeSix.id = 6;
        bikeSix.brand = "TVS";
        bikeSix.cc = 200;
        bikeSix.color= "White";
        bikeSix.price = 155000;

        Bike bikeSeven = new Bike();
        bikeSeven.id = 7;
        bikeSeven.brand= "Suzuki";
        bikeSeven.cc = 250;
        bikeSeven.color = "Yellow";
        bikeSeven.price= 195000;

        Bike bikeEight = new Bike();
        bikeEight.id = 8;
        bikeEight.brand = "Kawasaki";
        bikeEight.cc = 650;
        bikeEight.color = "Green";
        bikeEight.price = 720000;

        Bike bikeNine = new Bike();
        bikeNine.id = 9;
        bikeNine.brand = "Harley Davidson";
        bikeNine.cc = 883;
        bikeNine.color = "Matte Black";
        bikeNine.price = 1200000;

        Bike bikeTen = new Bike();
        bikeTen.id = 10;
        bikeTen.brand = "Ducati";
        bikeTen.cc = 937;
        bikeTen.color = "Red";
        bikeTen.price = 1450000;

        Bike bikeEleven = new Bike();
        bikeEleven.id = 11;
        bikeEleven.brand = "BMW";
        bikeEleven.cc = 1000;
        bikeEleven.color = "Blue";
        bikeEleven.price = 2200000;

        Bike bikeTwelve = new Bike();
        bikeTwelve.id = 12;
        bikeTwelve.brand = "Triumph";
        bikeTwelve.cc = 765;
        bikeTwelve.color = "Silver";
        bikeTwelve.price = 950000;

        Bike bikeThirteen = new Bike();
        bikeThirteen.id = 13;
        bikeThirteen.brand = "Benelli";
        bikeThirteen.cc = 300;
        bikeThirteen.color = "Black";
        bikeThirteen.price = 350000;

        Bike bikeFourteen = new Bike();
        bikeFourteen.id = 14;
        bikeFourteen.brand = "Aprilia";
        bikeFourteen.cc = 160;
        bikeFourteen.color = "White";
        bikeFourteen.price = 175000;

        Bike bikeFifteen = new Bike();
        bikeFifteen.id = 15;
        bikeFifteen.brand = "Hero";
        bikeFifteen.cc = 125;
        bikeFifteen.color = "Black";
        bikeFifteen.price = 95000;


        Bike bikes[] = new Bike[15];

        bikes[0]= bikeOne;
        bikes[1]= bikeTwo;
        bikes[2] =bikeThree;
        bikes[3] = bikeFour;
        bikes[4] =bikeFive;
        bikes[5] = bikeSix;
        bikes[6]= bikeSeven;
        bikes[7]= bikeEight;
        bikes[8] =bikeNine;
        bikes[9] = bikeTen;
        bikes[10] = bikeEleven;
        bikes[11] = bikeTwelve;
        bikes[12] = bikeThirteen;
        bikes[13] = bikeFourteen;
        bikes[14] = bikeFifteen;


        for (Bike bike : bikes) {
            System.out.println("ID: " + bike.id);
            System.out.println("Brand: " + bike.brand);
            System.out.println("CC: " + bike.cc);
            System.out.println("Color: " + bike.color);
            System.out.println("Price: " + bike.price);
            System.out.println("----------------");
        }
    }
}