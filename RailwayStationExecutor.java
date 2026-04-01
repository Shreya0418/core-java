class RailwayStationExecutor{
	public static void main(String[] args) {
		RailwayStation r1 = new RailwayStation();
		r1.stationName="KSR Bengaluru";
		r1.location= "Bangalore";
		r1.numberOfPlatforms=10;
		r1.isJunction= true;
		r1.zone ="South Western";
		
		Platform p1= new Platform();
		p1.platformNumber=1;
		p1.trainName ="Shatabdi";
		p1.arrivalTime ="06:00";
		p1.departureTime = "06:15";
		p1.isAvailable= true;
		
		r1.platform= p1;
		r1.getStationDetails();

		RailwayStation r2 = new RailwayStation();
		r2.stationName= "Mysore";
		r2.location= "Mysore";
		r2.numberOfPlatforms= 6;
		r2.isJunction= false;
		r2.zone= "South Western";
		
		Platform p2 = new Platform();
		p2.platformNumber= 2;
		p2.trainName= "Express";
		p2.arrivalTime= "07:30";
		p2.departureTime= "07:45";
		p2.isAvailable= false;
		
		r2.platform= p2;
		r2.getStationDetails();


		RailwayStation r3 = new RailwayStation();
		r3.stationName= "Chennai Central";
		r3.location= "Chennai";
		r3.numberOfPlatforms= 12;
		r3.isJunction= true;
		r3.zone= "Southern";
		
		Platform p3 = new Platform();
		p3.platformNumber= 3;
		p3.trainName= "Duronto";
		p3.arrivalTime= "08:00";
		p3.departureTime= "08:20";
		p3.isAvailable= true;
		
		r3.platform= p3;
		r3.getStationDetails();


		RailwayStation r4 = new RailwayStation();
		r4.stationName= "Hyderabad";
		r4.location= "Hyderabad";
		r4.numberOfPlatforms= 9;
		r4.isJunction= true;
		r4.zone= "South Central";
		
		Platform p4 = new Platform();
		p4.platformNumber= 4;
		p4.trainName= "Intercity";
		p4.arrivalTime= "09:15";
		p4.departureTime= "09:30";
		p4.isAvailable= true;
		
		r4.platform= p4;
		r4.getStationDetails();


		RailwayStation r5 = new RailwayStation();
		r5.stationName= "Mumbai Central";
		r5.location= "Mumbai";
		r5.numberOfPlatforms= 15;
		r5.isJunction= true;
		r5.zone= "Western";
		
		Platform p5 = new Platform();
		p5.platformNumber= 5;
		p5.trainName= "Rajdhani";
		p5.arrivalTime= "10:00";
		p5.departureTime= "10:20";
		p5.isAvailable= false;
		
		r5.platform= p5;
		r5.getStationDetails();


		RailwayStation r6 = new RailwayStation();
		r6.stationName= "Delhi";
		r6.location= "Delhi";
		r6.numberOfPlatforms= 16;
		r6.isJunction= true;
		r6.zone= "Northern";
		
		Platform p6 = new Platform();
		p6.platformNumber= 6;
		p6.trainName= "Garib Rath";
		p6.arrivalTime= "11:00";
		p6.departureTime= "11:25";
		p6.isAvailable= true;
		
		r6.platform= p6;
		r6.getStationDetails();


		RailwayStation r7 = new RailwayStation();
		r7.stationName= "Pune";
		r7.location= "Pune";
		r7.numberOfPlatforms= 7;
		r7.isJunction= false;
		r7.zone= "Central";
		
		Platform p7 = new Platform();
		p7.platformNumber= 7;
		p7.trainName= "Passenger";
		p7.arrivalTime= "12:00";
		p7.departureTime= "12:10";
		p7.isAvailable= true;
		
		r7.platform= p7;
		r7.getStationDetails();


		RailwayStation r8 = new RailwayStation();
		r8.stationName= "Kolkata";
		r8.location= "Kolkata";
		r8.numberOfPlatforms= 14;
		r8.isJunction= true;
		r8.zone= "Eastern";
		
		Platform p8 = new Platform();
		p8.platformNumber= 8;
		p8.trainName= "Mail";
		p8.arrivalTime= "13:00";
		p8.departureTime= "13:30";
		p8.isAvailable= false;
		
		r8.platform= p8;
		r8.getStationDetails();


		RailwayStation r9 = new RailwayStation();
		r9.stationName= "Ahmedabad";
		r9.location= "Ahmedabad";
		r9.numberOfPlatforms= 10;
		r9.isJunction= true;
		r9.zone= "Western";
		
		Platform p9 = new Platform();
		p9.platformNumber= 9;
		p9.trainName= "Superfast";
		p9.arrivalTime= "14:00";
		p9.departureTime= "14:20";
		p9.isAvailable= true;
		
		r9.platform= p9;
		r9.getStationDetails();


		RailwayStation r10 = new RailwayStation();
		r10.stationName= "Jaipur";
		r10.location= "Jaipur";
		r10.numberOfPlatforms= 8;
		r10.isJunction= false;
		r10.zone= "North Western";
		
		Platform p10 = new Platform();
		p10.platformNumber= 10;
		p10.trainName= "Express";
		p10.arrivalTime= "15:00";
		p10.departureTime= "15:15";
		p10.isAvailable= true;
		
		r10.platform= p10;
		r10.getStationDetails();


		RailwayStation r11 = new RailwayStation();
		r11.stationName= "Nagpur";
		r11.location= "Nagpur";
		r11.numberOfPlatforms= 9;
		r11.isJunction= true;
		r11.zone= "Central";
		
		Platform p11 = new Platform();
		p11.platformNumber= 11;
		p11.trainName= "Duronto";
		p11.arrivalTime= "16:00";
		p11.departureTime= "16:20";
		p11.isAvailable= true;
		
		r11.platform= p11;
		r11.getStationDetails();


		RailwayStation r12 = new RailwayStation();
		r12.stationName= "Bhopal";
		r12.location= "Bhopal";
		r12.numberOfPlatforms= 6;
		r12.isJunction= false;
		r12.zone= "West Central";
		
		Platform p12 = new Platform();
		p12.platformNumber= 12;
		p12.trainName= "Intercity";
		p12.arrivalTime= "17:00";
		p12.departureTime= "17:10";
		p12.isAvailable= false;
		
		r12.platform= p12;
		r12.getStationDetails();


		RailwayStation r13 = new RailwayStation();
		r13.stationName= "Patna";
		r13.location= "Patna";
		r13.numberOfPlatforms= 11;
		r13.isJunction= true;
		r13.zone= "East Central";
		
		Platform p13 = new Platform();
		p13.platformNumber= 13;
		p13.trainName= "Rajdhani";
		p13.arrivalTime= "18:00";
		p13.departureTime= "18:25";
		p13.isAvailable= true;
		
		r13.platform= p13;
		r13.getStationDetails();


		RailwayStation r14 = new RailwayStation();
		r14.stationName= "Lucknow";
		r14.location= "Lucknow";
		r14.numberOfPlatforms= 8;
		r14.isJunction= true;
		r14.zone= "Northern";
		
		Platform p14 = new Platform();
		p14.platformNumber= 14;
		p14.trainName= "Passenger";
		p14.arrivalTime= "19:00";
		p14.departureTime= "19:15";
		p14.isAvailable= true;
		
		r14.platform= p14;
		r14.getStationDetails();


		RailwayStation r15 = new RailwayStation();
		r15.stationName= "Goa";
		r15.location= "Goa";
		r15.numberOfPlatforms= 5;
		r15.isJunction= false;
		r15.zone= "Konkan";
		
		Platform p15 = new Platform();
		p15.platformNumber= 15;
		p15.trainName= "Express";
		p15.arrivalTime= "20:00";
		p15.departureTime= "20:20";
		p15.isAvailable= true;
		
		r15.platform= p15;
		r15.getStationDetails();


		RailwayStation r16 = new RailwayStation();
		r16.stationName= "Coimbatore";
		r16.location= "Coimbatore";
		r16.numberOfPlatforms= 7;
		r16.isJunction= false;
		r16.zone= "Southern";
		
		Platform p16 = new Platform();
		p16.platformNumber= 16;
		p16.trainName= "Mail";
		p16.arrivalTime= "21:00";
		p16.departureTime= "21:30";
		p16.isAvailable= false;
		
		r16.platform= p16;
		r16.getStationDetails();


		RailwayStation r17 = new RailwayStation();
		r17.stationName= "Trivandrum";
		r17.location= "Kerala";
		r17.numberOfPlatforms= 6;
		r17.isJunction= true;
		r17.zone= "Southern";
		
		Platform p17 = new Platform();
		p17.platformNumber= 17;
		p17.trainName= "Superfast";
		p17.arrivalTime= "22:00";
		p17.departureTime= "22:20";
		p17.isAvailable= true;
		
		r17.platform= p17;
		r17.getStationDetails();


		RailwayStation r18 = new RailwayStation();
		r18.stationName= "Surat";
		r18.location= "Surat";
		r18.numberOfPlatforms= 9;
		r18.isJunction= true;
		r18.zone= "Western";
		
		Platform p18 = new Platform();
		p18.platformNumber= 18;
		p18.trainName= "Intercity";
		p18.arrivalTime= "23:00";
		p18.departureTime= "23:15";
		p18.isAvailable= true;
		
		r18.platform= p18;
		r18.getStationDetails();


		RailwayStation r19 = new RailwayStation();
		r19.stationName= "Varanasi";
		r19.location= "Varanasi";
		r19.numberOfPlatforms= 8;
		r19.isJunction= true;
		r19.zone= "North Eastern";
		
		Platform p19 = new Platform();
		p19.platformNumber= 19;
		p19.trainName= "Passenger";
		p19.arrivalTime= "05:00";
		p19.departureTime= "05:15";
		p19.isAvailable= true;
		
		r19.platform= p19;
		r19.getStationDetails();


		RailwayStation r20 = new RailwayStation();
		r20.stationName= "Indore";
		r20.location= "Indore";
		r20.numberOfPlatforms= 6;
		r20.isJunction= false;
		r20.zone= "Western";
		
		Platform p20 = new Platform();
		p20.platformNumber= 20;
		p20.trainName= "Express";
		p20.arrivalTime= "06:00";
		p20.departureTime= "06:20";
		p20.isAvailable= true;
		
		r20.platform= p20;
		r20.getStationDetails();
	}
}