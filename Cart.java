class Cart{

	String cartName;
	String user;
	int totalItems;
	boolean isActive;
	String paymentMode;

	Order order;

	public void getCartDetails(){
		System.out.println("Cart Name: " + cartName);
		System.out.println("User: " + user);
		System.out.println("Items: " + totalItems);
		System.out.println("Active: " + isActive);
		System.out.println("Payment Mode: " + paymentMode);
		System.out.println("----------------------");

		order.getOrderDetails();
	}
}