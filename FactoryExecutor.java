class FactoryExecutor{
	public static void main(String[] args) {
		Factory f1 = new Factory();
		f1.factoryName= "Tata Steel";
		f1.location= "Jamshedpur";
		f1.workers= 5000;
		f1.isRunning= true;
		f1.type= "Steel";
		
		Machine m1 = new Machine();
		m1.machineId= 1;
		m1.name= "Cutter";
		m1.function= "Cutting";
		m1.capacity= 100;
		m1.isOperational= true;
		
		f1.machine= m1;
		f1.getFactoryDetails();

		Factory f2 = new Factory();
		f2.factoryName= "Reliance Plant";
		f2.location= "Mumbai";
		f2.workers= 4000;
		f2.isRunning= true;
		f2.type= "Petrochemical";
		
		Machine m2 = new Machine();
		m2.machineId= 2;
		m2.name= "Mixer";
		m2.function= "Mixing";
		m2.capacity= 120;
		m2.isOperational= true;
		
		f2.machine= m2;
		f2.getFactoryDetails();


		Factory f3 = new Factory();
		f3.factoryName= "Maruti Factory";
		f3.location= "Gurgaon";
		f3.workers= 3500;
		f3.isRunning= true;
		f3.type= "Automobile";
		
		Machine m3 = new Machine();
		m3.machineId= 3;
		m3.name= "Assembler";
		m3.function= "Assembly";
		m3.capacity= 150;
		m3.isOperational= true;
		
		f3.machine= m3;
		f3.getFactoryDetails();


		Factory f4 = new Factory();
		f4.factoryName= "Amul Plant";
		f4.location= "Anand";
		f4.workers= 2000;
		f4.isRunning= true;
		f4.type= "Dairy";
		
		Machine m4 = new Machine();
		m4.machineId= 4;
		m4.name= "Chiller";
		m4.function= "Cooling";
		m4.capacity= 80;
		m4.isOperational= true;
		
		f4.machine= m4;
		f4.getFactoryDetails();


		Factory f5 = new Factory();
		f5.factoryName= "ITC Foods";
		f5.location= "Hyderabad";
		f5.workers= 2500;
		f5.isRunning= true;
		f5.type= "Food";
		
		Machine m5 = new Machine();
		m5.machineId= 5;
		m5.name= "Packer";
		m5.function= "Packaging";
		m5.capacity= 90;
		m5.isOperational= true;
		
		f5.machine= m5;
		f5.getFactoryDetails();

		Factory f7 = new Factory();
		f7.factoryName= "HUL Plant";
		f7.location= "Pune";
		f7.workers= 2200;
		f7.isRunning= true;
		f7.type= "Consumer Goods";
		
		Machine m7 = new Machine();
		m7.machineId= 7;
		m7.name= "Mixer";
		m7.function= "Blending";
		m7.capacity= 110;
		m7.isOperational= true;
		
		f7.machine= m7;
		f7.getFactoryDetails();


		Factory f8 = new Factory();
		f8.factoryName= "Hero Motors";
		f8.location= "Delhi";
		f8.workers= 3000;
		f8.isRunning= true;
		f8.type= "Automobile";
		
		Machine m8 = new Machine();
		m8.machineId= 8;
		m8.name= "Welder";
		m8.function= "Welding";
		m8.capacity= 130;
		m8.isOperational= true;
		
		f8.machine= m8;
		f8.getFactoryDetails();


		Factory f9 = new Factory();
		f9.factoryName= "JSW Steel";
		f9.location= "Bellary";
		f9.workers= 4200;
		f9.isRunning= true;
		f9.type= "Steel";
		
		Machine m9 = new Machine();
		m9.machineId= 9;
		m9.name= "Crusher";
		m9.function= "Crushing";
		m9.capacity= 140;
		m9.isOperational= true;
		
		f9.machine= m9;
		f9.getFactoryDetails();


		Factory f10 = new Factory();
		f10.factoryName= "BHEL";
		f10.location= "Bhopal";
		f10.workers= 2800;
		f10.isRunning= true;
		f10.type= "Electrical";
		
		Machine m10 = new Machine();
		m10.machineId= 10;
		m10.name= "Generator";
		m10.function= "Power";
		m10.capacity= 160;
		m10.isOperational= true;
		
		f10.machine= m10;
		f10.getFactoryDetails();


		Factory f11 = new Factory();
		f11.factoryName= "Tata Motors";
		f11.location= "Pune";
		f11.workers= 3600;
		f11.isRunning= true;
		f11.type= "Automobile";
		
		Machine m11 = new Machine();
		m11.machineId= 11;
		m11.name= "Assembler";
		m11.function= "Assembly";
		m11.capacity= 150;
		m11.isOperational= true;
		
		f11.machine= m11;
		f11.getFactoryDetails();


		Factory f12 = new Factory();
		f12.factoryName= "Infosys Plant";
		f12.location= "Mysore";
		f12.workers= 2000;
		f12.isRunning= true;
		f12.type= "IT";
		
		Machine m12 = new Machine();
		m12.machineId= 12;
		m12.name= "Server";
		m12.function= "Processing";
		m12.capacity= 200;
		m12.isOperational= true;
		
		f12.machine= m12;
		f12.getFactoryDetails();


		Factory f13 = new Factory();
		f13.factoryName= "Wipro Unit";
		f13.location= "Bangalore";
		f13.workers= 2100;
		f13.isRunning= true;
		f13.type= "IT";
		
		Machine m13 = new Machine();
		m13.machineId= 13;
		m13.name= "Processor";
		m13.function= "Computing";
		m13.capacity= 220;
		m13.isOperational= true;
		
		f13.machine= m13;
		f13.getFactoryDetails();


		Factory f14 = new Factory();
		f14.factoryName= "Ashok Leyland";
		f14.location= "Chennai";
		f14.workers= 3300;
		f14.isRunning= true;
		f14.type= "Automobile";
		
		Machine m14 = new Machine();
		m14.machineId= 14;
		m14.name= "Lathe";
		m14.function= "Shaping";
		m14.capacity= 120;
		m14.isOperational= true;
		
		f14.machine= m14;
		f14.getFactoryDetails();


		Factory f15 = new Factory();
		f15.factoryName= "Britannia";
		f15.location= "Kolkata";
		f15.workers= 1900;
		f15.isRunning= true;
		f15.type= "Food";
		
		Machine m15 = new Machine();
		m15.machineId= 15;
		m15.name= "Oven";
		m15.function= "Baking";
		m15.capacity= 100;
		m15.isOperational= true;
		
		f15.machine= m15;
		f15.getFactoryDetails();


		Factory f16 = new Factory();
		f16.factoryName= "Parle";
		f16.location= "Mumbai";
		f16.workers= 2100;
		f16.isRunning= true;
		f16.type= "Food";
		
		Machine m16 = new Machine();
		m16.machineId= 16;
		m16.name= "Mixer";
		m16.function= "Mixing";
		m16.capacity= 95;
		m16.isOperational= true;
		
		f16.machine= m16;
		f16.getFactoryDetails();


		Factory f17 = new Factory();
		f17.factoryName= "Bosch";
		f17.location= "Bangalore";
		f17.workers= 2600;
		f17.isRunning= true;
		f17.type= "Engineering";
		
		Machine m17 = new Machine();
		m17.machineId= 17;
		m17.name= "Drill";
		m17.function= "Drilling";
		m17.capacity= 130;
		m17.isOperational= true;
		
		f17.machine= m17;
		f17.getFactoryDetails();


		Factory f18 = new Factory();
		f18.factoryName= "Siemens";
		f18.location= "Delhi";
		f18.workers= 2400;
		f18.isRunning= true;
		f18.type= "Electrical";
		
		Machine m18 = new Machine();
		m18.machineId= 18;
		m18.name= "Transformer";
		m18.function= "Voltage";
		m18.capacity= 180;
		m18.isOperational= true;
		
		f18.machine= m18;
		f18.getFactoryDetails();


		Factory f19 = new Factory();
		f19.factoryName= "L&T";
		f19.location= "Chennai";
		f19.workers= 3000;
		f19.isRunning= true;
		f19.type= "Construction";
		
		Machine m19 = new Machine();
		m19.machineId= 19;
		m19.name= "Crane";
		m19.function= "Lifting";
		m19.capacity= 200;
		m19.isOperational= true;
		
		f19.machine= m19;
		f19.getFactoryDetails();

		Factory f20 = new Factory();
		f20.factoryName= "Vedanta";
		f20.location= "Goa";
		f20.workers= 2800;
		f20.isRunning= true;
		f20.type= "Mining";
		
		Machine m20 = new Machine();
		m20.machineId= 20;
		m20.name= "Excavator";
		m20.function= "Digging";
		m20.capacity= 210;
		m20.isOperational= true;
		
		f20.machine= m20;
		f20.getFactoryDetails();
	}
}