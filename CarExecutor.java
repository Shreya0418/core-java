class CarExecutor {
    public static void main(String[] args) {

        Car carOne = new Car();
        carOne.id = 1;
        carOne.brand = "Toyota";
        carOne.model = "Innova";
        carOne.fuelType = "Diesel";
        carOne.price = 2200000;

        Car carTwo = new Car();
        carTwo.id = 2;
        carTwo.brand = "Hyundai";
        carTwo.model = "Creta";
        carTwo.fuelType = "Petrol";
        carTwo.price = 1800000;

        Car carThree = new Car();
        carThree.id = 3;
        carThree.brand = "Honda";
        carThree.model = "City";
        carThree.fuelType = "Petrol";
        carThree.price = 1500000;

        Car carFour = new Car();
        carFour.id = 4;
        carFour.brand = "Tata";
        carFour.model = "Nexon";
        carFour.fuelType = "Electric";
        carFour.price = 1700000;

        Car carFive = new Car();
        carFive.id = 5;
        carFive.brand = "Mahindra";
        carFive.model = "XUV700";
        carFive.fuelType = "Diesel";
        carFive.price = 2500000;

        Car carSix = new Car();
        carSix.id = 6;
        carSix.brand = "BMW";
        carSix.model = "X5";
        carSix.fuelType = "Petrol";
        carSix.price = 9500000;

        Car carSeven = new Car();
        carSeven.id = 7;
        carSeven.brand = "Audi";
        carSeven.model = "A6";
        carSeven.fuelType = "Petrol";
        carSeven.price = 7000000;

        Car carEight = new Car();
        carEight.id = 8;
        carEight.brand = "Mercedes";
        carEight.model = "C-Class";
        carEight.fuelType = "Diesel";
        carEight.price = 8500000;

        Car carNine = new Car();
        carNine.id = 9;
        carNine.brand = "Kia";
        carNine.model = "Seltos";
        carNine.fuelType = "Petrol";
        carNine.price = 1900000;

        Car carTen = new Car();
        carTen.id = 10;
        carTen.brand = "Skoda";
        carTen.model = "Slavia";
        carTen.fuelType = "Petrol";
        carTen.price = 1600000;

        Car carEleven = new Car();
        carEleven.id = 11;
        carEleven.brand = "Volkswagen";
        carEleven.model = "Virtus";
        carEleven.fuelType = "Petrol";
        carEleven.price = 1750000;

        Car carTwelve = new Car();
        carTwelve.id = 12;
        carTwelve.brand = "MG";
        carTwelve.model = "Hector";
        carTwelve.fuelType = "Diesel";
        carTwelve.price = 2100000;

        Car carThirteen = new Car();
        carThirteen.id = 13;
        carThirteen.brand = "Renault";
        carThirteen.model = "Kiger";
        carThirteen.fuelType = "Petrol";
        carThirteen.price = 1200000;

        Car carFourteen = new Car();
        carFourteen.id = 14;
        carFourteen.brand = "Jeep";
        carFourteen.model = "Compass";
        carFourteen.fuelType = "Diesel";
        carFourteen.price = 3200000;

        Car carFifteen = new Car();
        carFifteen.id = 15;
        carFifteen.brand = "Ferrari";
        carFifteen.model = "Roma";
        carFifteen.fuelType = "Petrol";
        carFifteen.price = 35000000;


        Car cars[] = new Car[15];

        cars[0] = carOne;
        cars[1] = carTwo;
        cars[2] = carThree;
        cars[3] = carFour;
        cars[4] = carFive;
        cars[5] = carSix;
        cars[6] = carSeven;
        cars[7] = carEight;
        cars[8] = carNine;
        cars[9] = carTen;
        cars[10] = carEleven;
        cars[11] = carTwelve;
        cars[12] = carThirteen;
        cars[13] = carFourteen;
        cars[14] = carFifteen;


        for (Car car : cars) {
            System.out.println("ID: " + car.id);
            System.out.println("Brand: " + car.brand);
            System.out.println("Model: " + car.model);
            System.out.println("Fuel Type: " + car.fuelType);
            System.out.println("Price: " + car.price);
            System.out.println("----------------");
        }
    }
}