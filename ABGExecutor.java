class ABGExecutor{
	public static void main(String[] args) {
		AdityaBirlaGroup a1= new AdityaBirlaGroup();
		a1.chairman="Kumar Mangalam";
		a1.industry= "Conglomerate";
		a1.revenue= 100000;
		a1.isGlobal= true;
		a1.headquarters="Mumbai";
		RCB r1 = new RCB();
		r1.teamId = 1;
		r1.captain= "Faf";
		r1.trophies=0;
		r1.homeGround= "Chinnaswamy";
		r1.isPopular= true;

		a1.team= r1;
		a1.getCompanyDetails();

		AdityaBirlaGroup a2 = new AdityaBirlaGroup();
		a2.chairman= "Aditya";
		a2.industry= "Textile";
		a2.revenue= 80000;
		a2.isGlobal= true;
		a2.headquarters= "Delhi";

		RCB r2 = new RCB();
		r2.teamId= 2;
		r2.captain="Virat";
		r2.trophies= 0;
		r2.homeGround= "Bangalore";
		r2.isPopular= true;

		a2.team= r2;
		a2.getCompanyDetails();
		AdityaBirlaGroup a3 =new AdityaBirlaGroup();
		a3.chairman= "Rajeev";
		a3.industry= "Cement";
		a3.revenue= 90000;
		a3.isGlobal= true;
		a3.headquarters= "Kolkata";

		RCB r3 = new RCB();
		r3.teamId=3;
		r3.captain= "ABD";
		r3.trophies= 0;
		r3.homeGround= "Bangalore";
		r3.isPopular= true;

		a3.team=r3;
		a3.getCompanyDetails();
		AdityaBirlaGroup a4 = new AdityaBirlaGroup();
		a4.chairman= "Sanjay";
		a4.industry= "Metals";
		a4.revenue= 95000;
		a4.isGlobal= true;
		a4.headquarters= "Mumbai";

		RCB r4 = new RCB();
		r4.teamId= 4;
		r4.captain= "Maxwell";
		r4.trophies= 0;
		r4.homeGround= "Chinnaswamy";
		r4.isPopular= true;

		a4.team= r4;
		a4.getCompanyDetails();


		AdityaBirlaGroup a5 = new AdityaBirlaGroup();
		a5.chairman= "Anil";
		a5.industry= "Finance";
		a5.revenue= 70000;
		a5.isGlobal= true;
		a5.headquarters= "Delhi";

		RCB r5 = new RCB();
		r5.teamId= 5;
		r5.captain= "Rahul";
		r5.trophies= 0;
		r5.homeGround= "Bangalore";
		r5.isPopular= true;

		a5.team= r5;
		a5.getCompanyDetails();


		AdityaBirlaGroup a6 = new AdityaBirlaGroup();
		a6.chairman= "Ramesh";
		a6.industry= "Telecom";
		a6.revenue= 85000;
		a6.isGlobal= true;
		a6.headquarters= "Mumbai";

		RCB r6 = new RCB();
		r6.teamId= 6;
		r6.captain= "Gayle";
		r6.trophies= 0;
		r6.homeGround= "Chinnaswamy";
		r6.isPopular= true;

		a6.team= r6;
		a6.getCompanyDetails();


		AdityaBirlaGroup a7= new AdityaBirlaGroup();
		a7.chairman= "Suresh";
		a7.industry= "Retail";
		a7.revenue= 60000;
		a7.isGlobal= true;
		a7.headquarters= "Hyderabad";

		RCB r7 = new RCB();
		r7.teamId= 7;
		r7.captain= "Kohli";
		r7.trophies= 0;
		r7.homeGround= "Bangalore";
		r7.isPopular= true;

		a7.team= r7;
		a7.getCompanyDetails();
		AdityaBirlaGroup a8 =new AdityaBirlaGroup();
		a8.chairman= "Mahesh";
		a8.industry= "Chemicals";
		a8.revenue= 78000;
		a8.isGlobal= true;
		a8.headquarters= "Chennai";

		RCB r8 = new RCB();
		r8.teamId= 8;
		r8.captain="Smith";
		r8.trophies= 0;
		r8.homeGround= "Chinnaswamy";
		r8.isPopular= true;

		a8.team= r8;
		a8.getCompanyDetails();


		AdityaBirlaGroup a9 = new AdityaBirlaGroup();
		a9.chairman= "Nikhil";
		a9.industry= "IT";
		a9.revenue= 92000;
		a9.isGlobal= true;
		a9.headquarters= "Bangalore";

		RCB r9 = new RCB();
		r9.teamId= 9;
		r9.captain= "Watson";
		r9.trophies= 0;
		r9.homeGround= "Bangalore";
		r9.isPopular= true;

		a9.team= r9;
		a9.getCompanyDetails();


		AdityaBirlaGroup a10 = new AdityaBirlaGroup();
		a10.chairman= "Amit";
		a10.industry= "Energy";
		a10.revenue= 88000;
		a10.isGlobal= true;
		a10.headquarters= "Delhi";

		RCB r10 = new RCB();
		r10.teamId= 10;
		r10.captain= "Green";
		r10.trophies= 0;
		r10.homeGround= "Chinnaswamy";
		r10.isPopular= true;

		a10.team= r10;
		a10.getCompanyDetails();


		AdityaBirlaGroup a11 = new AdityaBirlaGroup();
		a11.chairman= "Karan";
		a11.industry= "Textile";
		a11.revenue= 76000;
		a11.isGlobal= true;
		a11.headquarters= "Mumbai";

		RCB r11 = new RCB();
		r11.teamId= 11;
		r11.captain= "Du Plessis";
		r11.trophies= 0;
		r11.homeGround= "Bangalore";
		r11.isPopular= true;

		a11.team= r11;
		a11.getCompanyDetails();


		AdityaBirlaGroup a12 = new AdityaBirlaGroup();
		a12.chairman= "Ravi";
		a12.industry= "Cement";
		a12.revenue= 81000;
		a12.isGlobal= true;
		a12.headquarters= "Kolkata";

		RCB r12 = new RCB();
		r12.teamId= 12;
		r12.captain= "Siraj";
		r12.trophies= 0;
		r12.homeGround= "Chinnaswamy";
		r12.isPopular= true;

		a12.team= r12;
		a12.getCompanyDetails();
		AdityaBirlaGroup a13 = new AdityaBirlaGroup();
		a13.chairman= "Deepak";
		a13.industry= "Metals";
		a13.revenue= 83000;
		a13.isGlobal= true;
		a13.headquarters= "Delhi";

		RCB r13 = new RCB();
		r13.teamId= 13;
		r13.captain= "Chahal";
		r13.trophies= 0;
		r13.homeGround= "Bangalore";
		r13.isPopular= true;

		a13.team= r13;
		a13.getCompanyDetails();


		AdityaBirlaGroup a14 = new AdityaBirlaGroup();
		a14.chairman= "Vikas";
		a14.industry= "Finance";
		a14.revenue= 72000;
		a14.isGlobal= true;
		a14.headquarters= "Mumbai";

		RCB r14 = new RCB();
		r14.teamId= 14;
		r14.captain= "Padikkal";
		r14.trophies= 0;
		r14.homeGround= "Chinnaswamy";
		r14.isPopular= true;

		a14.team= r14;
		a14.getCompanyDetails();


		AdityaBirlaGroup a15 = new AdityaBirlaGroup();
		a15.chairman= "Arjun";
		a15.industry= "Retail";
		a15.revenue= 69000;
		a15.isGlobal= true;
		a15.headquarters= "Chennai";

		RCB r15 = new RCB();
		r15.teamId= 15;
		r15.captain= "DK";
		r15.trophies= 0;
		r15.homeGround= "Bangalore";
		r15.isPopular= true;

		a15.team= r15;
		a15.getCompanyDetails();


		AdityaBirlaGroup a16 = new AdityaBirlaGroup();
		a16.chairman= "Nitin";
		a16.industry= "IT";
		a16.revenue= 91000;
		a16.isGlobal= true;
		a16.headquarters= "Bangalore";

		RCB r16 = new RCB();
		r16.teamId= 16;
		r16.captain= "Patidar";
		r16.trophies= 0;
		r16.homeGround= "Chinnaswamy";
		r16.isPopular= true;

		a16.team= r16;
		a16.getCompanyDetails();


		AdityaBirlaGroup a17 = new AdityaBirlaGroup();
		a17.chairman= "Harish";
		a17.industry= "Energy";
		a17.revenue= 87000;
		a17.isGlobal= true;
		a17.headquarters= "Delhi";

		RCB r17 = new RCB();
		r17.teamId= 17;
		r17.captain= "Hazlewood";
		r17.trophies= 0;
		r17.homeGround= "Bangalore";
		r17.isPopular= true;

		a17.team= r17;
		a17.getCompanyDetails();

		AdityaBirlaGroup a18 = new AdityaBirlaGroup();
		a18.chairman= "Gaurav";
		a18.industry= "Chemicals";
		a18.revenue= 79000;
		a18.isGlobal= true;
		a18.headquarters= "Mumbai";

		RCB r18 = new RCB();
		r18.teamId= 18;
		r18.captain= "Hasaranga";
		r18.trophies= 0;
		r18.homeGround= "Chinnaswamy";
		r18.isPopular= true;

		a18.team= r18;
		a18.getCompanyDetails();


		AdityaBirlaGroup a19 = new AdityaBirlaGroup();
		a19.chairman= "Rahul";
		a19.industry= "Telecom";
		a19.revenue= 86000;
		a19.isGlobal= true;
		a19.headquarters= "Hyderabad";

		RCB r19 = new RCB();
		r19.teamId= 19;
		r19.captain= "Allen";
		r19.trophies= 0;
		r19.homeGround= "Bangalore";
		r19.isPopular= true;

		a19.team= r19;
		a19.getCompanyDetails();

		AdityaBirlaGroup a20 = new AdityaBirlaGroup();
		a20.chairman= "Lakshmi";
		a20.industry= "Conglomerate";
		a20.revenue= 105000;
		a20.isGlobal= true;
		a20.headquarters= "Mumbai";

		RCB r20 =new RCB();
		r20.teamId= 20;
		r20.captain= "Siraj";
		r20.trophies= 0;
		r20.homeGround= "Chinnaswamy";
		r20.isPopular= true;

		a20.team= r20;
		a20.getCompanyDetails();
	}
}