class SeriesExecutor{
	public static void main(String[] args) {
		Series s1 = new Series();
		s1.seriesName= "Stranger Things";
		s1.platform= "Netflix";
		s1.seasons= 4;
		s1.isCompleted= false;
		s1.genre= "Sci-Fi";
		
		Episode e1 = new Episode();
		e1.episodeNumber= 1;
		e1.title= "Chapter One";
		e1.duration= 50;
		e1.releaseDate= "2016";
		e1.isHit= true;
		
		s1.episode= e1;
		s1.getSeriesDetails();

		Series s2 = new Series();
		s2.seriesName= "Money Heist";
		s2.platform= "Netflix";
		s2.seasons= 5;
		s2.isCompleted= true;
		s2.genre= "Crime";
		
		Episode e2 = new Episode();
		e2.episodeNumber= 2;
		e2.title= "The Plan";
		e2.duration= 45;
		e2.releaseDate= "2017";
		e2.isHit= true;
		
		s2.episode= e2;
		s2.getSeriesDetails();


		Series s3 = new Series();
		s3.seriesName= "Breaking Bad";
		s3.platform= "AMC";
		s3.seasons= 5;
		s3.isCompleted= true;
		s3.genre= "Drama";
		
		Episode e3 = new Episode();
		e3.episodeNumber= 3;
		e3.title= "Pilot";
		e3.duration= 58;
		e3.releaseDate= "2008";
		e3.isHit= true;
		
		s3.episode= e3;
		s3.getSeriesDetails();


		Series s4 = new Series();
		s4.seriesName= "Game of Thrones";
		s4.platform= "HBO";
		s4.seasons= 8;
		s4.isCompleted= true;
		s4.genre= "Fantasy";
		
		Episode e4 = new Episode();
		e4.episodeNumber= 4;
		e4.title= "Winter Is Coming";
		e4.duration= 60;
		e4.releaseDate= "2011";
		e4.isHit= true;
		
		s4.episode= e4;
		s4.getSeriesDetails();


		Series s5 = new Series();
		s5.seriesName= "Mirzapur";
		s5.platform= "Amazon";
		s5.seasons= 2;
		s5.isCompleted= false;
		s5.genre= "Crime";
		
		Episode e5 = new Episode();
		e5.episodeNumber= 5;
		e5.title= "Gun";
		e5.duration= 50;
		e5.releaseDate= "2018";
		e5.isHit= true;
		
		s5.episode= e5;
		s5.getSeriesDetails();


		Series s6 = new Series();
		s6.seriesName= "Sacred Games";
		s6.platform= "Netflix";
		s6.seasons= 2;
		s6.isCompleted= true;
		s6.genre= "Thriller";
		
		Episode e6 = new Episode();
		e6.episodeNumber= 6;
		e6.title= "Ashwatthama";
		e6.duration= 52;
		e6.releaseDate= "2018";
		e6.isHit= true;
		
		s6.episode= e6;
		s6.getSeriesDetails();


		Series s7 = new Series();
		s7.seriesName= "The Boys";
		s7.platform= "Amazon";
		s7.seasons= 3;
		s7.isCompleted= false;
		s7.genre= "Action";
		
		Episode e7 = new Episode();
		e7.episodeNumber= 7;
		e7.title= "The Name";
		e7.duration= 55;
		e7.releaseDate= "2019";
		e7.isHit= true;
		
		s7.episode= e7;
		s7.getSeriesDetails();


		Series s8 = new Series();
		s8.seriesName= "Friends";
		s8.platform= "NBC";
		s8.seasons= 10;
		s8.isCompleted= true;
		s8.genre= "Comedy";
		
		Episode e8 = new Episode();
		e8.episodeNumber= 8;
		e8.title= "Pilot";
		e8.duration= 25;
		e8.releaseDate= "1994";
		e8.isHit= true;
		
		s8.episode= e8;
		s8.getSeriesDetails();


		Series s9 = new Series();
		s9.seriesName= "Dark";
		s9.platform= "Netflix";
		s9.seasons= 3;
		s9.isCompleted= true;
		s9.genre= "Sci-Fi";
		
		Episode e9 = new Episode();
		e9.episodeNumber= 9;
		e9.title= "Secrets";
		e9.duration= 53;
		e9.releaseDate= "2017";
		e9.isHit= true;
		
		s9.episode= e9;
		s9.getSeriesDetails();


		Series s10 = new Series();
		s10.seriesName= "Loki";
		s10.platform= "Disney+";
		s10.seasons= 2;
		s10.isCompleted= false;
		s10.genre= "Fantasy";
		
		Episode e10 = new Episode();
		e10.episodeNumber= 10;
		e10.title= "Glorious Purpose";
		e10.duration= 48;
		e10.releaseDate= "2021";
		e10.isHit= true;
		
		s10.episode= e10;
		s10.getSeriesDetails();
		
				Series s11 = new Series();
		s11.seriesName= "Wednesday";
		s11.platform= "Netflix";
		s11.seasons= 1;
		s11.isCompleted= false;
		s11.genre= "Mystery";
		
		Episode e11 = new Episode();
		e11.episodeNumber= 11;
		e11.title= "Child is Full of Woe";
		e11.duration= 45;
		e11.releaseDate= "2022";
		e11.isHit= true;
		
		s11.episode= e11;
		s11.getSeriesDetails();


		Series s12 = new Series();
		s12.seriesName= "Narcos";
		s12.platform= "Netflix";
		s12.seasons= 3;
		s12.isCompleted= true;
		s12.genre= "Crime";
		
		Episode e12 = new Episode();
		e12.episodeNumber= 12;
		e12.title= "Descenso";
		e12.duration= 50;
		e12.releaseDate= "2015";
		e12.isHit= true;
		
		s12.episode= e12;
		s12.getSeriesDetails();


		Series s13 = new Series();
		s13.seriesName= "Peaky Blinders";
		s13.platform= "BBC";
		s13.seasons= 6;
		s13.isCompleted= true;
		s13.genre= "Drama";
		
		Episode e13 = new Episode();
		e13.episodeNumber= 13;
		e13.title= "Episode 1";
		e13.duration= 60;
		e13.releaseDate= "2013";
		e13.isHit= true;
		
		s13.episode= e13;
		s13.getSeriesDetails();


		Series s14 = new Series();
		s14.seriesName= "The Witcher";
		s14.platform= "Netflix";
		s14.seasons= 3;
		s14.isCompleted= false;
		s14.genre= "Fantasy";
		
		Episode e14 = new Episode();
		e14.episodeNumber= 14;
		e14.title= "The End";
		e14.duration= 50;
		e14.releaseDate= "2019";
		e14.isHit= true;
		
		s14.episode= e14;
		s14.getSeriesDetails();


		Series s15 = new Series();
		s15.seriesName= "House of Dragon";
		s15.platform= "HBO";
		s15.seasons= 1;
		s15.isCompleted= false;
		s15.genre= "Fantasy";
		
		Episode e15 = new Episode();
		e15.episodeNumber= 15;
		e15.title= "Heirs";
		e15.duration= 55;
		e15.releaseDate= "2022";
		e15.isHit= true;
		
		s15.episode= e15;
		s15.getSeriesDetails();


		Series s16 = new Series();
		s16.seriesName= "Sherlock";
		s16.platform= "BBC";
		s16.seasons= 4;
		s16.isCompleted= true;
		s16.genre= "Mystery";
		
		Episode e16 = new Episode();
		e16.episodeNumber= 16;
		e16.title= "Study in Pink";
		e16.duration= 90;
		e16.releaseDate= "2010";
		e16.isHit= true;
		
		s16.episode= e16;
		s16.getSeriesDetails();


		Series s17 = new Series();
		s17.seriesName= "The Office";
		s17.platform= "NBC";
		s17.seasons= 9;
		s17.isCompleted= true;
		s17.genre= "Comedy";
		
		Episode e17 = new Episode();
		e17.episodeNumber= 17;
		e17.title= "Pilot";
		e17.duration= 22;
		e17.releaseDate= "2005";
		e17.isHit= true;
		
		s17.episode= e17;
		s17.getSeriesDetails();


		Series s18 = new Series();
		s18.seriesName= "Blacklist";
		s18.platform= "NBC";
		s18.seasons= 10;
		s18.isCompleted= true;
		s18.genre= "Crime";
		
		Episode e18 = new Episode();
		e18.episodeNumber= 18;
		e18.title= "Rank";
		e18.duration= 45;
		e18.releaseDate= "2013";
		e18.isHit= true;
		
		s18.episode= e18;
		s18.getSeriesDetails();


		Series s19 = new Series();
		s19.seriesName= "Arrow";
		s19.platform= "CW";
		s19.seasons= 8;
		s19.isCompleted= true;
		s19.genre= "Action";
		
		Episode e19 = new Episode();
		e19.episodeNumber= 19;
		e19.title= "Pilot";
		e19.duration= 42;
		e19.releaseDate= "2012";
		e19.isHit= true;
		
		s19.episode= e19;
		s19.getSeriesDetails();


		Series s20 = new Series();
		s20.seriesName= "Flash";
		s20.platform= "CW";
		s20.seasons= 9;
		s20.isCompleted= true;
		s20.genre= "Superhero";
		
		Episode e20 = new Episode();
		e20.episodeNumber= 20;
		e20.title= "Fastest Man";
		e20.duration= 45;
		e20.releaseDate= "2014";
		e20.isHit= true;
		
		s20.episode= e20;
		s20.getSeriesDetails();
	}
}


		