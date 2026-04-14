class WallExecutor{
	
	public static void main(String[] w){
		
		Wall wallOne = new Wall();
		wallOne.code = 1;
		wallOne.name = "Nippon";
		wallOne.color = "Grey";
		wallOne.isWaterProof = true;
		wallOne.price = 785.25;
		
		Wall wallTwo = new Wall();
		wallTwo.code = 48;
		wallTwo.name = "Shh";
		wallTwo.color = "Burgundy";
		wallTwo.isWaterProof = false;
		wallTwo.price = 7812.2;
		
		Wall wallThree = new Wall();
        wallThree.code = 3;
        wallThree.name = "Asian";
        wallThree.color = "White";
        wallThree.isWaterProof = true;
        wallThree.price = 950.50;

        Wall wallFour = new Wall();
        wallFour.code = 4;
        wallFour.name = "Berger";
        wallFour.color = "Blue";
        wallFour.isWaterProof = false;
        wallFour.price = 820.75;

        Wall wallFive = new Wall();
        wallFive.code = 5;
        wallFive.name = "Dulux";
        wallFive.color = "Green";
        wallFive.isWaterProof = true;
        wallFive.price = 1100.00;

        Wall wallSix = new Wall();
        wallSix.code = 6;
        wallSix.name = "Indigo";
        wallSix.color = "Yellow";
        wallSix.isWaterProof = false;
        wallSix.price = 760.90;

        Wall wallSeven = new Wall();
        wallSeven.code = 7;
        wallSeven.name = "Ace";
        wallSeven.color = "Pink";
        wallSeven.isWaterProof = true;
        wallSeven.price = 999.99;

        Wall wallEight = new Wall();
        wallEight.code = 8;
        wallEight.name = "Royal";
        wallEight.color = "Black";
        wallEight.isWaterProof = true;
        wallEight.price = 1450.25;

        Wall wallNine = new Wall();
        wallNine.code = 9;
        wallNine.name = "Lux";
        wallNine.color = "Orange";
        wallNine.isWaterProof = false;
        wallNine.price = 675.30;

        Wall wallTen = new Wall();
        wallTen.code = 10;
        wallTen.name = "Prime";
        wallTen.color = "Red";
        wallTen.isWaterProof = true;
        wallTen.price = 1320.40;

        Wall wallEleven = new Wall();
        wallEleven.code = 11;
        wallEleven.name = "Eco";
        wallEleven.color = "Cream";
        wallEleven.isWaterProof = false;
        wallEleven.price = 540.20;

        Wall wallTwelve = new Wall();
        wallTwelve.code = 12;
        wallTwelve.name = "Smart";
        wallTwelve.color = "Purple";
        wallTwelve.isWaterProof = true;
        wallTwelve.price = 870.10;

        Wall wallThirteen = new Wall();
        wallThirteen.code = 13;
        wallThirteen.name = "Ultra";
        wallThirteen.color = "Silver";
        wallThirteen.isWaterProof = true;
        wallThirteen.price = 2100.75;

        Wall wallFourteen = new Wall();
        wallFourteen.code = 14;
        wallFourteen.name = "Master";
        wallFourteen.color = "Gold";
        wallFourteen.isWaterProof = false;
        wallFourteen.price = 1800.60;

        Wall wallFifteen = new Wall();
        wallFifteen.code = 15;
        wallFifteen.name = "Elite";
        wallFifteen.color = "Brown";
        wallFifteen.isWaterProof = true;
        wallFifteen.price = 1999.99;
		
		
		
		Wall walls[] = new Wall[15];

        walls[0] = wallOne;
        walls[1] = wallTwo;
        walls[2] = wallThree;
        walls[3] = wallFour;
        walls[4] = wallFive;
        walls[5] = wallSix;
        walls[6] = wallSeven;
        walls[7] = wallEight;
        walls[8] = wallNine;
        walls[9] = wallTen;
        walls[10] = wallEleven;
        walls[11] = wallTwelve;
        walls[12] = wallThirteen;
        walls[13] = wallFourteen;
        walls[14] = wallFifteen;
		
		
		//fetching details
		for(Wall wall : walls){
			System.out.println("The Code is: " + wall.code);
			System.out.println("The wall Name is: " + wall.name);
			System.out.println("The color is: " + wall.color);
			System.out.println("The Water resistency!? :" + wall.isWaterProof);
			System.out.println("The price is: " + wall.price);
			System.out.println("--------------");
			
		}
		
	}
	
}