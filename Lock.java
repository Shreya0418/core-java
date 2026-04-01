class Lock{

	int lockId;
	String brand;
	String type;
	int securityLevel;
	boolean isLocked;

	public void getLockDetails(){
		System.out.println("Lock Id: " + lockId);
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + type);
		System.out.println("Security Level: " + securityLevel);
		System.out.println("Locked: " + isLocked);
		System.out.println("---------------------------");
	}
}