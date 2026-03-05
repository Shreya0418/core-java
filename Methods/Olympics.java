class Olympics {
	
	static String sportsNames[] = {"Swimming", "Relay", "Wrestling"};
	
	public static void getSportNames() {
		System.out.println("getSportNames invoked");
		
		// sportsNames = {"Swimming"};         //can't initialize like this in array variable
		
		for(String sportsName : sportsNames) {
			System.out.println(sportsName);
		}
		
		System.out.println("end of getSportNames");
		
	}
}