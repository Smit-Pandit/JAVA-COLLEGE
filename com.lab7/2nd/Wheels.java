
import java.util.Scanner;

// Write a class vehicle .Define suitable attributes and methods. 
// Write subclasses of Vehicle like Car, Bicycle,  Scooter.  
// Assume suitable required attributes. 
// Write constructor for each and define a method maxSpeed() in each  class  
// Which prints the maximum speed of the vehicle? 
// (Use of super keyword is expected in the constructor of  inherited classes). 
public class Wheels{
    public static void main(String[] args) throws Exception {
        try(Scanner s = new Scanner(System.in);){
            System.out.println("Enter the type of car");
            String type = s.nextLine().toLowerCase();
            car c = new car(type);
            c.start();
            c.stop();
            c.maxSpeed();

            System.out.println("Enter the cc of bike");
            int cc = s.nextInt();
            bike b = new bike(cc);
            b.start();
            b.stop();
            b.maxSpeed();

            System.out.println("For scotter");
            scotter st = new scotter();
            st.start();
            s.close();
        }
    }
}
class vehicle{
    public void maxSpeed(){
        System.out.println("Maximum speed of vehicle is 0 km/h");
    }
    public void start(){
        System.out.println("Starting the vehicle...");
        System.out.println("brrr..... brrr.....");
    }
    public void stop(){
        System.out.println("Turning the engine off!!");
    }
}
class car extends vehicle{
    String type;
    int speed = 0;

    car(String type) throws Exception {
        this.type = type;
        switch (type) {
            case "sedan" -> speed = 140;
            case "xuv" -> speed = 200;
            case "super" -> speed = 300;
            case "hyper" -> speed = 500;
            default -> throw new Exception("Not a valid type of car");
        }
    }
    @Override
    public void maxSpeed() {
        System.out.println("Maximum speed of " + type + " : "+ speed + "km/h");
    }
}
class bike extends vehicle{
    int cc,speed=0;
    bike(int cc) throws Exception{
        this.cc = cc;
        switch(cc){
            case 50 -> speed = 70;
            case 125 -> speed = 100;
            case 250 -> speed = 150;
            case 300 -> speed = 200;
            case 700 -> speed = 280;
            case 1000 -> speed = 300;
            case 1100 -> speed = 306;
            default -> throw new Exception("Not a valid cc for bike");
        }
    }
    @Override
    public void maxSpeed() {
        System.out.println("Maximum speed of bike with" + cc + "cc is "+ speed + "km/h");
    }
}
class scotter extends vehicle{
    scotter() throws Exception{
        throw new Exception("Wrong vehicle");
    }
}