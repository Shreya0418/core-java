class PodcastExecutor{
	public static void main(String[] args) {
		
		Podcast p1 = new Podcast();
		p1.podcastName= "TechTalk";
		p1.host= "Ravi";
		p1.episodes= 120;
		p1.isPopular= true;
		p1.category= "Technology";
		
		Guest g1 = new Guest();
		g1.guestId= 1;
		g1.name= "Elon";
		g1.profession= "Entrepreneur";
		g1.age= 52;
		g1.isFamous= true;
		
		p1.guest= g1;
		p1.getPodcastDetails();


		Podcast p2 = new Podcast();
		p2.podcastName= "HealthCast";
		p2.host= "Sneha";
		p2.episodes= 80;
		p2.isPopular= true;
		p2.category= "Health";
		
		Guest g2 = new Guest();
		g2.guestId= 2;
		g2.name= "Dr Kumar";
		g2.profession= "Doctor";
		g2.age= 45;
		g2.isFamous= true;
		
		p2.guest= g2;
		p2.getPodcastDetails();


		Podcast p3 = new Podcast();
		p3.podcastName= "Startup Stories";
		p3.host= "Arjun";
		p3.episodes= 60;
		p3.isPopular= true;
		p3.category= "Business";
		
		Guest g3 = new Guest();
		g3.guestId= 3;
		g3.name= "Ritesh";
		g3.profession= "CEO";
		g3.age= 40;
		g3.isFamous= true;
		
		p3.guest= g3;
		p3.getPodcastDetails();


		Podcast p4 = new Podcast();
		p4.podcastName= "Movie Buzz";
		p4.host= "Priya";
		p4.episodes= 90;
		p4.isPopular= true;
		p4.category= "Entertainment";
		
		Guest g4 = new Guest();
		g4.guestId= 4;
		g4.name= "Ranbir";
		g4.profession= "Actor";
		g4.age= 41;
		g4.isFamous= true;
		
		p4.guest= g4;
		p4.getPodcastDetails();


		Podcast p5 = new Podcast();
		p5.podcastName= "Fitness Talk";
		p5.host= "Kiran";
		p5.episodes= 70;
		p5.isPopular= true;
		p5.category= "Fitness";
		
		Guest g5 = new Guest();
		g5.guestId= 5;
		g5.name= "Virat";
		g5.profession= "Athlete";
		g5.age= 35;
		g5.isFamous= true;
		
		p5.guest= g5;
		p5.getPodcastDetails();


		Podcast p6 = new Podcast();
		p6.podcastName= "EduCast";
		p6.host= "Anita";
		p6.episodes= 50;
		p6.isPopular= false;
		p6.category= "Education";
		
		Guest g6 = new Guest();
		g6.guestId= 6;
		g6.name= "Sharma";
		g6.profession= "Teacher";
		g6.age= 50;
		g6.isFamous= false;
		
		p6.guest= g6;
		p6.getPodcastDetails();


		Podcast p7 = new Podcast();
		p7.podcastName= "Travel Diaries";
		p7.host= "Rahul";
		p7.episodes= 65;
		p7.isPopular= true;
		p7.category= "Travel";
		
		Guest g7 = new Guest();
		g7.guestId= 7;
		g7.name= "Neeraj";
		g7.profession= "Vlogger";
		g7.age= 30;
		g7.isFamous= true;
		
		p7.guest= g7;
		p7.getPodcastDetails();


		Podcast p8 = new Podcast();
		p8.podcastName= "Finance Talk";
		p8.host= "Divya";
		p8.episodes= 75;
		p8.isPopular= true;
		p8.category= "Finance";
		
		Guest g8 = new Guest();
		g8.guestId= 8;
		g8.name= "Rakesh";
		g8.profession= "Investor";
		g8.age= 55;
		g8.isFamous= true;
		
		p8.guest= g8;
		p8.getPodcastDetails();


		Podcast p9 = new Podcast();
		p9.podcastName= "Coding Hub";
		p9.host= "Manoj";
		p9.episodes= 85;
		p9.isPopular= true;
		p9.category= "Programming";
		
		Guest g9 = new Guest();
		g9.guestId= 9;
		g9.name= "Nandan";
		g9.profession= "Engineer";
		g9.age= 45;
		g9.isFamous= true;
		
		p9.guest= g9;
		p9.getPodcastDetails();


		Podcast p10 = new Podcast();
		p10.podcastName= "Food Stories";
		p10.host= "Neha";
		p10.episodes= 40;
		p10.isPopular= false;
		p10.category= "Food";
		
		Guest g10 = new Guest();
		g10.guestId= 10;
		g10.name= "Chef Sanjeev";
		g10.profession= "Chef";
		g10.age= 58;
		g10.isFamous= true;
		
		p10.guest= g10;
		p10.getPodcastDetails();


		Podcast p11 = new Podcast();
		p11.podcastName= "History Talks";
		p11.host= "Amit";
		p11.episodes= 55;
		p11.isPopular= false;
		p11.category= "History";
		
		Guest g11 = new Guest();
		g11.guestId= 11;
		g11.name= "Historian Raj";
		g11.profession= "Historian";
		g11.age= 60;
		g11.isFamous= false;
		
		p11.guest= g11;
		p11.getPodcastDetails();


		Podcast p12 = new Podcast();
		p12.podcastName= "Music Mania";
		p12.host= "Pooja";
		p12.episodes= 100;
		p12.isPopular= true;
		p12.category= "Music";
		
		Guest g12 = new Guest();
		g12.guestId= 12;
		g12.name= "Arijit";
		g12.profession= "Singer";
		g12.age= 37;
		g12.isFamous= true;
		
		p12.guest= g12;
		p12.getPodcastDetails();


		Podcast p13 = new Podcast();
		p13.podcastName= "Science Lab";
		p13.host= "Vikas";
		p13.episodes= 45;
		p13.isPopular= false;
		p13.category= "Science";
		
		Guest g13 = new Guest();
		g13.guestId= 13;
		g13.name= "Dr APJ";
		g13.profession= "Scientist";
		g13.age= 70;
		g13.isFamous= true;
		
		p13.guest= g13;
		p13.getPodcastDetails();


		Podcast p14 = new Podcast();
		p14.podcastName= "Gaming Zone";
		p14.host= "Meena";
		p14.episodes= 35;
		p14.isPopular= true;
		p14.category= "Gaming";
		
		Guest g14 = new Guest();
		g14.guestId= 14;
		g14.name= "Scout";
		g14.profession= "Gamer";
		g14.age= 28;
		g14.isFamous= true;
		
		p14.guest= g14;
		p14.getPodcastDetails();


		Podcast p15 = new Podcast();
		p15.podcastName= "Motivation Hub";
		p15.host= "Karthik";
		p15.episodes= 90;
		p15.isPopular= true;
		p15.category= "Motivation";
		
		Guest g15 = new Guest();
		g15.guestId= 15;
		g15.name= "Sandeep";
		g15.profession= "Speaker";
		g15.age= 42;
		g15.isFamous= true;
		
		p15.guest= g15;
		p15.getPodcastDetails();


		Podcast p16 = new Podcast();
		p16.podcastName= "Art Talk";
		p16.host= "Swathi";
		p16.episodes= 25;
		p16.isPopular= false;
		p16.category= "Art";
		
		Guest g16 = new Guest();
		g16.guestId= 16;
		g16.name= "Painter Ravi";
		g16.profession= "Artist";
		g16.age= 38;
		g16.isFamous= false;
		
		p16.guest= g16;
		p16.getPodcastDetails();


		Podcast p17 = new Podcast();
		p17.podcastName= "Auto World";
		p17.host= "Deepak";
		p17.episodes= 60;
		p17.isPopular= true;
		p17.category= "Automobile";
		
		Guest g17 = new Guest();
		g17.guestId= 17;
		g17.name= "Ratan";
		g17.profession= "Industrialist";
		g17.age= 65;
		g17.isFamous= true;
		
		p17.guest= g17;
		p17.getPodcastDetails();


		Podcast p18 = new Podcast();
		p18.podcastName= "Fashion Talk";
		p18.host= "Nisha";
		p18.episodes= 40;
		p18.isPopular= true;
		p18.category= "Fashion";
		
		Guest g18 = new Guest();
		g18.guestId= 18;
		g18.name= "Designer Raj";
		g18.profession= "Designer";
		g18.age= 36;
		g18.isFamous= true;
		
		p18.guest= g18;
		p18.getPodcastDetails();


		Podcast p19 = new Podcast();
		p19.podcastName= "Legal Talks";
		p19.host= "Suresh";
		p19.episodes= 30;
		p19.isPopular= false;
		p19.category= "Law";
		
		Guest g19 = new Guest();
		g19.guestId= 19;
		g19.name= "Advocate Kumar";
		g19.profession= "Lawyer";
		g19.age= 50;
		g19.isFamous= false;
		
		p19.guest= g19;
		p19.getPodcastDetails();


		Podcast p20 = new Podcast();
		p20.podcastName= "Startup India";
		p20.host= "Lakshmi";
		p20.episodes= 70;
		p20.isPopular= true;
		p20.category= "Business";
		
		Guest g20 = new Guest();
		g20.guestId= 20;
		g20.name= "Byju";
		g20.profession= "Entrepreneur";
		g20.age= 44;
		g20.isFamous= true;
		
		p20.guest= g20;
		p20.getPodcastDetails();
	}
}