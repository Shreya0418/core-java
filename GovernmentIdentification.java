class GovernmentIdentification{

	int idNumber;
	String idType;
	String issuedBy;
	String validity;
	boolean isActive;

	public void getCardDetails(){
		System.out.println("ID Number: " + idNumber);
		System.out.println("Type: " + idType);
		System.out.println("Issued By: " + issuedBy);
		System.out.println("Validity: " + validity);
		System.out.println("Active: " + isActive);
		System.out.println("---------------------------");
	}
}