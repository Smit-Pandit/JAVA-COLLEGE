// Write a program to use ‘extends’ keyword to create student 
// class by reusing Teacher class code.
// We should write only additional members in student
// class which are not available in Teacher class. 
public class College {
    public static void main(String[] args) {
        student s = new student(61);
        s.talk();
        teacher t = new teacher();
        t.enter();
        t.teach();
        s.talk();
        t.rollCall();
        s.rollCall();
        t.leave();
        s.leave();
    }
}
