class BangaloreExecutor{
	public static void main(String[] args) {
		Bangalore b1 = new Bangalore();
		b1.area= "Hebbal";
		b1.state= "Karnataka";
		b1.population=100000;
		b1.isMetro= true;
		b1.famousFor= "IT";
		
		MallOfAsia m1=new MallOfAsia();
		m1.mallId= 1;
		m1.name= "MallOfAsia";
		m1.floors=5;
		m1.location= "Hebbal";
		m1.isOpen= true;
		
		b1.mall= m1;
		b1.getBangaloreDetails();


		Bangalore b2 = new Bangalore();
		b2.area= "Whitefield";
		b2.state="Karnataka";
		b2.population= 120000;
		b2.isMetro= true;
		b2.famousFor= "Tech Parks";
		
		MallOfAsia m2 =new MallOfAsia();
		m2.mallId= 2;
		m2.name= "Forum Mall";
		m2.floors= 6;
		m2.location= "Whitefield";
		m2.isOpen= true;
		
		b2.mall= m2;
		b2.getBangaloreDetails();


		Bangalore b3 = new Bangalore();
		b3.area= "Indiranagar";
		b3.state= "Karnataka";
		b3.population= 90000;
		b3.isMetro= true;
		b3.famousFor= "Pubs";
		
		MallOfAsia m3 = new MallOfAsia();
		m3.mallId= 3;
		m3.name= "Garuda Mall";
		m3.floors= 4;
		m3.location= "Indiranagar";
		m3.isOpen= true;
		
		b3.mall= m3;
		b3.getBangaloreDetails();


		Bangalore b4 = new Bangalore();
		b4.area= "BTM";
		b4.state= "Karnataka";
		b4.population= 80000;
		b4.isMetro= true;
		b4.famousFor= "Food";
		
		MallOfAsia m4 = new MallOfAsia();
		m4.mallId= 4;
		m4.name= "Orion Mall";
		m4.floors= 5;
		m4.location= "BTM";
		m4.isOpen= true;
		
		b4.mall= m4;
		b4.getBangaloreDetails();


		Bangalore b5 = new Bangalore();
		b5.area= "Yelahanka";
		b5.state= "Karnataka";
		b5.population= 70000;
		b5.isMetro= false;
		b5.famousFor= "Airport";
		
		MallOfAsia m5 = new MallOfAsia();
		m5.mallId= 5;
		m5.name= "Esteem Mall";
		m5.floors= 3;
		m5.location= "Yelahanka";
		m5.isOpen= true;
		
		b5.mall= m5;
		b5.getBangaloreDetails();


		Bangalore b6 = new Bangalore();
		b6.area= "Jayanagar";
		b6.state= "Karnataka";
		b6.population= 95000;
		b6.isMetro= true;
		b6.famousFor= "Shopping";
		
		MallOfAsia m6 = new MallOfAsia();
		m6.mallId= 6;
		m6.name= "Central Mall";
		m6.floors= 4;
		m6.location= "Jayanagar";
		m6.isOpen= true;
		
		b6.mall= m6;
		b6.getBangaloreDetails();


		Bangalore b7 = new Bangalore();
		b7.area= "Rajajinagar";
		b7.state= "Karnataka";
		b7.population= 88000;
		b7.isMetro= true;
		b7.famousFor= "Markets";
		
		MallOfAsia m7 = new MallOfAsia();
		m7.mallId= 7;
		m7.name= "GT Mall";
		m7.floors= 5;
		m7.location= "Rajajinagar";
		m7.isOpen= true;
		
		b7.mall= m7;
		b7.getBangaloreDetails();


		Bangalore b8 = new Bangalore();
		b8.area= "Electronic City";
		b8.state= "Karnataka";
		b8.population= 110000;
		b8.isMetro= true;
		b8.famousFor= "IT";
		
		MallOfAsia m8 = new MallOfAsia();
		m8.mallId= 8;
		m8.name= "Neo Mall";
		m8.floors= 6;
		m8.location= "Electronic City";
		m8.isOpen= true;
		
		b8.mall= m8;
		b8.getBangaloreDetails();


		Bangalore b9 = new Bangalore();
		b9.area= "Marathahalli";
		b9.state= "Karnataka";
		b9.population= 105000;
		b9.isMetro= true;
		b9.famousFor= "Tech";
		
		MallOfAsia m9 = new MallOfAsia();
		m9.mallId= 9;
		m9.name= "Soul Space";
		m9.floors= 4;
		m9.location= "Marathahalli";
		m9.isOpen= true;
		
		b9.mall= m9;
		b9.getBangaloreDetails();


		Bangalore b10 = new Bangalore();
		b10.area= "KR Puram";
		b10.state= "Karnataka";
		b10.population= 85000;
		b10.isMetro= true;
		b10.famousFor= "Bridge";
		
		MallOfAsia m10 = new MallOfAsia();
		m10.mallId= 10;
		m10.name= "Phoenix Marketcity";
		m10.floors= 7;
		m10.location= "KR Puram";
		m10.isOpen= true;
		
		b10.mall= m10;
		b10.getBangaloreDetails();


		Bangalore b11 = new Bangalore();
		b11.area= "Majestic";
		b11.state= "Karnataka";
		b11.population= 95000;
		b11.isMetro= true;
		b11.famousFor= "Transport";
		
		MallOfAsia m11 = new MallOfAsia();
		m11.mallId= 11;
		m11.name= "City Mall";
		m11.floors= 4;
		m11.location= "Majestic";
		m11.isOpen= true;
		
		b11.mall= m11;
		b11.getBangaloreDetails();


		Bangalore b12 = new Bangalore();
		b12.area= "Banashankari";
		b12.state= "Karnataka";
		b12.population= 87000;
		b12.isMetro= true;
		b12.famousFor= "Residential";
		
		MallOfAsia m12 = new MallOfAsia();
		m12.mallId= 12;
		m12.name= "Gopalan Mall";
		m12.floors= 5;
		m12.location= "Banashankari";
		m12.isOpen= true;
		
		b12.mall= m12;
		b12.getBangaloreDetails();


		Bangalore b13 = new Bangalore();
		b13.area= "Malleshwaram";
		b13.state= "Karnataka";
		b13.population= 78000;
		b13.isMetro= true;
		b13.famousFor= "Temples";
		
		MallOfAsia m13 = new MallOfAsia();
		m13.mallId= 13;
		m13.name= "Orion East";
		m13.floors= 4;
		m13.location= "Malleshwaram";
		m13.isOpen= true;
		
		b13.mall= m13;
		b13.getBangaloreDetails();


		Bangalore b14 = new Bangalore();
		b14.area= "Kengeri";
		b14.state= "Karnataka";
		b14.population= 60000;
		b14.isMetro= false;
		b14.famousFor= "Suburb";
		
		MallOfAsia m14 = new MallOfAsia();
		m14.mallId= 14;
		m14.name= "Kengeri Mall";
		m14.floors= 3;
		m14.location= "Kengeri";
		m14.isOpen= true;
		
		b14.mall= m14;
		b14.getBangaloreDetails();


		Bangalore b15 = new Bangalore();
		b15.area= "HSR Layout";
		b15.state= "Karnataka";
		b15.population= 92000;
		b15.isMetro= true;
		b15.famousFor= "Startups";
		
		MallOfAsia m15 = new MallOfAsia();
		m15.mallId= 15;
		m15.name= "HSR Mall";
		m15.floors= 4;
		m15.location= "HSR";
		m15.isOpen= true;
		
		b15.mall= m15;
		b15.getBangaloreDetails();


		Bangalore b16 = new Bangalore();
		b16.area= "Bellandur";
		b16.state= "Karnataka";
		b16.population= 110000;
		b16.isMetro= true;
		b16.famousFor= "Lake";
		
		MallOfAsia m16 = new MallOfAsia();
		m16.mallId= 16;
		m16.name= "Eco Mall";
		m16.floors= 5;
		m16.location= "Bellandur";
		m16.isOpen= true;
		
		b16.mall= m16;
		b16.getBangaloreDetails();


		Bangalore b17 = new Bangalore();
		b17.area= "Sarjapur";
		b17.state= "Karnataka";
		b17.population= 100000;
		b17.isMetro= true;
		b17.famousFor= "IT Corridor";
		
		MallOfAsia m17 = new MallOfAsia();
		m17.mallId= 17;
		m17.name= "Sarjapur Mall";
		m17.floors= 4;
		m17.location= "Sarjapur";
		m17.isOpen= true;
		
		b17.mall= m17;
		b17.getBangaloreDetails();


		Bangalore b18 = new Bangalore();
		b18.area= "Peenya";
		b18.state= "Karnataka";
		b18.population= 75000;
		b18.isMetro= true;
		b18.famousFor= "Industries";
		
		MallOfAsia m18 = new MallOfAsia();
		m18.mallId= 18;
		m18.name= "Peenya Mall";
		m18.floors= 3;
		m18.location= "Peenya";
		m18.isOpen= true;
		
		b18.mall= m18;
		b18.getBangaloreDetails();


		Bangalore b19 = new Bangalore();
		b19.area= "Yeshwanthpur";
		b19.state= "Karnataka";
		b19.population= 82000;
		b19.isMetro= true;
		b19.famousFor= "Railway";
		
		MallOfAsia m19 = new MallOfAsia();
		m19.mallId= 19;
		m19.name= "YPR Mall";
		m19.floors= 4;
		m19.location= "Yeshwanthpur";
		m19.isOpen= true;
		
		b19.mall= m19;
		b19.getBangaloreDetails();


		Bangalore b20 = new Bangalore();
		b20.area= "Indiranagar";
		b20.state= "Karnataka";
		b20.population= 95000;
		b20.isMetro= true;
		b20.famousFor= "Nightlife";
		
		MallOfAsia m20 = new MallOfAsia();
		m20.mallId= 20;
		m20.name= "Lifestyle Mall";
		m20.floors= 5;
		m20.location= "Indiranagar";
		m20.isOpen= true;
		
		b20.mall= m20;
		b20.getBangaloreDetails();
	}
}