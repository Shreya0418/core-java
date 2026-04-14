class LaptopExecutor {
    public static void main(String[] args) {

        Laptop lapOne = new Laptop();
        lapOne.id = 1;
        lapOne.brand = "Dell";
        lapOne.ram = 8;
        lapOne.processor = "i5";
        lapOne.price = 55000;

        Laptop lapTwo = new Laptop();
        lapTwo.id = 2;
        lapTwo.brand = "HP";
        lapTwo.ram = 16;
        lapTwo.processor = "i7";
        lapTwo.price = 72000;

        Laptop lapThree = new Laptop();
        lapThree.id = 3;
        lapThree.brand = "Lenovo";
        lapThree.ram = 8;
        lapThree.processor = "Ryzen 5";
        lapThree.price = 60000;

        Laptop lapFour = new Laptop();
        lapFour.id = 4;
        lapFour.brand = "Asus";
        lapFour.ram = 16;
        lapFour.processor = "i9";
        lapFour.price = 95000;

        Laptop lapFive = new Laptop();
        lapFive.id = 5;
        lapFive.brand = "Acer";
        lapFive.ram = 8;
        lapFive.processor = "i3";
        lapFive.price = 42000;

        Laptop lapSix = new Laptop();
        lapSix.id = 6;
        lapSix.brand = "Apple";
        lapSix.ram = 16;
        lapSix.processor = "M2";
        lapSix.price = 125000;

        Laptop lapSeven = new Laptop();
        lapSeven.id = 7;
        lapSeven.brand = "MSI";
        lapSeven.ram = 32;
        lapSeven.processor = "i9";
        lapSeven.price = 150000;

        Laptop lapEight = new Laptop();
        lapEight.id = 8;
        lapEight.brand = "Samsung";
        lapEight.ram = 8;
        lapEight.processor = "i5";
        lapEight.price = 67000;

        Laptop lapNine = new Laptop();
        lapNine.id = 9;
        lapNine.brand = "LG";
        lapNine.ram = 16;
        lapNine.processor = "Ryzen 7";
        lapNine.price = 81000;

        Laptop lapTen = new Laptop();
        lapTen.id = 10;
        lapTen.brand = "Microsoft";
        lapTen.ram = 8;
        lapTen.processor = "i7";
        lapTen.price = 92000;

        Laptop lapEleven = new Laptop();
        lapEleven.id = 11;
        lapEleven.brand = "Razer";
        lapEleven.ram = 32;
        lapEleven.processor = "i9";
        lapEleven.price = 175000;

        Laptop lapTwelve = new Laptop();
        lapTwelve.id = 12;
        lapTwelve.brand = "Huawei";
        lapTwelve.ram = 16;
        lapTwelve.processor = "Ryzen 5";
        lapTwelve.price = 70000;

        Laptop lapThirteen = new Laptop();
        lapThirteen.id = 13;
        lapThirteen.brand = "Honor";
        lapThirteen.ram = 8;
        lapThirteen.processor = "i5";
        lapThirteen.price = 58000;

        Laptop lapFourteen = new Laptop();
        lapFourteen.id = 14;
        lapFourteen.brand = "Vaio";
        lapFourteen.ram = 16;
        lapFourteen.processor = "i7";
        lapFourteen.price = 86000;

        Laptop lapFifteen = new Laptop();
        lapFifteen.id = 15;
        lapFifteen.brand = "Alienware";
        lapFifteen.ram = 32;
        lapFifteen.processor = "i9";
        lapFifteen.price = 220000;


        Laptop laptops[] = new Laptop[15];

        laptops[0] = lapOne;
        laptops[1] = lapTwo;
        laptops[2] = lapThree;
        laptops[3] = lapFour;
        laptops[4] = lapFive;
        laptops[5] = lapSix;
        laptops[6] = lapSeven;
        laptops[7] = lapEight;
        laptops[8] = lapNine;
        laptops[9] = lapTen;
        laptops[10] = lapEleven;
        laptops[11] = lapTwelve;
        laptops[12] = lapThirteen;
        laptops[13] = lapFourteen;
        laptops[14] = lapFifteen;


        for (Laptop laptop : laptops) {
            System.out.println("ID: " + laptop.id);
            System.out.println("Brand: " + laptop.brand);
            System.out.println("RAM: " + laptop.ram + "GB");
            System.out.println("Processor: " + laptop.processor);
            System.out.println("Price: " + laptop.price);
            System.out.println("----------------");
        }
    }
}