class Ticket {

    int seatNo;
    String customerName;
    double price;
    String type; 
	
	public void getTicketDetails(){
		System.out.println("The Ticket details invoked");
		System.out.println("The seat no: " + seatNo);
		System.out.println("The customer name is: " + customerName);
		System.out.println("The price is: "+ price);
		System.out.println("the type is:" + type);
		System.out.println("invoke ended");
}
	
	
	
}