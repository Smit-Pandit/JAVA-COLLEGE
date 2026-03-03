


public class Library {
    public static void main(String[] args) {
        Periodical p = new Periodical(101, "Java", "Smit", 500.0, "Monthly");

        System.out.println("Book Details:");
        p.displayPeriodical();

        p.modify(600.0, "Weekly");

        System.out.println("\nUpdated Details:");
        p.displayPeriodical();
    }
}