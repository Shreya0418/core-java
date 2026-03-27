class CaromBoardExecutor{
	
	public static void main(String[] args){
		
		//classname is aldo a datatype(obj ref)
		//className ref = new className
		
		CaromBoard board = new CaromBoard();
		board.brandName = "Korners";
		board.material = "Engineered Wood";
		board.theme = "Wood";
		board.genre = "Family";
		board.numberOfPlayers = 4;
		board.edition = "Standard Edition";
		board.countryOfOrigin = "India";
		board.unitCount = 1;
		board.minAgeRequired = 60;
		board.color = "Wooden";
		board.areBatteriesRequired = false;
		
		System.out.println("The brand is : " + board.brandName);
		Syste.out.println("The material is:" + board.material);
		System.out.println("The Theme is : " + board.theme);
		System.out.println("The genre is : " + board.genre);
		System.out.println("The numberOfPlayers is : " + board.numberOfPlayers);
		System.out.println("The edition is : " + board.edition);
		System.out.println("The countryOfOrigin is : " + board.countryOfOrigin);
		System.out.println("The unitCount is : " + board.unitCount);
		System.out.println("The minAgeRequired is : " + board.minAgeRequired);
		System.out.println("The color is : " + board.color);
		System.out.println("The areBatteriesRequired is : " + board.areBatteriesRequired);
		
		
		CaromBoard secondBoard = new CaromBoard() ;
		secondBoard.brandName = "Korners";
		secondBoard.material = "Engineered Wood";
		secondBoard.theme = "Wood";
		secondBoard.genre = "Family";
		secondBoard.numberOfPlayers = 4;
		secondBoard.edition = "Standard Edition";
		secondBoard.countryOfOrigin = "India";
		secondBoard.unitCount = 1;
		secondBoard.minAgeRequired = 60;
		secondBoard.color = "Wooden";
		secondBoard.areBatteriesRequired = false;
		
		System.out.println("The brand is : " + secondBoard.brandName);
		Syste.out.println("The material is:" + secondBoard.material);
		System.out.println("The Theme is : " + secondBoard.theme);
		System.out.println("The genre is : " + secondBoard.genre);
		System.out.println("The numberOfPlayers is : " + secondBoard.numberOfPlayers);
		System.out.println("The edition is : " + secondBoard.edition);
		System.out.println("The countryOfOrigin is : " + secondBoard.countryOfOrigin);
		System.out.println("The unitCount is : " + secondBoard.unitCount);
		System.out.println("The minAgeRequired is : " + secondBoard.minAgeRequired);
		System.out.println("The color is : " + secondBoard.color);
		System.out.println("The areBatteriesRequired is : " + secondBoard.areBatteriesRequired);
		
		
		
	}
}