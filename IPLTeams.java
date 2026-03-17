class IPLTeams {
	
	static String teamNames[] = {"Royal Challengers Bengaluru (RCB)", "Mumbai Indians (MI)", "Chennai Super Kings (CSK)", "Kolkata Knight Riders (KKR)", "Rajasthan Royals (RR)", "Delhi Capitals (DC)", "Sunrisers Hyderabad (SRH)", "Punjab Kings (PBKS)", "Gujarat Titans (GT)", "Lucknow Super Giants (LSG)" };
		
	
	public static void main(String[] args) {
		
		// String teamNames[] = {"Royal Challengers Bengaluru (RCB)", "Mumbai Indians (MI)", "Chennai Super Kings (CSK)", "Kolkata Knight Riders (KKR)", "Rajasthan Royals (RR)", "Delhi Capitals (DC)", "Sunrisers Hyderabad (SRH)", "Punjab Kings (PBKS)", "Gujarat Titans (GT)", "Lucknow Super Giants (LSG)" };
		
		// System.out.println("The IPL Teams are: \n");
		// System.out.println(teamNames[0] + "\n" + teamNames[1] + "\n" + teamNames[2] + "\n" + teamNames[3] + "\n" + teamNames[4] + "\n" + teamNames[5] + "\n" + teamNames[6] + "\n" + teamNames[7] + "\n" + teamNames[8] + "\n" + teamNames[9]);
          		
		getTeamNames();
		
		
	}
	
	static void getTeamNames() {
		System.out.println("The Team Nmaes are: ");
		for(String teamName : teamNames) {            
			System.out.println(teamName);
		}
	}
}	