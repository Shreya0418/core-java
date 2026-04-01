class OTTExecutor{
	public static void main(String[] args) {
		OTTPlatform o1 = new OTTPlatform();
		o1.platformName= "Netflix";
		o1.owner= "Netflix Inc";
		o1.totalShows= 5000;
		o1.isPopular= true;
		o1.region= "Global";
		
		Subscription s1 = new Subscription();
		s1.subscriptionId= 1;
		s1.plan= "Basic";
		s1.price= 199;
		s1.validityDays= 30;
		s1.isActive= true;
		o1.subscription= s1;
		o1.getPlatformDetails();

		OTTPlatform o2 = new OTTPlatform();
		o2.platformName= "Amazon Prime";
		o2.owner= "Amazon";
		o2.totalShows= 4000;
		o2.isPopular= true;
		o2.region= "Global";
		Subscription s2 = new Subscription();
		s2.subscriptionId= 2;
		s2.plan= "Prime";
		s2.price= 1499;
		s2.validityDays= 365;
		s2.isActive= true;
		
		o2.subscription= s2;
		o2.getPlatformDetails();


		OTTPlatform o3 = new OTTPlatform();
		o3.platformName= "Disney+";
		o3.owner= "Disney";
		o3.totalShows= 3000;
		o3.isPopular= true;
		o3.region= "Global";
		
		Subscription s3 = new Subscription();
		s3.subscriptionId= 3;
		s3.plan= "Premium";
		s3.price= 299;
		s3.validityDays= 30;
		s3.isActive= true;
		
		o3.subscription= s3;
		o3.getPlatformDetails();
		
				OTTPlatform o4 = new OTTPlatform();
		o4.platformName= "Hotstar";
		o4.owner= "Disney";
		o4.totalShows= 3500;
		o4.isPopular= true;
		o4.region= "India";
		
		Subscription s4 = new Subscription();
		s4.subscriptionId= 4;
		s4.plan= "VIP";
		s4.price= 899;
		s4.validityDays= 365;
		s4.isActive= true;
		
		o4.subscription= s4;
		o4.getPlatformDetails();


		OTTPlatform o5 = new OTTPlatform();
		o5.platformName= "Zee5";
		o5.owner= "Zee";
		o5.totalShows= 2000;
		o5.isPopular= true;
		o5.region= "India";
		
		Subscription s5 = new Subscription();
		s5.subscriptionId= 5;
		s5.plan= "Premium";
		s5.price= 699;
		s5.validityDays= 365;
		s5.isActive= true;
		
		o5.subscription= s5;
		o5.getPlatformDetails();


		OTTPlatform o6 = new OTTPlatform();
		o6.platformName= "SonyLIV";
		o6.owner= "Sony";
		o6.totalShows= 1800;
		o6.isPopular= true;
		o6.region= "India";
		
		Subscription s6 = new Subscription();
		s6.subscriptionId= 6;
		s6.plan= "Monthly";
		s6.price= 299;
		s6.validityDays= 30;
		s6.isActive= true;
		
		o6.subscription= s6;
		o6.getPlatformDetails();


		OTTPlatform o7 = new OTTPlatform();
		o7.platformName= "Voot";
		o7.owner= "Viacom";
		o7.totalShows= 1500;
		o7.isPopular= false;
		o7.region= "India";
		
		Subscription s7 = new Subscription();
		s7.subscriptionId= 7;
		s7.plan= "Basic";
		s7.price= 199;
		s7.validityDays= 30;
		s7.isActive= true;
		
		o7.subscription= s7;
		o7.getPlatformDetails();


		OTTPlatform o8 = new OTTPlatform();
		o8.platformName= "MX Player";
		o8.owner= "Times";
		o8.totalShows= 1200;
		o8.isPopular= true;
		o8.region= "India";
		
		Subscription s8 = new Subscription();
		s8.subscriptionId= 8;
		s8.plan= "Free";
		s8.price= 0;
		s8.validityDays= 0;
		s8.isActive= true;
		
		o8.subscription= s8;
		o8.getPlatformDetails();


		OTTPlatform o9 = new OTTPlatform();
		o9.platformName= "JioCinema";
		o9.owner= "Reliance";
		o9.totalShows= 2200;
		o9.isPopular= true;
		o9.region= "India";
		
		Subscription s9 = new Subscription();
		s9.subscriptionId= 9;
		s9.plan= "Free";
		s9.price= 0;
		s9.validityDays= 0;
		s9.isActive= true;
		
		o9.subscription= s9;
		o9.getPlatformDetails();


		OTTPlatform o10 = new OTTPlatform();
		o10.platformName= "Apple TV";
		o10.owner= "Apple";
		o10.totalShows= 1000;
		o10.isPopular= true;
		o10.region= "Global";
		Subscription s10 = new Subscription();
		s10.subscriptionId= 10;
		s10.plan= "Standard";
		s10.price= 199;
		s10.validityDays= 30;
		s10.isActive= true;
		
		o10.subscription= s10;
		o10.getPlatformDetails();


		OTTPlatform o11 = new OTTPlatform();
		o11.platformName= "HBO Max";
		o11.owner= "Warner";
		o11.totalShows= 2500;
		o11.isPopular= true;
		o11.region= "Global";
		
		Subscription s11 = new Subscription();
		s11.subscriptionId= 11;
		s11.plan= "Premium";
		s11.price= 499;
		s11.validityDays= 30;
		s11.isActive= true;
		
		o11.subscription= s11;
		o11.getPlatformDetails();


		OTTPlatform o12 = new OTTPlatform();
		o12.platformName= "Peacock";
		o12.owner= "NBC";
		o12.totalShows= 900;
		o12.isPopular= false;
		o12.region= "US";
		
		Subscription s12 = new Subscription();
		s12.subscriptionId= 12;
		s12.plan= "Basic";
		s12.price= 150;
		s12.validityDays= 30;
		s12.isActive= true;
		
		o12.subscription= s12;
		o12.getPlatformDetails();


		OTTPlatform o13 = new OTTPlatform();
		o13.platformName= "Paramount+";
		o13.owner= "Paramount";
		o13.totalShows= 1100;
		o13.isPopular= false;
		o13.region= "US";
		
		Subscription s13 = new Subscription();
		s13.subscriptionId= 13;
		s13.plan= "Standard";
		s13.price= 199;
		s13.validityDays= 30;
		s13.isActive= true;
		
		o13.subscription= s13;
		o13.getPlatformDetails();


		OTTPlatform o14 = new OTTPlatform();
		o14.platformName= "Crunchyroll";
		o14.owner= "Sony";
		o14.totalShows= 800;
		o14.isPopular= true;
		o14.region= "Global";
		
		Subscription s14 = new Subscription();
		s14.subscriptionId= 14;
		s14.plan= "Anime";
		s14.price= 299;
		s14.validityDays= 30;
		s14.isActive= true;
		
		o14.subscription= s14;
		o14.getPlatformDetails();


		OTTPlatform o15 = new OTTPlatform();
		o15.platformName= "Discovery+";
		o15.owner= "Discovery";
		o15.totalShows= 700;
		o15.isPopular= false;
		o15.region= "Global";
		
		Subscription s15 = new Subscription();
		s15.subscriptionId= 15;
		s15.plan= "Basic";
		s15.price= 199;
		s15.validityDays= 30;
		s15.isActive= true;
		
		o15.subscription= s15;
		o15.getPlatformDetails();


		OTTPlatform o16 = new OTTPlatform();
		o16.platformName= "ALTBalaji";
		o16.owner= "Balaji";
		o16.totalShows= 600;
		o16.isPopular= false;
		o16.region= "India";
		
		Subscription s16 = new Subscription();
		s16.subscriptionId= 16;
		s16.plan= "Premium";
		s16.price= 300;
		s16.validityDays= 90;
		s16.isActive= true;
		
		o16.subscription= s16;
		o16.getPlatformDetails();


		OTTPlatform o17 = new OTTPlatform();
		o17.platformName= "SunNXT";
		o17.owner= "Sun";
		o17.totalShows= 900;
		o17.isPopular= true;
		o17.region= "India";
		
		Subscription s17 = new Subscription();
		s17.subscriptionId= 17;
		s17.plan= "South";
		s17.price= 250;
		s17.validityDays= 90;
		s17.isActive= true;
		
		o17.subscription= s17;
		o17.getPlatformDetails();


		OTTPlatform o18 = new OTTPlatform();
		o18.platformName= "Eros Now";
		o18.owner= "Eros";
		o18.totalShows= 500;
		o18.isPopular= false;
		o18.region= "India";
		
		Subscription s18 = new Subscription();
		s18.subscriptionId= 18;
		s18.plan= "Basic";
		s18.price= 199;
		s18.validityDays= 30;
		s18.isActive= true;
		
		o18.subscription= s18;
		o18.getPlatformDetails();


		OTTPlatform o19 = new OTTPlatform();
		o19.platformName= "Aha";
		o19.owner= "Aha Media";
		o19.totalShows= 400;
		o19.isPopular= true;
		o19.region= "India";
		Subscription s19 = new Subscription();
		s19.subscriptionId= 19;
		s19.plan= "Telugu";
		s19.price= 299;
		s19.validityDays= 90;
		s19.isActive= true;
		
		o19.subscription= s19;
		o19.getPlatformDetails();


		OTTPlatform o20 = new OTTPlatform();
		o20.platformName= "Hoichoi";
		o20.owner= "SVF";
		o20.totalShows= 300;
		o20.isPopular= false;
		o20.region= "India";	
		Subscription s20 = new Subscription();
		s20.subscriptionId= 20;
		s20.plan= "Bengali";
		s20.price= 399;
		s20.validityDays= 365;
		s20.isActive= true;
		
		o20.subscription= s20;
		o20.getPlatformDetails();
	}
}


