class Series{

	String seriesName;
	String platform;
	int seasons;
	boolean isCompleted;
	String genre;

	Episode episode;

	public void getSeriesDetails(){
		System.out.println("Series Name: " + seriesName);
		System.out.println("Platform: " + platform);
		System.out.println("Seasons: " + seasons);
		System.out.println("Completed: " + isCompleted);
		System.out.println("Genre: " + genre);
		System.out.println("----------------------");

		episode.getEpisodeDetails();
	}
}