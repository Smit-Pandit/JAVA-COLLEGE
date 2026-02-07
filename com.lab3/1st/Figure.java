// package figure2nd4th;
import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter slant height: ");
        double s = sc.nextDouble();

        Cone c = new Cone(r, s);

        c.calcArea();
        c.calcVolume();

        c.dispArea();
        c.dispVolume();

        sc.close();
    }
}

class Fig {
    double r, a, v;

    public void dispArea() {
        System.out.println("Area is : " + a);
    }

    public void dispVolume() {
        System.out.println("Volume is : " + v);
    }
}

class Cone extends Fig {
    double s;

    public Cone(double r, double s) {
        this.r = r;
        this.s = s;
    }

    public void calcArea() {
        a = Math.PI * r * r + Math.PI * r * s;
    }

    public void calcVolume() {
        v = (Math.PI * r * r * s) / 3;
    }
}
