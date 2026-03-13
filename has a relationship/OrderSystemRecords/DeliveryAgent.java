class DeliveryAgent{
	
	public static void reachDoorStep(){
		System.out.println("Order is arrived!");
		
		SignaturePortal.collectESign();
	}
}