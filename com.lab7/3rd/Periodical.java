class Periodical extends book {
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
