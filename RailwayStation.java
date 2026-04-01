class RailwayStation{

	String stationName;
	String location;
	int numberOfPlatforms;
	boolean isJunction;
	String zone;

	Platform platform;

	public void getStationDetails(){
		System.out.println("Station Name: " + stationName);
		System.out.println("Location: " + location);
		System.out.println("Platforms: " + numberOfPlatforms);
		System.out.println("Junction: " + isJunction);
		System.out.println("Zone: " + zone);
		System.out.println("----------------------");

		platform.getPlatformDetails();
	}
}