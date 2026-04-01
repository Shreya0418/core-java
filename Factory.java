class Factory{

	String factoryName;
	String location;
	int workers;
	boolean isRunning;
	String type;

	Machine machine;

	public void getFactoryDetails(){
		System.out.println("Factory Name: " + factoryName);
		System.out.println("Location: " + location);
		System.out.println("Workers: " + workers);
		System.out.println("Running: " + isRunning);
		System.out.println("Type: " + type);
		System.out.println("----------------------");

		machine.getMachineDetails();
	}
}