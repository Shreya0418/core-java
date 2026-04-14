class MouseExecutor {
    public static void main(String[] args) {

        Mouse mouseOne = new Mouse();
        mouseOne.id = 1;
        mouseOne.brand = "Logitech";
        mouseOne.dpi = 1600;
        mouseOne.isWireless = true;
        mouseOne.price = 1200;

        Mouse mouseTwo = new Mouse();
        mouseTwo.id = 2;
        mouseTwo.brand = "HP";
        mouseTwo.dpi = 1200;
        mouseTwo.isWireless = false;
        mouseTwo.price = 600;

        Mouse mouseThree = new Mouse();
        mouseThree.id = 3;
        mouseThree.brand = "Dell";
        mouseThree.dpi = 1000;
        mouseThree.isWireless = false;
        mouseThree.price = 500;

        Mouse mouseFour = new Mouse();
        mouseFour.id = 4;
        mouseFour.brand = "Razer";
        mouseFour.dpi = 20000;
        mouseFour.isWireless = true;
        mouseFour.price = 8500;

        Mouse mouseFive = new Mouse();
        mouseFive.id = 5;
        mouseFive.brand = "Corsair";
        mouseFive.dpi = 18000;
        mouseFive.isWireless = true;
        mouseFive.price = 7200;

        Mouse mouseSix = new Mouse();
        mouseSix.id = 6;
        mouseSix.brand = "Redragon";
        mouseSix.dpi = 12400;
        mouseSix.isWireless = false;
        mouseSix.price = 2400;

        Mouse mouseSeven = new Mouse();
        mouseSeven.id = 7;
        mouseSeven.brand = "Zebronics";
        mouseSeven.dpi = 3200;
        mouseSeven.isWireless = false;
        mouseSeven.price = 900;

        Mouse mouseEight = new Mouse();
        mouseEight.id = 8;
        mouseEight.brand = "Lenovo";
        mouseEight.dpi = 1600;
        mouseEight.isWireless = true;
        mouseEight.price = 1100;

        Mouse mouseNine = new Mouse();
        mouseNine.id = 9;
        mouseNine.brand = "Apple";
        mouseNine.dpi = 1300;
        mouseNine.isWireless = true;
        mouseNine.price = 6900;

        Mouse mouseTen = new Mouse();
        mouseTen.id = 10;
        mouseTen.brand = "Microsoft";
        mouseTen.dpi = 1000;
        mouseTen.isWireless = true;
        mouseTen.price = 2100;

        Mouse mouseEleven = new Mouse();
        mouseEleven.id = 11;
        mouseEleven.brand = "Asus";
        mouseEleven.dpi = 8000;
        mouseEleven.isWireless = false;
        mouseEleven.price = 3400;

        Mouse mouseTwelve = new Mouse();
        mouseTwelve.id = 12;
        mouseTwelve.brand = "Acer";
        mouseTwelve.dpi = 1200;
        mouseTwelve.isWireless = false;
        mouseTwelve.price = 700;

        Mouse mouseThirteen = new Mouse();
        mouseThirteen.id = 13;
        mouseThirteen.brand = "HyperX";
        mouseThirteen.dpi = 16000;
        mouseThirteen.isWireless = true;
        mouseThirteen.price = 6500;

        Mouse mouseFourteen = new Mouse();
        mouseFourteen.id = 14;
        mouseFourteen.brand = "Ant Esports";
        mouseFourteen.dpi = 4800;
        mouseFourteen.isWireless = false;
        mouseFourteen.price = 1500;

        Mouse mouseFifteen = new Mouse();
        mouseFifteen.id = 15;
        mouseFifteen.brand = "Portronics";
        mouseFifteen.dpi = 1600;
        mouseFifteen.isWireless = true;
        mouseFifteen.price = 999;


        Mouse mice[] = new Mouse[15];

        mice[0] = mouseOne;
        mice[1] = mouseTwo;
        mice[2] = mouseThree;
        mice[3] = mouseFour;
        mice[4] = mouseFive;
        mice[5] = mouseSix;
        mice[6] = mouseSeven;
        mice[7] = mouseEight;
        mice[8] = mouseNine;
        mice[9] = mouseTen;
        mice[10] = mouseEleven;
        mice[11] = mouseTwelve;
        mice[12] = mouseThirteen;
        mice[13] = mouseFourteen;
        mice[14] = mouseFifteen;


        for (Mouse mouse : mice) {
            System.out.println("ID: " + mouse.id);
            System.out.println("Brand: " + mouse.brand);
            System.out.println("DPI: " + mouse.dpi);
            System.out.println("Wireless: " + mouse.isWireless);
            System.out.println("Price: " + mouse.price);
            System.out.println("----------------");
        }
    }
}