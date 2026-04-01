class Episode{

	int episodeNumber;
	String title;
	int duration;
	String releaseDate;
	boolean isHit;

	public void getEpisodeDetails(){
		System.out.println("Episode No: " + episodeNumber);
		System.out.println("Title: " + title);
		System.out.println("Duration: " + duration);
		System.out.println("Release Date: " + releaseDate);
		System.out.println("Hit: " + isHit);
		System.out.println("---------------------------");
	}
}