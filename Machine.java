class Machine{

	int machineId;
	String name;
	String function;
	int capacity;
	boolean isOperational;

	public void getMachineDetails(){
		System.out.println("Machine Id: " + machineId);
		System.out.println("Name: " + name);
		System.out.println("Function: " + function);
		System.out.println("Capacity: " + capacity);
		System.out.println("Operational: " + isOperational);
		System.out.println("---------------------------");
	}
}