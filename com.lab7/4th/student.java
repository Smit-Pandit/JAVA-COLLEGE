// Write a program to use ‘extends’ keyword to create student 
// class by reusing Teacher class code.
// We should write only additional members in student
// class which are not available in Teacher class. 
class student extends teacher {
    int rollNO;
    student(int r) {
        this.rollNO = r;
    }
    @Override
    void rollCall(){
        System.out.println(rollNO + "present maam");
    }
    void talk(){
        System.out.println("Talks with friends....");
    }

}
