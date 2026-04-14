class PenExecutor {
    public static void main(String[] args) {

        Pen penOne = new Pen();
        penOne.id = 1;
        penOne.brand = "Reynolds";
        penOne.inkColor = "Blue";
        penOne.type = "Ball";
        penOne.price = 10;

        Pen penTwo = new Pen();
        penTwo.id = 2;
        penTwo.brand = "Cello";
        penTwo.inkColor = "Black";
        penTwo.type = "Gel";
        penTwo.price = 15;

        Pen penThree = new Pen();
        penThree.id = 3;
        penThree.brand = "Parker";
        penThree.inkColor = "Blue";
        penThree.type = "Fountain";
        penThree.price = 450;

        Pen penFour = new Pen();
        penFour.id = 4;
        penFour.brand = "Flair";
        penFour.inkColor = "Red";
        penFour.type = "Gel";
        penFour.price = 20;

        Pen penFive = new Pen();
        penFive.id = 5;
        penFive.brand = "Linc";
        penFive.inkColor = "Green";
        penFive.type = "Ball";
        penFive.price = 12;

        Pen penSix = new Pen();
        penSix.id = 6;
        penSix.brand = "Trimax";
        penSix.inkColor = "Black";
        penSix.type = "Roller";
        penSix.price = 35;

        Pen penSeven = new Pen();
        penSeven.id = 7;
        penSeven.brand = "Hauser";
        penSeven.inkColor = "Blue";
        penSeven.type = "Ball";
        penSeven.price = 8;

        Pen penEight = new Pen();
        penEight.id = 8;
        penEight.brand = "Montex";
        penEight.inkColor = "Purple";
        penEight.type = "Gel";
        penEight.price = 18;

        Pen penNine = new Pen();
        penNine.id = 9;
        penNine.brand = "Pierre Cardin";
        penNine.inkColor = "Black";
        penNine.type = "Fountain";
        penNine.price = 600;

        Pen penTen = new Pen();
        penTen.id = 10;
        penTen.brand = "Pilot";
        penTen.inkColor = "Blue";
        penTen.type = "Gel";
        penTen.price = 50;

        Pen penEleven = new Pen();
        penEleven.id = 11;
        penEleven.brand = "Pentel";
        penEleven.inkColor = "Red";
        penEleven.type = "Roller";
        penEleven.price = 40;

        Pen penTwelve = new Pen();
        penTwelve.id = 12;
        penTwelve.brand = "Luxor";
        penTwelve.inkColor = "Black";
        penTwelve.type = "Ball";
        penTwelve.price = 25;

        Pen penThirteen = new Pen();
        penThirteen.id = 13;
        penThirteen.brand = "Classmate";
        penThirteen.inkColor = "Blue";
        penThirteen.type = "Gel";
        penThirteen.price = 12;

        Pen penFourteen = new Pen();
        penFourteen.id = 14;
        penFourteen.brand = "Nataraj";
        penFourteen.inkColor = "Green";
        penFourteen.type = "Ball";
        penFourteen.price = 5;

        Pen penFifteen = new Pen();
        penFifteen.id = 15;
        penFifteen.brand = "Camlin";
        penFifteen.inkColor = "Violet";
        penFifteen.type = "Sketch";
        penFifteen.price = 30;


        Pen pens[] = new Pen[15];

        pens[0] = penOne;
        pens[1] = penTwo;
        pens[2] = penThree;
        pens[3] = penFour;
        pens[4] = penFive;
        pens[5] = penSix;
        pens[6] = penSeven;
        pens[7] = penEight;
        pens[8] = penNine;
        pens[9] = penTen;
        pens[10] = penEleven;
        pens[11] = penTwelve;
        pens[12] = penThirteen;
        pens[13] = penFourteen;
        pens[14] = penFifteen;


        for (Pen pen : pens) {
            System.out.println("ID: " + pen.id);
            System.out.println("Brand: " + pen.brand);
            System.out.println("Ink Color: " + pen.inkColor);
            System.out.println("Type: " + pen.type);
            System.out.println("Price: " + pen.price);
            System.out.println("----------------");
        }
    }
}