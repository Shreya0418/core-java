class BankExecutor{
	public static void main(String[] args) {
		
		Bank b1=new Bank();
		b1.bankName= "SBI";
		b1.branch="MG Road";
		b1.ifscCode = 1001;
		b1.isNationalized= true;
		b1.location= "Bangalore";
		
		AccountHolder a1= new AccountHolder();
		a1.accountNumber= 11101;
		a1.name= "Ravi";
		a1.balance= 50000;
		a1.accountType="Savings";
		a1.isActive= true;	
		b1.accountHolder = a1;
		b1.getBankDetails();

		Bank b2= new Bank();
		b2.bankName ="HDFC";
		b2.branch="Indiranagar";
		b2.ifscCode = 1002;
		b2.isNationalized =false;
		b2.location ="Bangalore";
		
		AccountHolder a2= new AccountHolder();
		a2.accountNumber= 11102;
		a2.name= "Sneha";
		a2.balance= 75000;
		a2.accountType= "Current";
		a2.isActive= true;
		
		b2.accountHolder= a2;
		b2.getBankDetails();


		Bank b3= new Bank();
		b3.bankName= "ICICI";
		b3.branch= "Whitefield";
		b3.ifscCode= 1003;
		b3.isNationalized= false;
		b3.location= "Bangalore";
		
		AccountHolder a3= new AccountHolder();
		a3.accountNumber= 11103;
		a3.name= "Arjun";
		a3.balance= 62000;
		a3.accountType= "Savings";
		a3.isActive= true;
		
		b3.accountHolder= a3;
		b3.getBankDetails();


		Bank b4= new Bank();
		b4.bankName= "Axis";
		b4.branch= "BTM";
		b4.ifscCode= 1004;
		b4.isNationalized= false;
		b4.location= "Bangalore";
		
		AccountHolder a4= new AccountHolder();
		a4.accountNumber= 11104;
		a4.name= "Priya";
		a4.balance= 45000;
		a4.accountType= "Savings";
		a4.isActive= false;
		
		b4.accountHolder= a4;
		b4.getBankDetails();


		Bank b5= new Bank();
		b5.bankName= "Canara";
		b5.branch= "Yelahanka";
		b5.ifscCode= 1005;
		b5.isNationalized= true;
		b5.location= "Bangalore";
		
		AccountHolder a5= new AccountHolder();
		a5.accountNumber= 11105;
		a5.name= "Kiran";
		a5.balance= 88000;
		a5.accountType= "Current";
		a5.isActive= true;
		
		b5.accountHolder= a5;
		b5.getBankDetails();


		Bank b6= new Bank();
		b6.bankName= "PNB";
		b6.branch= "Majestic";
		b6.ifscCode= 1006;
		b6.isNationalized= true;
		b6.location= "Bangalore";
		
		AccountHolder a6= new AccountHolder();
		a6.accountNumber= 11106;
		a6.name= "Anita";
		a6.balance= 39000;
		a6.accountType= "Savings";
		a6.isActive= true;
		
		b6.accountHolder= a6;
		b6.getBankDetails();


		Bank b7= new Bank();
		b7.bankName= "Kotak";
		b7.branch= "Hebbal";
		b7.ifscCode= 1007;
		b7.isNationalized= false;
		b7.location= "Bangalore";
		
		AccountHolder a7= new AccountHolder();
		a7.accountNumber= 11107;
		a7.name= "Rahul";
		a7.balance= 99000;
		a7.accountType= "Current";
		a7.isActive= true;
		
		b7.accountHolder= a7;
		b7.getBankDetails();


		Bank b8= new Bank();
		b8.bankName= "Yes Bank";
		b8.branch = "Electronic City";
		b8.ifscCode=1008;
		b8.isNationalized=false;
		b8.location= "Bangalore";
		
		AccountHolder a8= new AccountHolder();
		a8.accountNumber= 11108;
		a8.name= "Divya";
		a8.balance= 72000;
		a8.accountType= "Savings";
		a8.isActive= false;
		
		b8.accountHolder= a8;
		b8.getBankDetails();


		Bank b9= new Bank();
		b9.bankName= "SBI";
		b9.branch= "Jayanagar";
		b9.ifscCode= 1009;
		b9.isNationalized= true;
		b9.location= "Bangalore";

		AccountHolder a9= new AccountHolder();
		a9.accountNumber= 11109;
		a9.name= "Manoj";
		a9.balance= 61000;
		a9.accountType= "Savings";
		a9.isActive= true;
		b9.accountHolder= a9;
		b9.getBankDetails();


		Bank b10= new Bank();
		b10.bankName= "HDFC";
		b10.branch= "Marathahalli";
		b10.ifscCode= 1010;
		b10.isNationalized= false;
		b10.location= "Bangalore";
		
		AccountHolder a10= new AccountHolder();
		a10.accountNumber= 11110;
		a10.name= "Neha";
		a10.balance= 83000;
		a10.accountType= "Current";
		a10.isActive= true;
		
		b10.accountHolder= a10;
		b10.getBankDetails();


		Bank b11= new Bank();
		b11.bankName= "ICICI";
		b11.branch= "BTM";
		b11.ifscCode= 1011;
		b11.isNationalized= false;
		b11.location= "Bangalore";
		
		AccountHolder a11= new AccountHolder();
		a11.accountNumber= 11111;
		a11.name= "Amit";
		a11.balance= 40000;
		a11.accountType= "Savings";
		a11.isActive= true;
		b11.accountHolder= a11;
		b11.getBankDetails();


		Bank b12= new Bank();
		b12.bankName= "Axis";
		b12.branch= "Whitefield";
		b12.ifscCode= 1012;
		b12.isNationalized= false;
		b12.location= "Bangalore";
		
		AccountHolder a12= new AccountHolder();
		a12.accountNumber= 11112;
		a12.name= "Pooja";
		a12.balance= 95000;
		a12.accountType= "Current";
		a12.isActive= false;
		
		b12.accountHolder= a12;
		b12.getBankDetails();
		Bank b13= new Bank();
		b13.bankName= "Canara";
		b13.branch= "Malleshwaram";
		b13.ifscCode= 1013;
		b13.isNationalized= true;
		b13.location= "Bangalore";
		
		AccountHolder a13= new AccountHolder();
		a13.accountNumber= 11113;
		a13.name= "Vikas";
		a13.balance= 67000;
		a13.accountType= "Savings";
		a13.isActive= true;
		
		b13.accountHolder= a13;
		b13.getBankDetails();


		Bank b14= new Bank();
		b14.bankName= "PNB";
		b14.branch= "Yeshwanthpur";
		b14.ifscCode= 1014;
		b14.isNationalized= true;
		b14.location= "Bangalore";
		
		AccountHolder a14= new AccountHolder();
		a14.accountNumber= 11114;
		a14.name= "Meena";
		a14.balance= 72000;
		a14.accountType= "Savings";
		a14.isActive= true;
		
		b14.accountHolder= a14;
		b14.getBankDetails();


		Bank b15= new Bank();
		b15.bankName= "Kotak";
		b15.branch= "KR Puram";
		b15.ifscCode= 1015;
		b15.isNationalized= false;
		b15.location= "Bangalore";
		
		AccountHolder a15= new AccountHolder();
		a15.accountNumber= 11115;
		a15.name= "Karthik";
		a15.balance= 88000;
		a15.accountType= "Current";
		a15.isActive= false;
		
		b15.accountHolder= a15;
		b15.getBankDetails();


		Bank b16= new Bank();
		b16.bankName= "Yes Bank";
		b16.branch= "BTM";
		b16.ifscCode= 1016;
		b16.isNationalized= false;
		b16.location= "Bangalore";
		
		AccountHolder a16= new AccountHolder();
		a16.accountNumber= 11116;
		a16.name= "Swathi";
		a16.balance= 54000;
		a16.accountType= "Savings";
		a16.isActive= true;
		
		b16.accountHolder= a16;
		b16.getBankDetails();


		Bank b17= new Bank();
		b17.bankName= "SBI";
		b17.branch= "Hebbal";
		b17.ifscCode= 1017;
		b17.isNationalized= true;
		b17.location= "Bangalore";
		
		AccountHolder a17= new AccountHolder();
		a17.accountNumber= 11117;
		a17.name= "Deepak";
		a17.balance= 60000;
		a17.accountType= "Savings";
		a17.isActive= true;
		
		b17.accountHolder= a17;
		b17.getBankDetails();


		Bank b18= new Bank();
		b18.bankName= "HDFC";
		b18.branch= "Indiranagar";
		b18.ifscCode= 1018;
		b18.isNationalized= false;
		b18.location= "Bangalore";
		
		AccountHolder a18= new AccountHolder();
		a18.accountNumber= 11118;
		a18.name= "Nisha";
		a18.balance= 78000;
		a18.accountType= "Current";
		a18.isActive= true;
		
		b18.accountHolder= a18;
		b18.getBankDetails();


		Bank b19= new Bank();
		b19.bankName= "ICICI";
		b19.branch= "Marathahalli";
		b19.ifscCode= 1019;
		b19.isNationalized= false;
		b19.location= "Bangalore";
		
		AccountHolder a19= new AccountHolder();
		a19.accountNumber= 11119;
		a19.name= "Suresh";
		a19.balance= 91000;
		a19.accountType= "Savings";
		a19.isActive= true;
		
		b19.accountHolder= a19;
		b19.getBankDetails();


		Bank b20= new Bank();
		b20.bankName= "Axis";
		b20.branch= "Electronic City";
		b20.ifscCode= 1020;
		b20.isNationalized= false;
		b20.location= "Bangalore";
		
		AccountHolder a20= new AccountHolder();
		a20.accountNumber= 11120;
		a20.name= "Lakshmi";
		a20.balance= 85000;
		a20.accountType= "Current";
		a20.isActive= true;
		
		b20.accountHolder= a20;
		b20.getBankDetails();
	}
}