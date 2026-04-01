class Movie{

	String movieName;
	String language;
	int budget;
	boolean isHit;
	String genre;

	Actor actor;

	public void getMovieDetails(){
		System.out.println("Movie Name: "+movieName);
		System.out.println("Language: "+language);
		System.out.println("Budget: "+budget);
		System.out.println("Hit: "+isHit);
		System.out.println("Genre: "+genre);
		System.out.println("----------------------");

		actor.getActorDetails();
	}
}