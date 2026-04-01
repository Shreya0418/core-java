class CartExecutor{
	public static void main(String[] args) {
		
		Cart c1 = new Cart();
		c1.cartName= "AmazonCart";
		c1.user= "Ravi";
		c1.totalItems= 2;
		c1.isActive= true;
		c1.paymentMode= "UPI";
		
		Order o1 = new Order();
		o1.orderId= 1;
		o1.productName= "Mobile";
		o1.quantity= 1;
		o1.price= 20000;
		o1.isDelivered= true;
		
		c1.order= o1;
		c1.getCartDetails();


		Cart c2 = new Cart();
		c2.cartName= "FlipkartCart";
		c2.user= "Sneha";
		c2.totalItems= 3;
		c2.isActive= true;
		c2.paymentMode= "Card";
		
		Order o2 = new Order();
		o2.orderId= 2;
		o2.productName= "Shoes";
		o2.quantity= 2;
		o2.price= 3000;
		o2.isDelivered= false;
		
		c2.order= o2;
		c2.getCartDetails();


		Cart c3 = new Cart();
		c3.cartName= "MyntraCart";
		c3.user= "Arjun";
		c3.totalItems= 1;
		c3.isActive= true;
		c3.paymentMode= "COD";
		
		Order o3 = new Order();
		o3.orderId= 3;
		o3.productName= "Tshirt";
		o3.quantity= 1;
		o3.price= 800;
		o3.isDelivered= true;
		
		c3.order= o3;
		c3.getCartDetails();


		Cart c4 = new Cart();
		c4.cartName= "AjioCart";
		c4.user= "Priya";
		c4.totalItems= 4;
		c4.isActive= true;
		c4.paymentMode= "UPI";
		
		Order o4 = new Order();
		o4.orderId= 4;
		o4.productName= "Dress";
		o4.quantity= 2;
		o4.price= 2500;
		o4.isDelivered= false;
		
		c4.order= o4;
		c4.getCartDetails();


		Cart c5 = new Cart();
		c5.cartName= "SnapdealCart";
		c5.user= "Kiran";
		c5.totalItems= 2;
		c5.isActive= true;
		c5.paymentMode= "Card";
		
		Order o5 = new Order();
		o5.orderId= 5;
		o5.productName= "Watch";
		o5.quantity= 1;
		o5.price= 1500;
		o5.isDelivered= true;
		
		c5.order= o5;
		c5.getCartDetails();


		Cart c6 = new Cart();
		c6.cartName= "NykaaCart";
		c6.user= "Anita";
		c6.totalItems= 3;
		c6.isActive= true;
		c6.paymentMode= "UPI";
		
		Order o6 = new Order();
		o6.orderId= 6;
		o6.productName= "Makeup Kit";
		o6.quantity= 1;
		o6.price= 3500;
		o6.isDelivered= false;
		
		c6.order= o6;
		c6.getCartDetails();


		Cart c7 = new Cart();
		c7.cartName= "MeeshoCart";
		c7.user= "Rahul";
		c7.totalItems= 5;
		c7.isActive= true;
		c7.paymentMode= "COD";
		
		Order o7 = new Order();
		o7.orderId= 7;
		o7.productName= "Kurta";
		o7.quantity= 2;
		o7.price= 1200;
		o7.isDelivered= true;
		
		c7.order= o7;
		c7.getCartDetails();


		Cart c8 = new Cart();
		c8.cartName= "JioMartCart";
		c8.user= "Divya";
		c8.totalItems= 6;
		c8.isActive= true;
		c8.paymentMode= "UPI";
		
		Order o8 = new Order();
		o8.orderId= 8;
		o8.productName= "Groceries";
		o8.quantity= 5;
		o8.price= 2000;
		o8.isDelivered= true;
		
		c8.order= o8;
		c8.getCartDetails();


		Cart c9 = new Cart();
		c9.cartName= "BigBasketCart";
		c9.user= "Manoj";
		c9.totalItems= 4;
		c9.isActive= true;
		c9.paymentMode= "Card";
		
		Order o9 = new Order();
		o9.orderId= 9;
		o9.productName= "Vegetables";
		o9.quantity= 3;
		o9.price= 900;
		o9.isDelivered= true;
		
		c9.order= o9;
		c9.getCartDetails();


		Cart c10 = new Cart();
		c10.cartName= "RelianceCart";
		c10.user= "Neha";
		c10.totalItems= 2;
		c10.isActive= true;
		c10.paymentMode= "UPI";
		
		Order o10 = new Order();
		o10.orderId= 10;
		o10.productName= "Laptop";
		o10.quantity= 1;
		o10.price= 60000;
		o10.isDelivered= false;
		
		c10.order= o10;
		c10.getCartDetails();
		
				Cart c11 = new Cart();
		c11.cartName= "AmazonCart2";
		c11.user= "Amit";
		c11.totalItems= 3;
		c11.isActive= true;
		c11.paymentMode= "Card";
		
		Order o11 = new Order();
		o11.orderId= 11;
		o11.productName= "Tablet";
		o11.quantity= 1;
		o11.price= 15000;
		o11.isDelivered= true;
		
		c11.order= o11;
		c11.getCartDetails();


		Cart c12 = new Cart();
		c12.cartName= "FlipkartCart2";
		c12.user= "Pooja";
		c12.totalItems= 2;
		c12.isActive= true;
		c12.paymentMode= "UPI";
		
		Order o12 = new Order();
		o12.orderId= 12;
		o12.productName= "Bag";
		o12.quantity= 1;
		o12.price= 1200;
		o12.isDelivered= true;
		
		c12.order= o12;
		c12.getCartDetails();


		Cart c13 = new Cart();
		c13.cartName= "MyntraCart2";
		c13.user= "Vikas";
		c13.totalItems= 4;
		c13.isActive= true;
		c13.paymentMode= "COD";
		
		Order o13 = new Order();
		o13.orderId= 13;
		o13.productName= "Jeans";
		o13.quantity= 2;
		o13.price= 3000;
		o13.isDelivered= false;
		
		c13.order= o13;
		c13.getCartDetails();


		Cart c14 = new Cart();
		c14.cartName= "AjioCart2";
		c14.user= "Meena";
		c14.totalItems= 3;
		c14.isActive= true;
		c14.paymentMode= "UPI";
		
		Order o14 = new Order();
		o14.orderId= 14;
		o14.productName= "Top";
		o14.quantity= 1;
		o14.price= 900;
		o14.isDelivered= true;
		
		c14.order= o14;
		c14.getCartDetails();


		Cart c15 = new Cart();
		c15.cartName= "SnapdealCart2";
		c15.user= "Karthik";
		c15.totalItems= 2;
		c15.isActive= true;
		c15.paymentMode= "Card";
		
		Order o15 = new Order();
		o15.orderId= 15;
		o15.productName= "Headphones";
		o15.quantity= 1;
		o15.price= 2500;
		o15.isDelivered= true;
		
		c15.order= o15;
		c15.getCartDetails();


		Cart c16 = new Cart();
		c16.cartName= "NykaaCart2";
		c16.user= "Swathi";
		c16.totalItems= 3;
		c16.isActive= true;
		c16.paymentMode= "UPI";
		
		Order o16 = new Order();
		o16.orderId= 16;
		o16.productName= "Perfume";
		o16.quantity= 1;
		o16.price= 2000;
		o16.isDelivered= false;
		
		c16.order= o16;
		c16.getCartDetails();


		Cart c17 = new Cart();
		c17.cartName= "MeeshoCart2";
		c17.user= "Deepak";
		c17.totalItems= 5;
		c17.isActive= true;
		c17.paymentMode= "COD";
		
		Order o17 = new Order();
		o17.orderId= 17;
		o17.productName= "Shirt";
		o17.quantity= 2;
		o17.price= 1500;
		o17.isDelivered= true;
		
		c17.order= o17;
		c17.getCartDetails();


		Cart c18 = new Cart();
		c18.cartName= "JioMartCart2";
		c18.user= "Nisha";
		c18.totalItems= 6;
		c18.isActive= true;
		c18.paymentMode= "UPI";
		
		Order o18 = new Order();
		o18.orderId= 18;
		o18.productName= "Snacks";
		o18.quantity= 4;
		o18.price= 800;
		o18.isDelivered= true;
		
		c18.order= o18;
		c18.getCartDetails();


		Cart c19 = new Cart();
		c19.cartName= "BigBasketCart2";
		c19.user= "Suresh";
		c19.totalItems= 4;
		c19.isActive= true;
		c19.paymentMode= "Card";
		
		Order o19 = new Order();
		o19.orderId= 19;
		o19.productName= "Fruits";
		o19.quantity= 3;
		o19.price= 700;
		o19.isDelivered= true;
		
		c19.order= o19;
		c19.getCartDetails();


		Cart c20 = new Cart();
		c20.cartName= "RelianceCart2";
		c20.user= "Lakshmi";
		c20.totalItems= 2;
		c20.isActive= true;
		c20.paymentMode= "UPI";
		
		Order o20 = new Order();
		o20.orderId= 20;
		o20.productName= "TV";
		o20.quantity= 1;
		o20.price= 40000;
		o20.isDelivered= false;
		
		c20.order= o20;
		c20.getCartDetails();
	}
}


