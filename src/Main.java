public class Main {
    public static void main(String[] args) {

        Author author = new Author("Федор", "Достоевский ");
        Author author1 = new Author("Лев", "Толстой");

        Book book = new Book("Идиот", 1821, author);
        book.setYear(1852);
        Book book1 = new Book("Война и Мир", 1867, author1);

        System.out.println(book);
        System.out.println(book1);
    }
}