class Subscription{

	int subscriptionId;
	String plan;
	int price;
	int validityDays;
	boolean isActive;

	public void getSubscriptionDetails(){
		System.out.println("Subscription Id: " + subscriptionId);
		System.out.println("Plan: " + plan);
		System.out.println("Price: " + price);
		System.out.println("Validity: " + validityDays);
		System.out.println("Active: " + isActive);
		System.out.println("---------------------------");
	}
}