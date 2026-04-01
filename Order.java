class Order{

	int orderId;
	String productName;
	int quantity;
	int price;
	boolean isDelivered;

	public void getOrderDetails(){
		System.out.println("Order Id: " + orderId);
		System.out.println("Product: " + productName);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		System.out.println("Delivered: " + isDelivered);
		System.out.println("---------------------------");
	}
}