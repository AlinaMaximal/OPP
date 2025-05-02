package Lab6.Task1.Task5;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public Book(String title) {
        this.title = title;
        this.author = "Невідомий автор";
    }

    public void Info() {
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
    }
}

