public class Library {
    public static void main(String[] args) {
        Author author01 = new Author("Jim Done", "jdone@yahoo.com", 'M');
        Author author02 = new Author("Beth Barnacle", "bbarnacle@gmail.com", 'F');
        Author author03 = new Author("Steve Dingle", "sdingle@outlook.com", 'M');
        Book book1 = new Book("Ouch!", 9.99, author01, 17);
        Book book2 = new Book("Jane's Dilemma", 14.99 , author03, 31);
        Book book3 = new Book("Quantum Coding", 26.50, author02, 3);
        Book book4 = new Book("A Pregnant Calm", 17.50, author02, 6);
        Book book5 = new Book("Psychology For Fish", 23.99, author01, 2);

        System.out.println(book1);



    }
}