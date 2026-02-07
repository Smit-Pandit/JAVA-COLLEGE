// package figure2nd;
import java.util.Scanner;

public class Fig {
    public static void main(String[] args) {
        double r,s,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The radius of cone : ");
        r = sc.nextDouble();
        System.out.println("Enter The slant of cone : ");
        s = sc.nextDouble();
        figure f1 = new C(r, s);
        f1.calcA();
        f1.calcVol();
        f1.DispA();
        f1.DispVol();

        System.out.println("Enter The radius of sphere : ");
        r = sc.nextDouble();

        figure f2 = new Sphere(r);
        f2.calcA();
        f2.calcVol();
        f2.DispA();
        f2.DispVol();


        System.out.println("Enter The radius of cylinder : ");
        r = sc.nextDouble();
        System.out.println("Enter The slant of cylinder : ");
        h = sc.nextDouble();
        figure f3 = new Cylinder(r, h);
        f3.calcA();
        f3.calcVol();
        f3.DispA();
        f3.DispVol();
        sc.close();
    }
}

// Abstract class
abstract class figure {
    protected final double pi = 3.1420;
    protected double a; // area
    protected double v; // volume

    public abstract void calcA();
    public abstract void calcVol();
    public abstract void DispA();
    public abstract void DispVol();
}
//cone
class C extends figure {

    double r, s;

    public C(double r, double s) {
        this.r = r;
        this.s = s;
    }

    @Override
    public void calcA() {
        a = pi * r * r + pi * r * s;
    }

    @Override
    public void calcVol() {
        v = (pi * r * r * s) / 3;
    }

    @Override
    public void DispA() {
        System.out.println("Cone Area : " + a);
    }

    @Override
    public void DispVol() {
        System.out.println("Cone Volume : " + v);
    }
}

class Sphere extends figure {

    double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public void calcA() {
        a = 4 * pi * r * r;
    }

    @Override
    public void calcVol() {
        v = (4 * pi * r * r * r) / 3;
    }

    @Override
    public void DispA() {
        System.out.println("Sphere Area : " + a);
    }

    @Override
    public void DispVol() {
        System.out.println("Sphere Volume : " + v);
    }
}

class Cylinder extends figure {

    double r, h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public void calcA() {
        a = 2 * pi * r * (r + h);
    }

    @Override
    public void calcVol() {
        v = pi * r * r * h;
    }

    @Override
    public void DispA() {
        System.out.println("Cylinder Area : " + a);
    }

    @Override
    public void DispVol() {
        System.out.println("Cylinder Volume : " + v);
    }
}
