class TvExecutor{
	public static void main(String[] args) {
		Tv t1=new Tv();
		t1.brand= "Samsung";
		t1.type= "LED";
		t1.price=30000;
		t1.isSmart= true;
		t1.size= "43 inch";
		
		Remote r1=new Remote();
		r1.remoteId=1;
		r1.brand= "Samsung";
		r1.buttons= 40;
		r1.batteryType="AAA";
		r1.isWorking= true;
		
		t1.remote= r1;
		t1.getTvDetails();


		Tv t2= new Tv();
		t2.brand="LG";
		t2.type= "OLED";
		t2.price= 60000;
		t2.isSmart= true;
		t2.size= "55 inch";
		
		Remote r2 = new Remote();
		r2.remoteId= 2;
		r2.brand= "LG";
		r2.buttons= 45;
		r2.batteryType= "AA";
		r2.isWorking= true;
		
		t2.remote= r2;
		t2.getTvDetails();


		Tv t3 = new Tv();
		t3.brand= "Sony";
		t3.type= "LED";
		t3.price=50000;
		t3.isSmart= true;
		t3.size= "50 inch";
		
		Remote r3 = new Remote();
		r3.remoteId= 3;
		r3.brand= "Sony";
		r3.buttons= 42;
		r3.batteryType= "AAA";
		r3.isWorking= true;
		
		t3.remote= r3;
		t3.getTvDetails();


		Tv t4=new Tv();
		t4.brand= "Mi";
		t4.type= "Smart";
		t4.price= 25000;
		t4.isSmart= true;
		t4.size= "43 inch";
		
		Remote r4 = new Remote();
		r4.remoteId= 4;
		r4.brand= "Mi";
		r4.buttons= 35;
		r4.batteryType= "AAA";
		r4.isWorking= true;
		
		t4.remote= r4;
		t4.getTvDetails();


		Tv t5= new Tv();
		t5.brand= "OnePlus";
		t5.type= "QLED";
		t5.price= 45000;
		t5.isSmart= true;
		t5.size= "55 inch";
		
		Remote r5 = new Remote();
		r5.remoteId= 5;
		r5.brand= "OnePlus";
		r5.buttons= 38;
		r5.batteryType= "AA";
		r5.isWorking= true;
		
		t5.remote= r5;
		t5.getTvDetails();


		Tv t6 =new Tv();
		t6.brand= "Panasonic";
		t6.type= "LED";
		t6.price= 28000;
		t6.isSmart= false;
		t6.size= "40 inch";
		
		Remote r6= new Remote();
		r6.remoteId= 6;
		r6.brand= "Panasonic";
		r6.buttons= 30;
		r6.batteryType= "AAA";
		r6.isWorking= true;
		
		t6.remote= r6;
		t6.getTvDetails();


		Tv t7 =new Tv();
		t7.brand= "TCL";
		t7.type= "LED";
		t7.price= 22000;
		t7.isSmart= true;
		t7.size= "43 inch";
		
		Remote r7= new Remote();
		r7.remoteId= 7;
		r7.brand= "TCL";
		r7.buttons= 36;
		r7.batteryType= "AAA";
		r7.isWorking= true;
		
		t7.remote= r7;
		t7.getTvDetails();


		Tv t8 =new Tv();
		t8.brand= "Vu";
		t8.type= "Smart";
		t8.price= 27000;
		t8.isSmart= true;
		t8.size= "50 inch";
		
		Remote r8 = new Remote();
		r8.remoteId= 8;
		r8.brand= "Vu";
		r8.buttons= 34;
		r8.batteryType= "AAA";
		r8.isWorking= true;
		
		t8.remote= r8;
		t8.getTvDetails();


		Tv t9 =new Tv();
		t9.brand= "Philips";
		t9.type= "LED";
		t9.price= 26000;
		t9.isSmart= false;
		t9.size= "42 inch";
		
		Remote r9 = new Remote();
		r9.remoteId= 9;
		r9.brand= "Philips";
		r9.buttons= 32;
		r9.batteryType= "AA";
		r9.isWorking= true;
		
		t9.remote= r9;
		t9.getTvDetails();


		Tv t10 =new Tv();
		t10.brand= "Haier";
		t10.type= "LED";
		t10.price= 24000;
		t10.isSmart= false;
		t10.size= "43 inch";
		
		Remote r10= new Remote();
		r10.remoteId= 10;
		r10.brand= "Haier";
		r10.buttons= 31;
		r10.batteryType= "AAA";
		r10.isWorking= true;
		
		t10.remote= r10;
		t10.getTvDetails();


		Tv t11 = new Tv();
		t11.brand= "Samsung";
		t11.type= "QLED";
		t11.price= 70000;
		t11.isSmart= true;
		t11.size= "65 inch";
		
		Remote r11 =new Remote();
		r11.remoteId= 11;
		r11.brand= "Samsung";
		r11.buttons= 45;
		r11.batteryType= "AA";
		r11.isWorking= true;
		
		t11.remote= r11;
		t11.getTvDetails();


		Tv t12 = new Tv();
		t12.brand= "LG";
		t12.type= "LED";
		t12.price= 35000;
		t12.isSmart= true;
		t12.size= "50 inch";
		
		Remote r12=new Remote();
		r12.remoteId= 12;
		r12.brand= "LG";
		r12.buttons= 40;
		r12.batteryType= "AAA";
		r12.isWorking= true;
		
		t12.remote= r12;
		t12.getTvDetails();


		Tv t13 =new Tv();
		t13.brand= "Sony";
		t13.type= "OLED";
		t13.price= 90000;
		t13.isSmart= true;
		t13.size= "65 inch";
		
		Remote r13= new Remote();
		r13.remoteId= 13;
		r13.brand= "Sony";
		r13.buttons= 48;
		r13.batteryType= "AA";
		r13.isWorking= true;
		
		t13.remote= r13;
		t13.getTvDetails();


		Tv t14 =new Tv();
		t14.brand= "Mi";
		t14.type= "LED";
		t14.price= 20000;
		t14.isSmart= true;
		t14.size= "40 inch";
		
		Remote r14= new Remote();
		r14.remoteId= 14;
		r14.brand= "Mi";
		r14.buttons= 33;
		r14.batteryType= "AAA";
		r14.isWorking= true;
		
		t14.remote= r14;
		t14.getTvDetails();


		Tv t15 = new Tv();
		t15.brand= "OnePlus";
		t15.type= "LED";
		t15.price= 42000;
		t15.isSmart= true;
		t15.size= "55 inch";
		
		Remote r15= new Remote();
		r15.remoteId= 15;
		r15.brand= "OnePlus";
		r15.buttons= 37;
		r15.batteryType= "AA";
		r15.isWorking= true;
		
		t15.remote= r15;
		t15.getTvDetails();


		Tv t16 =new Tv();
		t16.brand= "Panasonic";
		t16.type= "LED";
		t16.price= 28000;
		t16.isSmart= false;
		t16.size= "42 inch";
		
		Remote r16= new Remote();
		r16.remoteId= 16;
		r16.brand= "Panasonic";
		r16.buttons= 30;
		r16.batteryType= "AAA";
		r16.isWorking= true;
		
		t16.remote= r16;
		t16.getTvDetails();


		Tv t17 = new Tv();
		t17.brand= "TCL";
		t17.type= "Smart";
		t17.price= 26000;
		t17.isSmart= true;
		t17.size= "43 inch";
		
		Remote r17 = new Remote();
		r17.remoteId= 17;
		r17.brand= "TCL";
		r17.buttons= 36;
		r17.batteryType= "AAA";
		r17.isWorking= true;
		
		t17.remote= r17;
		t17.getTvDetails();


		Tv t18 = new Tv();
		t18.brand= "Vu";
		t18.type= "LED";
		t18.price= 27000;
		t18.isSmart= true;
		t18.size= "50 inch";
		
		Remote r18 = new Remote();
		r18.remoteId= 18;
		r18.brand= "Vu";
		r18.buttons= 34;
		r18.batteryType= "AAA";
		r18.isWorking= true;
		
		t18.remote= r18;
		t18.getTvDetails();


		Tv t19 = new Tv();
		t19.brand= "Philips";
		t19.type= "Smart";
		t19.price= 30000;
		t19.isSmart= true;
		t19.size= "50 inch";
		
		Remote r19 = new Remote();
		r19.remoteId= 19;
		r19.brand= "Philips";
		r19.buttons= 35;
		r19.batteryType= "AA";
		r19.isWorking= true;
		
		t19.remote= r19;
		t19.getTvDetails();


		Tv t20 = new Tv();
		t20.brand= "Haier";
		t20.type= "LED";
		t20.price= 23000;
		t20.isSmart= false;
		t20.size= "43 inch";
		
		Remote r20 = new Remote();
		r20.remoteId= 20;
		r20.brand= "Haier";
		r20.buttons= 31;
		r20.batteryType= "AAA";
		r20.isWorking= true;
		
		t20.remote= r20;
		t20.getTvDetails();
	}
}