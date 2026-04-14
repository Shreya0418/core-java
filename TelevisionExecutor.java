class TelevisionExecutor {
    public static void main(String[] args) {

        Television tvOne = new Television();
        tvOne.id = 1;
        tvOne.brand = "Samsung";
        tvOne.screenSize = 43;
        tvOne.isSmart = true;
        tvOne.price = 32000;

        Television tvTwo = new Television();
        tvTwo.id = 2;
        tvTwo.brand = "LG";
        tvTwo.screenSize = 55;
        tvTwo.isSmart = true;
        tvTwo.price = 55000;

        Television tvThree = new Television();
        tvThree.id = 3;
        tvThree.brand = "Sony";
        tvThree.screenSize = 65;
        tvThree.isSmart = true;
        tvThree.price = 85000;

        Television tvFour = new Television();
        tvFour.id = 4;
        tvFour.brand = "OnePlus";
        tvFour.screenSize = 50;
        tvFour.isSmart = true;
        tvFour.price = 42000;

        Television tvFive = new Television();
        tvFive.id = 5;
        tvFive.brand = "Xiaomi";
        tvFive.screenSize = 43;
        tvFive.isSmart = true;
        tvFive.price = 29000;

        Television tvSix = new Television();
        tvSix.id = 6;
        tvSix.brand = "Panasonic";
        tvSix.screenSize = 32;
        tvSix.isSmart = false;
        tvSix.price = 18000;

        Television tvSeven = new Television();
        tvSeven.id = 7;
        tvSeven.brand = "TCL";
        tvSeven.screenSize = 55;
        tvSeven.isSmart = true;
        tvSeven.price = 39000;

        Television tvEight = new Television();
        tvEight.id = 8;
        tvEight.brand = "Vu";
        tvEight.screenSize = 50;
        tvEight.isSmart = true;
        tvEight.price = 36000;

        Television tvNine = new Television();
        tvNine.id = 9;
        tvNine.brand = "Philips";
        tvNine.screenSize = 43;
        tvNine.isSmart = false;
        tvNine.price = 25000;

        Television tvTen = new Television();
        tvTen.id = 10;
        tvTen.brand = "Realme";
        tvTen.screenSize = 32;
        tvTen.isSmart = true;
        tvTen.price = 22000;

        Television tvEleven = new Television();
        tvEleven.id = 11;
        tvEleven.brand = "Acer";
        tvEleven.screenSize = 65;
        tvEleven.isSmart = true;
        tvEleven.price = 72000;

        Television tvTwelve = new Television();
        tvTwelve.id = 12;
        tvTwelve.brand = "Motorola";
        tvTwelve.screenSize = 43;
        tvTwelve.isSmart = true;
        tvTwelve.price = 28000;

        Television tvThirteen = new Television();
        tvThirteen.id = 13;
        tvThirteen.brand = "Kodak";
        tvThirteen.screenSize = 40;
        tvThirteen.isSmart = false;
        tvThirteen.price = 21000;

        Television tvFourteen = new Television();
        tvFourteen.id = 14;
        tvFourteen.brand = "Haier";
        tvFourteen.screenSize = 55;
        tvFourteen.isSmart = true;
        tvFourteen.price = 45000;

        Television tvFifteen = new Television();
        tvFifteen.id = 15;
        tvFifteen.brand = "BPL";
        tvFifteen.screenSize = 32;
        tvFifteen.isSmart = false;
        tvFifteen.price = 16000;

        Television televisions[] = new Television[15];

        televisions[0] = tvOne;
        televisions[1] = tvTwo;
        televisions[2] = tvThree;
        televisions[3] = tvFour;
        televisions[4] = tvFive;
        televisions[5] = tvSix;
        televisions[6] = tvSeven;
        televisions[7] = tvEight;
        televisions[8] = tvNine;
        televisions[9] = tvTen;
        televisions[10] = tvEleven;
        televisions[11] = tvTwelve;
        televisions[12] = tvThirteen;
        televisions[13] = tvFourteen;
        televisions[14] = tvFifteen;


        for (Television tv : televisions) {
            System.out.println("ID: " + tv.id);
            System.out.println("Brand: " + tv.brand);
            System.out.println("Screen Size: " + tv.screenSize + " inch");
            System.out.println("Smart TV: " + tv.isSmart);
            System.out.println("Price: " + tv.price);
            System.out.println("----------------");
        }
    }
}