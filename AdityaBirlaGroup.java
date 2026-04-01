class AdityaBirlaGroup{
	String chairman;
	String industry;
	int revenue;
	boolean isGlobal;
	String headquarters;
	RCB team;
	public void getCompanyDetails(){
		System.out.println("Chairman: " + chairman);
		System.out.println("Industry: " + industry);
		System.out.println("Revenue: " + revenue);
		System.out.println("Global: " + isGlobal);
		System.out.println("HQ: " + headquarters);
		System.out.println("----------------------");

		team.getRCBDetails();
	}
}