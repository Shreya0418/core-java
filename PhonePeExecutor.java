class PhonePeExecutor {

    public static void main(String[] args) {

        PhonePe p1 = new PhonePe();
        p1.userName = "Rahul";
        p1.mobileNumber = "9000000001";
        p1.pin = 1111;
        p1.isVerified = true;
        p1.bankLinked = "SBI";

        History h1 = new History();
        h1.transactionId = 1;
        h1.amount = 500;
        h1.type = "Recharge";
        h1.date = "01-01-2026";
        h1.status = true;

        p1.history = h1;
        p1.getPhonePeDetails();

        PhonePe p2 = new PhonePe();
        p2.userName = "Sneha";
        p2.mobileNumber = "9000000002";
        p2.pin = 2222;
        p2.isVerified = true;
        p2.bankLinked = "HDFC";

        History h2 = new History();
        h2.transactionId = 2;
        h2.amount = 1200;
        h2.type = "Transfer";
        h2.date = "02-01-2026";
        h2.status = true;

        p2.history = h2;
        p2.getPhonePeDetails();


        PhonePe p3 = new PhonePe();
        p3.userName = "Arjun";
        p3.mobileNumber = "9000000003";
        p3.pin = 3333;
        p3.isVerified = false;
        p3.bankLinked = "ICICI";

        History h3 = new History();
        h3.transactionId = 3;
        h3.amount = 800;
        h3.type = "Bill";
        h3.date = "03-01-2026";
        h3.status = false;

        p3.history = h3;
        p3.getPhonePeDetails();


        PhonePe p4 = new PhonePe();
        p4.userName = "Priya";
        p4.mobileNumber = "9000000004";
        p4.pin = 4444;
        p4.isVerified = true;
        p4.bankLinked = "Axis";

        History h4 = new History();
        h4.transactionId = 4;
        h4.amount = 950;
        h4.type = "Recharge";
        h4.date = "04-01-2026";
        h4.status = true;

        p4.history = h4;
        p4.getPhonePeDetails();


        PhonePe p5 = new PhonePe();
        p5.userName = "Kiran";
        p5.mobileNumber = "9000000005";
        p5.pin = 5555;
        p5.isVerified = true;
        p5.bankLinked = "Kotak";

        History h5 = new History();
        h5.transactionId = 5;
        h5.amount = 1500;
        h5.type = "Transfer";
        h5.date = "05-01-2026";
        h5.status = true;

        p5.history = h5;
        p5.getPhonePeDetails();


        PhonePe p6 = new PhonePe();
        p6.userName = "Anita";
        p6.mobileNumber = "9000000006";
        p6.pin = 6666;
        p6.isVerified = false;
        p6.bankLinked = "SBI";

        History h6 = new History();
        h6.transactionId = 6;
        h6.amount = 300;
        h6.type = "Bill";
        h6.date = "06-01-2026";
        h6.status = true;

        p6.history = h6;
        p6.getPhonePeDetails();


        PhonePe p7 = new PhonePe();
        p7.userName = "Ravi";
        p7.mobileNumber = "9000000007";
        p7.pin = 7777;
        p7.isVerified = true;
        p7.bankLinked = "PNB";

        History h7 = new History();
        h7.transactionId = 7;
        h7.amount = 200;
        h7.type = "Recharge";
        h7.date = "07-01-2026";
        h7.status = true;

        p7.history = h7;
        p7.getPhonePeDetails();


        PhonePe p8 = new PhonePe();
        p8.userName = "Divya";
        p8.mobileNumber = "9000000008";
        p8.pin = 8888;
        p8.isVerified = true;
        p8.bankLinked = "Yes Bank";

        History h8 = new History();
        h8.transactionId = 8;
        h8.amount = 1750;
        h8.type = "Transfer";
        h8.date = "08-01-2026";
        h8.status = true;

        p8.history = h8;
        p8.getPhonePeDetails();


        PhonePe p9 = new PhonePe();
        p9.userName = "Manoj";
        p9.mobileNumber = "9000000009";
        p9.pin = 9999;
        p9.isVerified = false;
        p9.bankLinked = "SBI";

        History h9 = new History();
        h9.transactionId = 9;
        h9.amount = 650;
        h9.type = "Bill";
        h9.date = "09-01-2026";
        h9.status = false;

        p9.history = h9;
        p9.getPhonePeDetails();


        PhonePe p10 = new PhonePe();
        p10.userName = "Neha";
        p10.mobileNumber = "9000000010";
        p10.pin = 1010;
        p10.isVerified = true;
        p10.bankLinked = "HDFC";

        History h10 = new History();
        h10.transactionId = 10;
        h10.amount = 2200;
        h10.type = "Transfer";
        h10.date = "10-01-2026";
        h10.status = true;

        p10.history = h10;
        p10.getPhonePeDetails();


        PhonePe p11 = new PhonePe();
        p11.userName = "Amit";
        p11.mobileNumber = "9000000011";
        p11.pin = 1110;
        p11.isVerified = true;
        p11.bankLinked = "ICICI";

        History h11 = new History();
        h11.transactionId = 11;
        h11.amount = 400;
        h11.type = "Recharge";
        h11.date = "11-01-2026";
        h11.status = true;

        p11.history = h11;
        p11.getPhonePeDetails();


        PhonePe p12 = new PhonePe();
        p12.userName = "Pooja";
        p12.mobileNumber = "9000000012";
        p12.pin = 1212;
        p12.isVerified = false;
        p12.bankLinked = "Axis";

        History h12 = new History();
        h12.transactionId = 12;
        h12.amount = 980;
        h12.type = "Bill";
        h12.date = "12-01-2026";
        h12.status = true;

        p12.history = h12;
        p12.getPhonePeDetails();


        PhonePe p13 = new PhonePe();
        p13.userName = "Vikas";
        p13.mobileNumber = "9000000013";
        p13.pin = 1313;
        p13.isVerified = true;
        p13.bankLinked = "Kotak";

        History h13 = new History();
        h13.transactionId = 13;
        h13.amount = 1600;
        h13.type = "Transfer";
        h13.date = "13-01-2026";
        h13.status = true;

        p13.history = h13;
        p13.getPhonePeDetails();


        PhonePe p14 = new PhonePe();
        p14.userName = "Meena";
        p14.mobileNumber = "9000000014";
        p14.pin = 1414;
        p14.isVerified = true;
        p14.bankLinked = "SBI";

        History h14 = new History();
        h14.transactionId = 14;
        h14.amount = 300;
        h14.type = "Recharge";
        h14.date = "14-01-2026";
        h14.status = true;

        p14.history = h14;
        p14.getPhonePeDetails();


        PhonePe p15 = new PhonePe();
        p15.userName = "Karthik";
        p15.mobileNumber = "9000000015";
        p15.pin = 1515;
        p15.isVerified = false;
        p15.bankLinked = "PNB";

        History h15 = new History();
        h15.transactionId = 15;
        h15.amount = 720;
        h15.type = "Bill";
        h15.date = "15-01-2026";
        h15.status = false;

        p15.history = h15;
        p15.getPhonePeDetails();


        PhonePe p16 = new PhonePe();
        p16.userName = "Swathi";
        p16.mobileNumber = "9000000016";
        p16.pin = 1616;
        p16.isVerified = true;
        p16.bankLinked = "Yes Bank";

        History h16 = new History();
        h16.transactionId = 16;
        h16.amount = 2500;
        h16.type = "Transfer";
        h16.date = "16-01-2026";
        h16.status = true;

        p16.history = h16;
        p16.getPhonePeDetails();


        PhonePe p17 = new PhonePe();
        p17.userName = "Deepak";
        p17.mobileNumber = "9000000017";
        p17.pin = 1717;
        p17.isVerified = true;
        p17.bankLinked = "ICICI";

        History h17 = new History();
        h17.transactionId = 17;
        h17.amount = 450;
        h17.type = "Recharge";
        h17.date = "17-01-2026";
        h17.status = true;

        p17.history = h17;
        p17.getPhonePeDetails();


        PhonePe p18 = new PhonePe();
        p18.userName = "Nisha";
        p18.mobileNumber = "9000000018";
        p18.pin = 1818;
        p18.isVerified = false;
        p18.bankLinked = "Axis";

        History h18 = new History();
        h18.transactionId = 18;
        h18.amount = 1100;
        h18.type = "Bill";
        h18.date = "18-01-2026";
        h18.status = true;

        p18.history = h18;
        p18.getPhonePeDetails();


        PhonePe p19 = new PhonePe();
        p19.userName = "Suresh";
        p19.mobileNumber = "9000000019";
        p19.pin = 1919;
        p19.isVerified = true;
        p19.bankLinked = "Kotak";

        History h19 = new History();
        h19.transactionId = 19;
        h19.amount = 1900;
        h19.type = "Transfer";
        h19.date = "19-01-2026";
        h19.status = true;

        p19.history = h19;
        p19.getPhonePeDetails();


        PhonePe p20 = new PhonePe();
        p20.userName = "Lakshmi";
        p20.mobileNumber = "9000000020";
        p20.pin = 2020;
        p20.isVerified = true;
        p20.bankLinked = "SBI";

        History h20 = new History();
        h20.transactionId = 20;
        h20.amount = 600;
        h20.type = "Recharge";
        h20.date = "20-01-2026";
        h20.status = true;

        p20.history = h20;
        p20.getPhonePeDetails();
    }
}