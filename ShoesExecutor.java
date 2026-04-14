class ShoesExecutor {
    public static void main(String[] args) {

        Shoes shoesOne = new Shoes();
        shoesOne.id = 1;
        shoesOne.brand = "Nike";
        shoesOne.size = 8;
        shoesOne.color = "Black";
        shoesOne.price = 4999;

  Shoes shoesTwo = new Shoes();
   shoesTwo.id = 2;
   shoesTwo.brand = "Adidas";
   shoesTwo.size = 9;
   shoesTwo.color = "White";
    shoesTwo.price = 4599;

       Shoes shoesThree = new Shoes();
        shoesThree.id = 3;
        shoesThree.brand = "Puma";
        shoesThree.size = 7;
        shoesThree.color = "Blue";
        shoesThree.price = 3999;

        Shoes shoesFour = new Shoes();
        shoesFour.id = 4;
        shoesFour.brand = "Reebok";
        shoesFour.size = 10;
        shoesFour.color = "Grey";
        shoesFour.price = 4299;

        Shoes shoesFive = new Shoes();
        shoesFive.id = 5;
        shoesFive.brand = "Skechers";
        shoesFive.size = 8;
        shoesFive.color = "Red";
        shoesFive.price = 5499;

        Shoes shoesSix = new Shoes();
        shoesSix.id = 6;
        shoesSix.brand = "Woodland";
        shoesSix.size = 9;
        shoesSix.color = "Brown";
        shoesSix.price = 5999;

        Shoes shoesSeven = new Shoes();
        shoesSeven.id = 7;
        shoesSeven.brand = "Bata";
        shoesSeven.size = 6;
        shoesSeven.color = "Black";
        shoesSeven.price = 1999;

        Shoes shoesEight = new Shoes();
        shoesEight.id = 8;
        shoesEight.brand = "Campus";
        shoesEight.size = 8;
        shoesEight.color = "Navy";
        shoesEight.price = 2499;

        Shoes shoesNine = new Shoes();
        shoesNine.id = 9;
        shoesNine.brand = "Fila";
        shoesNine.size = 10;
        shoesNine.color = "White";
        shoesNine.price = 3799;

        Shoes shoesTen = new Shoes();
        shoesTen.id = 10;
        shoesTen.brand = "Converse";
        shoesTen.size = 7;
        shoesTen.color = "Black";
        shoesTen.price = 4899;

        Shoes shoesEleven = new Shoes();
        shoesEleven.id = 11;
        shoesEleven.brand = "New Balance";
        shoesEleven.size = 9;
        shoesEleven.color = "Grey";
        shoesEleven.price = 6999;

        Shoes shoesTwelve = new Shoes();
        shoesTwelve.id = 12;
        shoesTwelve.brand = "Asics";
        shoesTwelve.size = 8;
        shoesTwelve.color = "Blue";
        shoesTwelve.price = 6499;

        Shoes shoesThirteen = new Shoes();
        shoesThirteen.id = 13;
        shoesThirteen.brand = "Crocs";
        shoesThirteen.size = 6;
        shoesThirteen.color = "Green";
        shoesThirteen.price = 2999;

        Shoes shoesFourteen = new Shoes();
        shoesFourteen.id = 14;
        shoesFourteen.brand = "Under Armour";
        shoesFourteen.size = 10;
        shoesFourteen.color = "Orange";
        shoesFourteen.price = 7599;

        Shoes shoesFifteen = new Shoes();
        shoesFifteen.id = 15;
        shoesFifteen.brand = "Jordan";
        shoesFifteen.size = 9;
        shoesFifteen.color = "Red";
        shoesFifteen.price = 12999;


        Shoes shoesArr[] = new Shoes[15];

        shoesArr[0]=shoesOne;
        shoesArr[1] =shoesTwo;
        shoesArr[2]=shoesThree;
        shoesArr[3] =shoesFour;
        shoesArr[4]=shoesFive;
        shoesArr[5]=shoesSix;
        shoesArr[6] =shoesSeven;
        shoesArr[7]=shoesEight;
        shoesArr[8] =shoesNine;
        shoesArr[9] =shoesTen;
        shoesArr[10]=shoesEleven;
        shoesArr[11]=shoesTwelve;
        shoesArr[12]=shoesThirteen;
        shoesArr[13]=shoesFourteen;
        shoesArr[14]=shoesFifteen;


        for (Shoes shoes : shoesArr) {
            System.out.println("ID: " + shoes.id);
            System.out.println("Brand: " + shoes.brand);
            System.out.println("Size: " + shoes.size);
            System.out.println("Color: " + shoes.color);
            System.out.println("Price: " + shoes.price);
            System.out.println("----------------");
        }
    }
}