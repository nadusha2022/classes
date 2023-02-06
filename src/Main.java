public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author("Лев", "Толстой");

        Book prorok = new Book("Пророк", 1828, Pushkin);
        Book warANDPeace = new Book("Война и мир", 1873, Tolstoy);

        print (prorok);
        print (warANDPeace);

    }
    private static void print (Book book) {
        System.out.println("Название книги: " + book.getTitle() + ",год издания: " + book.getPublishingYear() + ", автор: "
                + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
    }
}