class SmartPhone {
	
	static long contacts[] = {8217216186L, 9481728156L, 9964571405L, 8088642008L, 9353715454L, 9110818086L, 8296897154L, 8618487480L, 7892908922L, 6361659375L, 9060959377L, 9740071077L, 8884811316L, 9844997053L, 8310075557L, 8660532392L, 8095540529L, 7411212104L, 7019794776L, 8431745515L};
		
	
	public static void main(String[] args) {
		System.out.println("Main String");
		
		// long contacts[] = {8217216186L, 9481728156L, 9964571405L, 8088642008L, 9353715454L, 9110818086L, 8296897154L, 8618487480L, 7892908922L, 6361659375L, 9060959377L, 9740071077L, 8884811316L, 9844997053L, 8310075557L, 8660532392L, 8095540529L, 7411212104L, 7019794776L, 8431745515L};
		
		// System.out.println("The Contacts List are: ");
		// System.out.println(contacts[0] + "\n" + contacts[1] + "\n" + contacts[2] + "\n" + contacts[3] + "\n" + contacts[4] + "\n" + contacts[5] + "\n" + contacts[6] + "\n" + contacts[7] + "\n" + contacts[8] + "\n" + contacts[9] + "\n" + contacts[10] + "\n" + contacts[11] + "\n" + contacts[12] + "\n" + contacts[13] + "\n" + contacts[14] + "\n" + contacts[15] + "\n" + contacts[16] + "\n" + contacts[17] + "\n" + contacts[18] + "\n" + contacts[19]);
		getContactNumbers();
		
	}
	
	static void getContactNumbers() {
		System.out.println("The Contacts List are: ");
		for ( long contactNumbers : contacts) {
			System.out.println(contactNumbers);
		}
	}

}