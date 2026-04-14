class ChairExecutor {
    public static void main(String[] args) {

        Chair chairOne = new Chair();
        chairOne.id = 1;
        chairOne.material ="Wood";
        chairOne.color= "Brown";
        chairOne.height= 3.5;
        chairOne.price= 2500;

        Chair chairTwo = new Chair();
        chairTwo.id = 2;
        chairTwo.material = "Plastic";
        chairTwo.color = "White";
        chairTwo.height = 3.0;
        chairTwo.price = 1200;

        Chair chairThree = new Chair();
        chairThree.id = 3;
        chairThree.material = "Metal";
        chairThree.color = "Black";
        chairThree.height = 4.0;
        chairThree.price = 3200;

        Chair chairFour = new Chair();
        chairFour.id = 4;
        chairFour.material= "Leather";
        chairFour.color = "Grey";
        chairFour.height = 4.5;
        chairFour.price= 6500;


        Chair chairFive = new Chair();
        chairFive.id = 5;
        chairFive.material = "Wood";
        chairFive.color = "Cream";
        chairFive.height = 3.8;
        chairFive.price = 2800;

        Chair chairSix = new Chair();
        chairSix.id = 6;
        chairSix.material = "Plastic";
        chairSix.color = "Blue";
        chairSix.height = 3.2;
        chairSix.price = 1400;

        Chair chairSeven = new Chair();
        chairSeven.id = 7;
        chairSeven.material = "Steel";
        chairSeven.color = "Silver";
        chairSeven.height = 4.1;
        chairSeven.price = 3600;

        Chair chairEight = new Chair();
        chairEight.id = 8;
        chairEight.material = "Leather";
        chairEight.color = "Maroon";
        chairEight.height = 4.6;
        chairEight.price = 7000;

        Chair chairNine = new Chair();
        chairNine.id = 9;
        chairNine.material = "Wood";
        chairNine.color = "Black";
        chairNine.height = 3.9;
        chairNine.price = 3100;
        Chair chairTen = new Chair();
        chairTen.id = 10;
        chairTen.material = "Plastic";
        chairTen.color = "Green";
        chairTen.height = 3.1;
        chairTen.price = 1300;

        Chair chairEleven = new Chair();
        chairEleven.id = 11;
        chairEleven.material = "Metal";
        chairEleven.color = "Red";
        chairEleven.height = 4.2;
        chairEleven.price = 3400;
        Chair chairTwelve = new Chair();
        chairTwelve.id = 12;
        chairTwelve.material = "Wood";
        chairTwelve.color = "Orange";
        chairTwelve.height = 3.7;
        chairTwelve.price = 2600;

        Chair chairThirteen = new Chair();
        chairThirteen.id = 13;
        chairThirteen.material = "Steel";
        chairThirteen.color = "Gold";
        chairThirteen.height = 4.3;
        chairThirteen.price = 3900;

        Chair chairFourteen = new Chair();
        chairFourteen.id = 14;
        chairFourteen.material = "Leather";
        chairFourteen.color = "Purple";
        chairFourteen.height = 4.7;
        chairFourteen.price = 7200;

        Chair chairFifteen = new Chair();
        chairFifteen.id = 15;
        chairFifteen.material = "Plastic";
        chairFifteen.color = "Pink";
        chairFifteen.height = 3.3;
        chairFifteen.price = 1500;


        Chair chairs[] = new Chair[15];

        chairs[0] = chairOne;
        chairs[1] = chairTwo;
        chairs[2] = chairThree;
        chairs[3] = chairFour;
        chairs[4] = chairFive;
        chairs[5] = chairSix;
        chairs[6] = chairSeven;
        chairs[7] = chairEight;
        chairs[8] = chairNine;
        chairs[9] = chairTen;
        chairs[10] = chairEleven;
        chairs[11] = chairTwelve;
        chairs[12] = chairThirteen;
        chairs[13] = chairFourteen;
        chairs[14] = chairFifteen;


        for (Chair chair : chairs) {
            System.out.println("ID: " + chair.id);
            System.out.println("Material: " + chair.material);
            System.out.println("Color: " + chair.color);
            System.out.println("Height: " + chair.height);
            System.out.println("Price: " + chair.price);
            System.out.println("----------------");
        }
    }
}