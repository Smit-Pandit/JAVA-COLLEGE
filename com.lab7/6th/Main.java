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

public class Main{
    public static void main(String[] args) {

        Course[] courses = new Course[5];

        courses[0] = new Course(1, "Java", 6, 15000);
        courses[1] = new Course(2, "Python", 4, 12000);
        courses[2] = new Course(3, "Data Structures", 5, 18000);
        courses[3] = new Course(4, "DBMS", 3, 10000);
        courses[4] = new Course(5, "AI", 8, 25000);

        for (Course course : courses) {
            course.GetData();
        }
    }
}