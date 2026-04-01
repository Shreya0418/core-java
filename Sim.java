class Sim{
	
	int simId;
	String network;
	String type;
	double balance;
	boolean isActive;
	
	public void getSimDetails() {
		System.out.println("Sim Id: " + simId);
		System.out.println("Network: " + network);
		System.out.println("Type: " + type);
		System.out.println("Balance:" + balance);
		System.out.println("Active:"+isActive);
		System.out.println("---------------------");
	}
}