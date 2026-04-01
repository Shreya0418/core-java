class OTTPlatform{

	String platformName;
	String owner;
	int totalShows;
	boolean isPopular;
	String region;

	Subscription subscription;

	public void getPlatformDetails(){
		System.out.println("Platform Name: " + platformName);
		System.out.println("Owner: " + owner);
		System.out.println("Shows: " + totalShows);
		System.out.println("Popular: " + isPopular);
		System.out.println("Region: " + region);
		System.out.println("----------------------");

		subscription.getSubscriptionDetails();
	}
}