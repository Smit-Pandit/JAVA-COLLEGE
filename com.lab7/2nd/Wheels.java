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