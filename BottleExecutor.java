class BottleExecutor {
    public static void main(String[] args) {

        Bottle botOne = new Bottle();
        botOne.code = 14;
        botOne.brand = "United";
        botOne.color = "Velvet";
        botOne.capacity = 45;
        botOne.isReusable = true;

        Bottle botTwo = new Bottle();
        botTwo.code = 15;
        botTwo.brand = "Milton";
        botTwo.color = "Blue";
        botTwo.capacity = 50;
        botTwo.isReusable = true;

        Bottle botThree = new Bottle();
        botThree.code = 16;
        botThree.brand = "Cello";
        botThree.color = "Red";
        botThree.capacity = 60;
        botThree.isReusable = false;

        Bottle botFour = new Bottle();
        botFour.code = 17;
        botFour.brand = "Tupperware";
        botFour.color = "Green";
        botFour.capacity = 55;
        botFour.isReusable = true;

        Bottle botFive = new Bottle();
        botFive.code = 18;
        botFive.brand = "Pigeon";
        botFive.color = "Black";
        botFive.capacity = 70;
        botFive.isReusable = true;

        Bottle botSix = new Bottle();
        botSix.code = 19;
        botSix.brand = "Signoraware";
        botSix.color = "White";
        botSix.capacity = 40;
        botSix.isReusable = false;

        Bottle botSeven = new Bottle();
        botSeven.code = 20;
        botSeven.brand = "Borocil";
        botSeven.color = "Silver";
        botSeven.capacity = 80;
        botSeven.isReusable = true;

        Bottle botEight = new Bottle();
        botEight.code = 21;
        botEight.brand = "Nike";
        botEight.color = "Yellow";
        botEight.capacity = 65;
        botEight.isReusable = true;

        Bottle botNine = new Bottle();
        botNine.code = 22;
        botNine.brand = "Adidas";
        botNine.color = "Purple";
        botNine.capacity = 75;
        botNine.isReusable = false;

        Bottle botTen = new Bottle();
        botTen.code = 23;
        botTen.brand = "Puma";
        botTen.color = "Orange";
        botTen.capacity = 85;
        botTen.isReusable = true;

        Bottle botEleven = new Bottle();
        botEleven.code = 24;
        botEleven.brand = "Hydro";
        botEleven.color = "Pink";
        botEleven.capacity = 90;
        botEleven.isReusable = true;

        Bottle botTwelve = new Bottle();
        botTwelve.code = 25;
        botTwelve.brand = "CoolSip";
        botTwelve.color = "Brown";
        botTwelve.capacity = 95;
        botTwelve.isReusable = false;

        Bottle botThirteen = new Bottle();
        botThirteen.code = 26;
        botThirteen.brand = "Fresh";
        botThirteen.color = "Grey";
        botThirteen.capacity = 100;
        botThirteen.isReusable = true;

        Bottle botFourteen = new Bottle();
        botFourteen.code = 27;
        botFourteen.brand = "Hydrate";
        botFourteen.color = "Cyan";
        botFourteen.capacity = 110;
        botFourteen.isReusable = true;

        Bottle botFifteen = new Bottle();
        botFifteen.code = 28;
        botFifteen.brand = "Aqua";
        botFifteen.color = "Magenta";
        botFifteen.capacity = 120;
        botFifteen.isReusable = false;


        Bottle bottles[] = new Bottle[15];

        bottles[0] = botOne;
        bottles[1] = botTwo;
        bottles[2] = botThree;
        bottles[3] = botFour;
        bottles[4] = botFive;
        bottles[5] = botSix;
        bottles[6] = botSeven;
        bottles[7] = botEight;
        bottles[8] = botNine;
        bottles[9] = botTen;
        bottles[10] = botEleven;
        bottles[11] = botTwelve;
        bottles[12] = botThirteen;
        bottles[13] = botFourteen;
        bottles[14] = botFifteen;


        for (Bottle bottle : bottles) {
            System.out.println("Code: " + bottle.code);
            System.out.println("Brand: " + bottle.brand);
            System.out.println("Color: " + bottle.color);
            System.out.println("Capacity: " + bottle.capacity);
            System.out.println("Reusable: " + bottle.isReusable);
            System.out.println("----------------");
        }
    }
}