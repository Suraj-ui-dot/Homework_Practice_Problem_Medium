public class Library {
    String bookName;
    String authorName;
    int ISBN;

    public static void main(String[] args) {
        Library book1 = new Library();
        book1.bookName = "Jiwan Kada ki Phool";
        book1.authorName = "Jhamak Ghimire";
        book1.ISBN =909;

        System.out.println("Book Name: " + book1.bookName);
        System.out.println("Author Name: " + book1.authorName);
        System.out.println("ISBN: " + book1.ISBN);
        
        Library book2= new Library();
        book2.bookName = "Harry Potter";
        book2.authorName = "J.K. Rowling";
        book2.ISBN =978;

        System.out.println("Book Name: " + book2.bookName);
        System.out.println("Author Name: " + book2.authorName);
        System.out.println("ISBN: " + book2.ISBN);

        Library book3= new Library();
        book3.bookName = "Muna Madan";
        book3.authorName = "Laxmi Prasad Devkota";
        book3.ISBN =962;

        System.out.println("Book Name: " + book3.bookName);
        System.out.println("Author Name: " + book3.authorName);
        System.out.println("ISBN: " + book3.ISBN);

        
        Library book4= new Library();
        book4.bookName = "Ugly Love";
        book4.authorName = "Colleen Hoover";
        book4.ISBN =981;

        System.out.println("Book Name: " + book4.bookName);
        System.out.println("Author Name: " + book4.authorName);
        System.out.println("ISBN: " + book4.ISBN);

        Library book5= new Library();
        book5.bookName = "Ikigai";
        book5.authorName = "Hector Garcia";
        book5.ISBN =963;

        System.out.println("Book Name: " + book5.bookName);
        System.out.println("Author Name: " + book5.authorName);
        System.out.println("ISBN: " + book5.ISBN);
    }
}
