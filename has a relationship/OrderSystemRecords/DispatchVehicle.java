class DispatchVehicle{
	
	public static void outOfDelivery(){
		System.out.println("Order out for delivery");
		
		DeliveryAgent.reachDoorStep();
	}
}