class Client{

	int clientId;
	String name;
	String project;
	int budget;
	boolean isVerified;

	public void getClientDetails(){
		System.out.println("Client Id: " + clientId);
		System.out.println("Name: " + name);
		System.out.println("Project: " + project);
		System.out.println("Budget: " + budget);
		System.out.println("Verified: " + isVerified);
		System.out.println("---------------------------");
	}
}