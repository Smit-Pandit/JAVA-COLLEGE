// i). Average: which would accept marks of 3 examinations & return whether the student has passed or failed
// Depending on whether he has scored an average above 50 or not.
// ii). Input name: which would accept the name of the student & returns the name

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter student name : ");
        String name = s.nextLine();
        System.out.print("Enter the marks in 1st subject : ");
        int mark1 = s.nextInt();
        System.out.print("Enter the marks in 2nd subject : ");
        int mark2 = s.nextInt();
        System.out.print("Enter the marks in 3rd subject : ");
        int mark3 = s.nextInt();
        student st = new student(name, mark1, mark2, mark3);
        System.out.println("Student Name: " + st.getName());
        st.displayResult();
        s.close();
    }
    
}
class student{
    int m1,m2,m3;
    String name;
    student(String name ,int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    float calcAVG(){
        float avg = (m1+m2+m3)/3;
        return avg;
    }
    String getName() {
        return name;
    }
    void displayResult() {
        if (calcAVG() >= 50) {
            System.out.println("The student "+ name + " has PASSED the exam.");
        } else {
            System.out.println("The student"+ name +"has FAILED the exam.");
        }
    }
}
