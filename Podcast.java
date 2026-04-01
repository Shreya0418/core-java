class Podcast{
	String podcastName;
	String host;
	int episodes;
	boolean isPopular;
	String category;
	
	Guest guest;
	public void getPodcastDetails(){
		System.out.println("Podcast Name: " + podcastName);
		System.out.println("Host: " + host);
		System.out.println("Episodes: " + episodes);
		System.out.println("Popular: " + isPopular);
		System.out.println("Category: " + category);
		System.out.println("----------------------");
		guest.getGuestDetails();
	}
}