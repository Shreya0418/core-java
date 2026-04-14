class FanExecutor {
    public static void main(String[] args) {

        Fan fanOne= new Fan();
        fanOne.id = 1;
        fanOne.brand= "Havells";
        fanOne.speedLevels = 5;
        fanOne.isRemoteControlled = true;
        fanOne.price = 3200;

        Fan fanTwo = new Fan();
        fanTwo.id = 2;
        fanTwo.brand= "Usha";
        fanTwo.speedLevels = 4;
        fanTwo.isRemoteControlled = false;
        fanTwo.price = 2800;

        Fan fanThree = new Fan();
        fanThree.id = 3;
        fanThree.brand ="Orient";
        fanThree.speedLevels = 5;
        fanThree.isRemoteControlled = true;
        fanThree.price = 3500;

        Fan fanFour= new Fan();
        fanFour.id = 4;
        fanFour.brand = "Crompton";
        fanFour.speedLevels = 3;
        fanFour.isRemoteControlled = false;
        fanFour.price = 2500;

        Fan fanFive =new Fan();
        fanFive.id = 5;
        fanFive.brand = "Bajaj";
        fanFive.speedLevels = 5;
        fanFive.isRemoteControlled = true;
        fanFive.price =3300;

        Fan fanSix = new Fan();
        fanSix.id = 6;
        fanSix.brand ="Atomberg";
        fanSix.speedLevels = 6;
        fanSix.isRemoteControlled = true;
        fanSix.price = 4200;

        Fan fanSeven = new Fan();
        fanSeven.id = 7;
        fanSeven.brand = "LG";
        fanSeven.speedLevels = 4;
        fanSeven.isRemoteControlled = false;
        fanSeven.price = 2900;

        Fan fanEight = new Fan();
        fanEight.id = 8;
        fanEight.brand = "Samsung";
        fanEight.speedLevels = 5;
        fanEight.isRemoteControlled = true;
        fanEight.price = 3900;

        Fan fanNine = new Fan();
        fanNine.id= 9;
        fanNine.brand = "Panasonic";
        fanNine.speedLevels = 4;
        fanNine.isRemoteControlled = false;
        fanNine.price = 3000;

        Fan fanTen =new Fan();
        fanTen.id = 10;
        fanTen.brand = "Khaitan";
        fanTen.speedLevels = 3;
        fanTen.isRemoteControlled = false;
        fanTen.price = 2400;

        Fan fanEleven = new Fan();
        fanEleven.id = 11;
        fanEleven.brand = "VGuard";
        fanEleven.speedLevels = 5;
        fanEleven.isRemoteControlled = true;
        fanEleven.price = 3600;

        Fan fanTwelve = new Fan();
        fanTwelve.id = 12;
        fanTwelve.brand = "Syska";
        fanTwelve.speedLevels = 6;
        fanTwelve.isRemoteControlled = true;
        fanTwelve.price = 4100;

        Fan fanThirteen = new Fan();
        fanThirteen.id = 13;
        fanThirteen.brand = "Anchor";
        fanThirteen.speedLevels = 4;
        fanThirteen.isRemoteControlled = false;
        fanThirteen.price = 2700;

        Fan fanFourteen = new Fan();
        fanFourteen.id = 14;
        fanFourteen.brand = "Philips";
        fanFourteen.speedLevels = 5;
        fanFourteen.isRemoteControlled = true;
        fanFourteen.price = 3800;

        Fan fanFifteen = new Fan();
        fanFifteen.id = 15;
        fanFifteen.brand = "Maharaja";
        fanFifteen.speedLevels = 3;
        fanFifteen.isRemoteControlled = false;
        fanFifteen.price = 2300;


        Fan fans[] = new Fan[15];

        fans[0] = fanOne;
        fans[1]= fanTwo;
        fans[2]= fanThree;
        fans[3] = fanFour;
        fans[4]= fanFive;
        fans[5] = fanSix;
        fans[6]= fanSeven;
        fans[7]=fanEight;
        fans[8]=fanNine;
        fans[9]=fanTen;
        fans[10]=fanEleven;
        fans[11]=fanTwelve;
        fans[12]=fanThirteen;
        fans[13]=fanFourteen;
        fans[14]= fanFifteen;


        for (Fan fan : fans) {
            System.out.println("ID: " + fan.id);
            System.out.println("Brand: " + fan.brand);
            System.out.println("Speed Levels: " + fan.speedLevels);
            System.out.println("Remote Controlled: " + fan.isRemoteControlled);
            System.out.println("Price: " + fan.price);
            System.out.println(" ");
        }
    }
}