class Platform{

	int platformNumber;
	String trainName;
	String arrivalTime;
	String departureTime;
	boolean isAvailable;

	public void getPlatformDetails(){
		System.out.println("Platform No: " + platformNumber);
		System.out.println("Train Name: " + trainName);
		System.out.println("Arrival: " + arrivalTime);
		System.out.println("Departure: " + departureTime);
		System.out.println("Available: " + isAvailable);
		System.out.println("---------------------------");
	}
}