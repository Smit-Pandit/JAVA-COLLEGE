// Create an abstract class car contains an instance variable .one concrete method and two abstract
// method.Maruti and santro are subclass implements the abstrat method of super class and methods are avg() and
// mode().Create a class Car1 to use all the features of abstract method by creating a reference to it and referring to
// the subclass object.
public class Car1 {
    public static void main(String[] args) {

        // reference of abstract class, object of Maruti
        car c1 = new Maruti();
        c1.show();
        c1.avg();
        c1.mode();

        System.out.println();

        // reference of abstract class, object of Santro
        car c2 = new Santro();
        c2.show();
        c2.avg();
        c2.mode();
    }
}

abstract class car{
    public void show(){
        System.out.println("Do Something");
    }
    public abstract void avg();
    public abstract void mode();
}
class Maruti extends car{
    @Override
    public void avg(){
        System.out.println("Maruti average is also close to 0");
    }
    @Override
    public void mode(){
        System.out.println("Maruti mode is auto");
    }
}
class Santro extends car{
    @Override
    public void avg(){
        System.out.println("Santro average is close to 1km");
    }
    @Override
    public void mode(){
        System.out.println("Santro mode is manual");
    }
}
