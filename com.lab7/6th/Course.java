class Course {
    int id;
    String description;
    int duration;
    double fees;

    Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }
    
    void GetData() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration);
        System.out.println("Fees: " + fees);
        System.out.println();
    }
}