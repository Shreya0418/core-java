class HeadphonesExecutor {
    public static void main(String[] args) {

        Headphones headOne = new Headphones();
        headOne.id = 1;
        headOne.brand = "Sony";
        headOne.type = "Over Ear";
        headOne.isNoiseCancelling = true;
        headOne.price = 12000;

        Headphones headTwo = new Headphones();
        headTwo.id = 2;
        headTwo.brand = "Boat";
        headTwo.type = "On Ear";
        headTwo.isNoiseCancelling = false;
        headTwo.price = 2500;

        Headphones headThree = new Headphones();
        headThree.id = 3;
        headThree.brand = "JBL";
        headThree.type = "Over Ear";
        headThree.isNoiseCancelling = true;
        headThree.price = 8500;

        Headphones headFour = new Headphones();
        headFour.id = 4;
        headFour.brand = "Bose";
        headFour.type = "Over Ear";
        headFour.isNoiseCancelling = true;
        headFour.price = 28000;

        Headphones headFive = new Headphones();
        headFive.id = 5;
        headFive.brand = "Apple";
        headFive.type = "In Ear";
        headFive.isNoiseCancelling = true;
        headFive.price = 24000;

        Headphones headSix = new Headphones();
        headSix.id = 6;
        headSix.brand = "Realme";
        headSix.type = "In Ear";
        headSix.isNoiseCancelling = false;
        headSix.price = 2200;

        Headphones headSeven = new Headphones();
        headSeven.id = 7;
        headSeven.brand = "Noise";
        headSeven.type = "Neckband";
        headSeven.isNoiseCancelling = false;
        headSeven.price = 1800;

        Headphones headEight = new Headphones();
        headEight.id = 8;
        headEight.brand = "Sennheiser";
        headEight.type = "Over Ear";
        headEight.isNoiseCancelling = true;
        headEight.price = 15000;

        Headphones headNine = new Headphones();
        headNine.id = 9;
        headNine.brand = "Skullcandy";
        headNine.type = "On Ear";
        headNine.isNoiseCancelling = false;
        headNine.price = 4200;

        Headphones headTen = new Headphones();
        headTen.id = 10;
        headTen.brand = "OnePlus";
        headTen.type = "In Ear";
        headTen.isNoiseCancelling = true;
        headTen.price = 5500;

        Headphones headEleven = new Headphones();
        headEleven.id = 11;
        headEleven.brand = "Marshall";
        headEleven.type = "Over Ear";
        headEleven.isNoiseCancelling = true;
        headEleven.price = 18000;

        Headphones headTwelve = new Headphones();
        headTwelve.id = 12;
        headTwelve.brand = "HyperX";
        headTwelve.type = "Gaming";
        headTwelve.isNoiseCancelling = true;
        headTwelve.price = 9500;

        Headphones headThirteen = new Headphones();
        headThirteen.id = 13;
        headThirteen.brand = "Razer";
        headThirteen.type = "Gaming";
        headThirteen.isNoiseCancelling = true;
        headThirteen.price = 11000;

        Headphones headFourteen = new Headphones();
        headFourteen.id = 14;
        headFourteen.brand = "Logitech";
        headFourteen.type = "Gaming";
        headFourteen.isNoiseCancelling = false;
        headFourteen.price = 6000;

        Headphones headFifteen = new Headphones();
        headFifteen.id = 15;
        headFifteen.brand = "Portronics";
        headFifteen.type = "Neckband";
        headFifteen.isNoiseCancelling = false;
        headFifteen.price = 1500;


        Headphones headphones[] = new Headphones[15];

        headphones[0] = headOne;
        headphones[1] = headTwo;
        headphones[2] = headThree;
        headphones[3] = headFour;
        headphones[4] = headFive;
        headphones[5] = headSix;
        headphones[6] = headSeven;
        headphones[7] = headEight;
        headphones[8] = headNine;
        headphones[9] = headTen;
        headphones[10] = headEleven;
        headphones[11] = headTwelve;
        headphones[12] = headThirteen;
        headphones[13] = headFourteen;
        headphones[14] = headFifteen;


        for (Headphones head : headphones) {
            System.out.println("ID: " + head.id);
            System.out.println("Brand: " + head.brand);
            System.out.println("Type: " + head.type);
            System.out.println("Noise Cancelling: " + head.isNoiseCancelling);
            System.out.println("Price: " + head.price);
            System.out.println("----------------");
        }
    }
}