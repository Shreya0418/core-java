class TableExecutor {
    public static void main(String[] args) {

        Table tableOne = new Table();
        tableOne.id = 1;
        tableOne.material = "Wood";
        tableOne.shape = "Rectangle";
        tableOne.color = "Brown";
        tableOne.price = 4500;

        Table tableTwo = new Table();
        tableTwo.id = 2;
        tableTwo.material = "Glass";
        tableTwo.shape = "Round";
        tableTwo.color = "Transparent";
        tableTwo.price = 6200;

        Table tableThree = new Table();
        tableThree.id = 3;
        tableThree.material = "Steel";
        tableThree.shape = "Square";
        tableThree.color = "Silver";
        tableThree.price = 5300;

        Table tableFour = new Table();
        tableFour.id = 4;
        tableFour.material = "Plastic";
        tableFour.shape = "Rectangle";
        tableFour.color = "White";
        tableFour.price = 2500;

        Table tableFive = new Table();
        tableFive.id = 5;
        tableFive.material = "Marble";
        tableFive.shape = "Oval";
        tableFive.color = "Black";
        tableFive.price = 12000;

        Table tableSix = new Table();
        tableSix.id = 6;
        tableSix.material = "Wood";
        tableSix.shape = "Square";
        tableSix.color = "Walnut";
        tableSix.price = 6800;

        Table tableSeven = new Table();
        tableSeven.id = 7;
        tableSeven.material = "Steel";
        tableSeven.shape = "Rectangle";
        tableSeven.color = "Grey";
        tableSeven.price = 4900;

        Table tableEight = new Table();
        tableEight.id = 8;
        tableEight.material = "Glass";
        tableEight.shape = "Oval";
        tableEight.color = "Blue";
        tableEight.price = 7300;

        Table tableNine = new Table();
        tableNine.id = 9;
        tableNine.material = "Wood";
        tableNine.shape = "Round";
        tableNine.color = "Dark Brown";
        tableNine.price = 8100;

        Table tableTen = new Table();
        tableTen.id = 10;
        tableTen.material = "Plastic";
        tableTen.shape = "Square";
        tableTen.color = "Red";
        tableTen.price = 2200;

        Table tableEleven = new Table();
        tableEleven.id = 11;
        tableEleven.material = "Marble";
        tableEleven.shape = "Rectangle";
        tableEleven.color = "White";
        tableEleven.price = 14500;

        Table tableTwelve = new Table();
        tableTwelve.id = 12;
        tableTwelve.material = "Steel";
        tableTwelve.shape = "Round";
        tableTwelve.color = "Black";
        tableTwelve.price = 5800;

        Table tableThirteen = new Table();
        tableThirteen.id = 13;
        tableThirteen.material = "Glass";
        tableThirteen.shape = "Rectangle";
        tableThirteen.color = "Green";
        tableThirteen.price = 7600;

        Table tableFourteen = new Table();
        tableFourteen.id = 14;
        tableFourteen.material = "Wood";
        tableFourteen.shape = "Oval";
        tableFourteen.color = "Cherry";
        tableFourteen.price = 9300;

        Table tableFifteen = new Table();
        tableFifteen.id = 15;
        tableFifteen.material = "Plastic";
        tableFifteen.shape = "Round";
        tableFifteen.color = "Pink";
        tableFifteen.price = 2700;


        Table tables[] = new Table[15];

        tables[0] = tableOne;
        tables[1] = tableTwo;
        tables[2] = tableThree;
        tables[3] = tableFour;
        tables[4] = tableFive;
        tables[5] = tableSix;
        tables[6] = tableSeven;
        tables[7] = tableEight;
        tables[8] = tableNine;
        tables[9] = tableTen;
        tables[10] = tableEleven;
        tables[11] = tableTwelve;
        tables[12] = tableThirteen;
        tables[13] = tableFourteen;
        tables[14] = tableFifteen;


        for (Table table : tables) {
            System.out.println("ID: " + table.id);
            System.out.println("Material: " + table.material);
            System.out.println("Shape: " + table.shape);
            System.out.println("Color: " + table.color);
            System.out.println("Price: " + table.price);
            System.out.println("----------------");
        }
    }
}