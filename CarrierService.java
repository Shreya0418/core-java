class CarrierService{
	
	public static void pickUpPackage(){
		System.out.println("Order is at your doorstep!");
		
		HubRouter.sortToZipCode();
		
	}
}