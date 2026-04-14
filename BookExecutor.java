class BookExecutor {
    public static void main(String[] args) {

        Book bookOne = new Book();
        bookOne.isbn = 101;
        bookOne.title = "Atomic Habits";
        bookOne.author = "James Clear";
        bookOne.price = 499;
        bookOne.isAvailable = true;

        Book bookTwo = new Book();
        bookTwo.isbn = 102;
        bookTwo.title = "Ikigai";
        bookTwo.author = "Hector Garcia";
        bookTwo.price = 399;
        bookTwo.isAvailable = true;

        Book bookThree = new Book();
        bookThree.isbn = 103;
        bookThree.title = "Rich Dad Poor Dad";
        bookThree.author = "Robert Kiyosaki";
        bookThree.price = 450;
        bookThree.isAvailable = false;

        Book bookFour = new Book();
        bookFour.isbn = 104;
        bookFour.title = "Deep Work";
        bookFour.author = "Cal Newport";
        bookFour.price = 550;
        bookFour.isAvailable = true;

        Book bookFive = new Book();
        bookFive.isbn = 105;
        bookFive.title = "The Alchemist";
        bookFive.author = "Paulo Coelho";
        bookFive.price = 299;
        bookFive.isAvailable = true;

        Book bookSix = new Book();
        bookSix.isbn = 106;
        bookSix.title = "Think Like Monk";
        bookSix.author = "Jay Shetty";
        bookSix.price = 470;
        bookSix.isAvailable = false;

        Book bookSeven = new Book();
        bookSeven.isbn = 107;
        bookSeven.title = "Do Epic Shit";
        bookSeven.author = "Ankur Warikoo";
        bookSeven.price = 380;
        bookSeven.isAvailable = true;

        Book bookEight = new Book();
        bookEight.isbn = 108;
        bookEight.title = "Zero to One";
        bookEight.author = "Peter Thiel";
        bookEight.price = 600;
        bookEight.isAvailable = true;

        Book bookNine = new Book();
        bookNine.isbn = 109;
        bookNine.title = "Sapiens";
        bookNine.author = "Yuval Noah Harari";
        bookNine.price = 699;
        bookNine.isAvailable = false;

        Book bookTen = new Book();
        bookTen.isbn = 110;
        bookTen.title = "1984";
        bookTen.author = "George Orwell";
        bookTen.price = 350;
        bookTen.isAvailable = true;

        Book bookEleven = new Book();
        bookEleven.isbn = 111;
        bookEleven.title = "The Hobbit";
        bookEleven.author = "J.R.R Tolkien";
        bookEleven.price = 520;
        bookEleven.isAvailable = true;

        Book bookTwelve = new Book();
        bookTwelve.isbn = 112;
        bookTwelve.title = "Harry Potter";
        bookTwelve.author = "J.K Rowling";
        bookTwelve.price = 799;
        bookTwelve.isAvailable = true;

        Book bookThirteen = new Book();
        bookThirteen.isbn = 113;
        bookThirteen.title = "The Psychology of Money";
        bookThirteen.author = "Morgan Housel";
        bookThirteen.price = 480;
        bookThirteen.isAvailable = false;

        Book bookFourteen = new Book();
        bookFourteen.isbn = 114;
        bookFourteen.title = "Can't Hurt Me";
        bookFourteen.author = "David Goggins";
        bookFourteen.price = 650;
        bookFourteen.isAvailable = true;

        Book bookFifteen = new Book();
        bookFifteen.isbn = 115;
        bookFifteen.title = "The Subtle Art";
        bookFifteen.author = "Mark Manson";
        bookFifteen.price = 430;
        bookFifteen.isAvailable = true;


        Book books[] = new Book[15];

        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        books[4] = bookFive;
        books[5] = bookSix;
        books[6] = bookSeven;
        books[7] = bookEight;
        books[8] = bookNine;
        books[9] = bookTen;
        books[10] = bookEleven;
        books[11] = bookTwelve;
        books[12] = bookThirteen;
        books[13] = bookFourteen;
        books[14] = bookFifteen;


        for (Book book : books) {
            System.out.println("ISBN: " + book.isbn);
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Price: " + book.price);
            System.out.println("Available: " + book.isAvailable);
            System.out.println("----------------");
        }
    }
}