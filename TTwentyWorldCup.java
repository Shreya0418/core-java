class TTwentyWorldCup {
	
	static String groupA[] = {"India", "Namibia", "Netherlands", "Pakistan", "UnitedStates"};
	static	String groupB[] = {"Australia", "Ireland", "Oman", "Sri Lanks", "Zimbabwe"};
    static String groupC[] = {"Afganistan", "Canada", "England", "New Zeland", "West Indies"};
	static String groupD[] = {"Bangladesh", "Italy", "Nepal", "Scotland", "South Africa"};
	
	
	public static void main(String[] args) {
		
		// String groupA[] = {"India", "Namibia", "Netherlands", "Pakistan", "UnitedStates"};
		// String groupB[] = {"Australia", "Ireland", "Oman", "Sri Lanks", "Zimbabwe"};
		// String groupC[] = {"Afganistan", "Canada", "England", "New Zeland", "West Indies"};
		// String groupD[] = {"Bangladesh", "Italy", "Nepal", "Scotland", "South Africa"};
		
		// System.out.println("The IPL Team are: ");
		// System.out.println("Group A: ");
		// System.out.println(groupA[0] + "\n" + groupA[1] + "\n" + groupA[2] + "\n" + groupA[3] + "\n" + groupA[4]);
		// System.out.println("\n");
		// System.out.println("Group B: ");
		// System.out.println(groupB[0] + "\n" + groupB[1] + "\n" + groupB[2] + "\n" + groupB[3] + "\n" + groupB[4]);
		// System.out.println("\n");
		// System.out.println("Group C: ");
		// System.out.println(groupC[0] + "\n" + groupC[1] + "\n" + groupC[2] + "\n" + groupC[3] + "\n" + groupC[4]);
		// System.out.println("\n");
		// System.out.println("Group D: ");
		// System.out.println(groupD[0] + "\n" + groupD[1] + "\n" + groupD[2] + "\n" + groupD[3] + "\n" + groupD[4] );
		
		getWorldCupTeamNamesA();
		getWorldCupTeamNamesB();
		getWorldCupTeamNamesC();
		getWorldCupTeamNamesD();
		
		
	}
	static void getWorldCupTeamNamesA() {
		System.out.println("The World Cup Team Names are: ");
		for(String teamNameA : groupA) {
			System.out.println(teamNameA);
		}
	}
	
	static void getWorldCupTeamNamesB() {
       System.out.println("\nThe World Cup Team Names of Group B are: ");
       for(String teamNameB : groupB) {
        System.out.println(teamNameB);
        } 
    }
	
	static void getWorldCupTeamNamesC() {
    System.out.println("\nThe World Cup Team Names of Group C are: ");
    for(String teamNameC : groupC) {
        System.out.println(teamNameC);
    }
}

    static void getWorldCupTeamNamesD() {
    System.out.println("\nThe World Cup Team Names of Group D are: ");
    for(String teamNameD : groupD) {
        System.out.println(teamNameD);
    }
}
	
	
}