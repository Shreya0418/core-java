class MovieExecutor {

    public static void main(String[] args) {

        Movie movie = new Movie();

        Ticket t1 = new Ticket();
        t1.seatNo = 1;
        t1.customerName = "Shreya";
        t1.price = 250;
        t1.type = "Gold";

        Ticket t2 = new Ticket();
        t2.seatNo = 2;
        t2.customerName = "Monika";
        t2.price = 300;
        t2.type = "Silver";

        Ticket t3 = new Ticket();
        t3.seatNo = 3;
        t3.customerName = "Shreee";
        t3.price = 200;
        t3.type = "Gold";

        boolean add1 = movie.createTicket(t1);
        System.out.println(add1);

        boolean add2 = movie.createTicket(t2);
        System.out.println(add2);

        boolean add3 = movie.createTicket(t3);
        System.out.println(add3);

        movie.getTickets();

        int seat = movie.searchSeat(2);
        System.out.println(seat + " found");
		// movie.getTickets();

        boolean update = movie.updateSeat(2, 10);
        System.out.println(update);

        movie.getTickets();

        boolean delete = movie.deleteSeat(1);
        System.out.println(delete);

        movie.getTickets();
    }
}