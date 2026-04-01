class Remote{

	int remoteId;
	String brand;
	int buttons;
	String batteryType;
	boolean isWorking;

	public void getRemoteDetails(){
		System.out.println("Remote Id: " + remoteId);
		System.out.println("Brand: " + brand);
		System.out.println("Buttons: " + buttons);
		System.out.println("Battery: " + batteryType);
		System.out.println("Working: " + isWorking);
		System.out.println("---------------------------");
	}
}