
import java.util.Scanner;
//Create a class to model a point in 3D space.
// Data members x,y,z as coordinate of 3D point are of type int.
//Constructors: To create 3D point represented the origin arbitrary point. 
//Methods:
//i/p the coordinates of 3D point.
//o/p the coordinate of 3D point in the form(x,y,z).
//Compute distance between two points.

public class distance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        point3D P1 = new point3D(); // origin
        System.out.println("Enter (x,y,z) : ");
        System.out.print("x :");
        int x = s.nextInt();
        System.out.print("y :");
        int y = s.nextInt();
        System.out.print("z :");
        int z = s.nextInt();
        point3D P2 = new point3D(x,y,z);
        System.out.println("The point 1 is : ");
        P1.display();
        System.out.println("The point 2 is : ");
        P2.display();
        System.out.println("The distance from origin is : " + P2.distance(P1));
        s.close();
    }
}

class point3D {

    int x, y, z;

    point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    point3D(int x2, int y2, int z2) {
        this.x = x2;
        this.y = y2;
        this.z = z2;
    }
    double distance(point3D p) {
        int dx = x - p.x;
        int dy = y - p.y;
        int dz = z - p.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}
