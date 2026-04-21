
import java.util.Scanner;

class sin extends Thread {

    double radians;
    int terms;

    sin(double radians, int terms) {
        radians = this.radians;
        terms = this.terms;
    }

    @Override
    public void run() {
        double sum = 0;
        double num, den;

        for (int i = 0; i < terms; i++) {
            num = Math.pow(radians, 2 * i + 1);
            den = factorial(2 * i + 1);
            if (i % 2 == 0) {
                sum += num / den; 
            }else {
                sum -= num / den;
            }
        }

        System.out.println("Sin(x) using series = " + sum);
    }

    double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}

class cos extends Thread {

    double x;
    int terms;

    cos(double x, int terms) {
        this.x = x;
        this.terms = terms;
    }

    @Override
    public void run() {
        double sum = 0;
        double num, den;

        for (int i = 0; i < terms; i++) {
            num = Math.pow(x, 2 * i);
            den = factorial(2 * i);

            if (i % 2 == 0) {
                sum += num / den; 
            }else {
                sum -= num / den;
            }
        }

        System.out.println("Cos(x) using series = " + sum);
    }

    double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class Maths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radians = ");
        double radians = scanner.nextDouble();

        System.out.println("Enter the terms = ");
        int terms = scanner.nextInt();

        sin ts = new sin(radians, terms);
        cos tc = new cos(radians, terms);

        ts.start();
        tc.start();

        System.out.println("Sin(x) using Math class = " + Math.sin(radians));
        System.out.println("Cos(x) using Math class = " + Math.cos(radians));
    }
}
