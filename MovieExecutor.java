class MovieExecutor{
	public static void main(String[] args) {		
		Movie m1 =new Movie();
		m1.movieName ="KGF";
		m1.language="Kannada";
		m1.budget=80000000;
		m1.isHit=true;
		m1.genre="Action";
		
		Actor a1 =new Actor();
		a1.actorId= 1;
		a1.name ="Yash";
		a1.age =35;
		a1.role= "Hero";
		a1.isLead =true;
		
		m1.actor=a1;
		m1.getMovieDetails();


		Movie m2= new Movie();
		m2.movieName ="RRR";
		m2.language ="Telugu";
		m2.budget =550000000;
		m2.isHit =true;
		m2.genre= "Action";
		
		Actor a2=new Actor();
		a2.actorId=2;
		a2.name= "Ram Charan";
		a2.age=38;
		a2.role="Hero";
		a2.isLead=true;
		
		m2.actor= a2;
		m2.getMovieDetails();


		Movie m3=new Movie();
		m3.movieName="Jawan";
		m3.language="Hindi";
		m3.budget=300000000;
		m3.isHit=true;
		m3.genre="Action";
		
		Actor a3=new Actor();
		a3.actorId= 3;
		a3.name= "Shah Rukh Khan";
		a3.age =58;
		a3.role ="Hero";
		a3.isLead= true;
		
		m3.actor =a3;
		m3.getMovieDetails();


		Movie m4 =new Movie();
		m4.movieName= "Leo";
		m4.language ="Tamil";
		m4.budget=250000000;
		m4.isHit=true;
		m4.genre="Thriller";
		
		Actor a4=new Actor();
		a4.actorId=4;
		a4.name="Vijay";
		a4.age=49;
		a4.role="Hero";
		a4.isLead=true;
		
		m4.actor=a4;
		m4.getMovieDetails();


		Movie m5=new Movie();
		m5.movieName="Pushpa";
		m5.language="Telugu";
		m5.budget=200000000;
		m5.isHit=true;
		m5.genre="Action";
		
		Actor a5=new Actor();
		a5.actorId=5;
		a5.name="Allu Arjun";
		a5.age=41;
		a5.role="Hero";
		a5.isLead=true;
		
		m5.actor=a5;
		m5.getMovieDetails();


		Movie m6=new Movie();
		m6.movieName="Dangal";
		m6.language="Hindi";
		m6.budget=70000000;
		m6.isHit=true;
		m6.genre="Sports";
		
		Actor a6=new Actor();
		a6.actorId=6;
		a6.name="Aamir Khan";
		a6.age=59;
		a6.role="Coach";
		a6.isLead=true;
		
		m6.actor=a6;
		m6.getMovieDetails();


		Movie m7=new Movie();
		m7.movieName="Bahubali";
		m7.language="Telugu";
		m7.budget=180000000;
		m7.isHit=true;
		m7.genre="Historical";
		
		Actor a7=new Actor();
		a7.actorId=7;
		a7.name="Prabhas";
		a7.age=44;
		a7.role="Hero";
		a7.isLead=true;
		
		m7.actor=a7;
		m7.getMovieDetails();


		Movie m8=new Movie();
		m8.movieName="3 Idiots";
		m8.language="Hindi";
		m8.budget=55000000;
		m8.isHit=true;
		m8.genre="Comedy";
		
		Actor a8=new Actor();
		a8.actorId=8;
		a8.name="Aamir Khan";
		a8.age=59;
		a8.role="Student";
		a8.isLead=true;
		
		m8.actor=a8;
		m8.getMovieDetails();


		Movie m9=new Movie();
		m9.movieName="Master";
		m9.language="Tamil";
		m9.budget=150000000;
		m9.isHit=true;
		m9.genre="Action";
		
		Actor a9=new Actor();
		a9.actorId=9;
		a9.name="Vijay";
		a9.age=49;
		a9.role="Professor";
		a9.isLead=true;
		
		m9.actor=a9;
		m9.getMovieDetails();


		Movie m10=new Movie();
		m10.movieName="War";
		m10.language="Hindi";
		m10.budget=170000000;
		m10.isHit=true;
		m10.genre="Action";
		
		Actor a10=new Actor();
		a10.actorId=10;
		a10.name="Hrithik Roshan";
		a10.age=50;
		a10.role="Agent";
		a10.isLead=true;
		
		m10.actor=a10;
		m10.getMovieDetails();
		
				Movie m11=new Movie();
		m11.movieName="Drishyam";
		m11.language="Hindi";
		m11.budget=50000000;
		m11.isHit=true;
		m11.genre="Thriller";
		
		Actor a11=new Actor();
		a11.actorId=11;
		a11.name="Ajay Devgn";
		a11.age=55;
		a11.role="Father";
		a11.isLead=true;
		
		m11.actor=a11;
		m11.getMovieDetails();


		Movie m12=new Movie();
		m12.movieName="Vikram";
		m12.language="Tamil";
		m12.budget=120000000;
		m12.isHit=true;
		m12.genre="Action";
		
		Actor a12=new Actor();
		a12.actorId=12;
		a12.name="Kamal Haasan";
		a12.age=69;
		a12.role="Agent";
		a12.isLead=true;
		
		m12.actor=a12;
		m12.getMovieDetails();


		Movie m13=new Movie();
		m13.movieName="Singham";
		m13.language="Hindi";
		m13.budget=60000000;
		m13.isHit=true;
		m13.genre="Action";
		
		Actor a13=new Actor();
		a13.actorId=13;
		a13.name="Ajay Devgn";
		a13.age=55;
		a13.role="Police";
		a13.isLead=true;
		
		m13.actor=a13;
		m13.getMovieDetails();


		Movie m14=new Movie();
		m14.movieName="Kabir Singh";
		m14.language="Hindi";
		m14.budget=65000000;
		m14.isHit=true;
		m14.genre="Romance";
		
		Actor a14=new Actor();
		a14.actorId=14;
		a14.name="Shahid Kapoor";
		a14.age=43;
		a14.role="Doctor";
		a14.isLead=true;
		
		m14.actor=a14;
		m14.getMovieDetails();


		Movie m15=new Movie();
		m15.movieName="KGF 2";
		m15.language="Kannada";
		m15.budget=100000000;
		m15.isHit=true;
		m15.genre="Action";
		
		Actor a15=new Actor();
		a15.actorId=15;
		a15.name="Yash";
		a15.age=35;
		a15.role="Hero";
		a15.isLead=true;
		
		m15.actor=a15;
		m15.getMovieDetails();


		Movie m16=new Movie();
		m16.movieName="Animal";
		m16.language="Hindi";
		m16.budget=120000000;
		m16.isHit=true;
		m16.genre="Crime";
		
		Actor a16=new Actor();
		a16.actorId=16;
		a16.name="Ranbir Kapoor";
		a16.age=41;
		a16.role="Hero";
		a16.isLead=true;
		
		m16.actor=a16;
		m16.getMovieDetails();


		Movie m17=new Movie();
		m17.movieName="Jailer";
		m17.language="Tamil";
		m17.budget=150000000;
		m17.isHit=true;
		m17.genre="Action";
		
		Actor a17=new Actor();
		a17.actorId=17;
		a17.name="Rajinikanth";
		a17.age=73;
		a17.role="Jailer";
		a17.isLead=true;
		
		m17.actor=a17;
		m17.getMovieDetails();


		Movie m18=new Movie();
		m18.movieName="Don";
		m18.language="Hindi";
		m18.budget=70000000;
		m18.isHit=true;
		m18.genre="Action";
		
		Actor a18=new Actor();
		a18.actorId=18;
		a18.name="Shah Rukh Khan";
		a18.age=58;
		a18.role="Don";
		a18.isLead=true;
		
		m18.actor=a18;
		m18.getMovieDetails();


		Movie m19=new Movie();
		m19.movieName="Sarkar";
		m19.language="Tamil";
		m19.budget=130000000;
		m19.isHit=true;
		m19.genre="Political";
		
		Actor a19=new Actor();
		a19.actorId=19;
		a19.name="Vijay";
		a19.age=49;
		a19.role="Leader";
		a19.isLead=true;
		
		m19.actor=a19;
		m19.getMovieDetails();


		Movie m20=new Movie();
		m20.movieName="Pathaan";
		m20.language="Hindi";
		m20.budget=250000000;
		m20.isHit=true;
		m20.genre="Action";
		
		Actor a20=new Actor();
		a20.actorId=20;
		a20.name="Shah Rukh Khan";
		a20.age=58;
		a20.role="Agent";
		a20.isLead=true;
		
		m20.actor=a20;
		m20.getMovieDetails();

	}
}