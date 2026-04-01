class Bangalore{

	String area;
	String state;
	int population;
	boolean isMetro;
	String famousFor;

	MallOfAsia mall;

	public void getBangaloreDetails(){
		System.out.println("Area: " + area);
		System.out.println("State: " + state);
		System.out.println("Population: " + population);
		System.out.println("Metro: " + isMetro);
		System.out.println("Famous For: " + famousFor);
		System.out.println("----------------------");

		mall.getMallDetails();
	}
}