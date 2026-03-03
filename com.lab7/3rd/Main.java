class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Periodical extends Book {
    String period;

    Periodical(int bookId, String title, String author, double price, String period) {
        super(bookId, title, author, price);
        this.period = period;
    }

    void modify(double newPrice, String newPeriod) {
        this.price = newPrice;
        this.period = newPeriod;
    }

    void displayPeriodical() {
        display();
        System.out.println("Period: " + period);
    }
}

public class Main {
    public static void main(String[] args) {
        Periodical p = new Periodical(101, "Java Basics", "Smit", 500.0, "Monthly");

        System.out.println("Book Details:");
        p.displayPeriodical();

        p.modify(600.0, "Weekly");

        System.out.println("\nUpdated Details:");
        p.displayPeriodical();
    }
}