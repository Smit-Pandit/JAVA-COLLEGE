
import java.util.InputMismatchException;
import java.util.Scanner;
// Utopias tax accountants always use programs that compute income taxes even though the tax rate is a solid,
// never- changing 15%.Define the program calculate Tax which determines the tax on the gross pay. Define
// calculate NetPay that determines the net pay of an employee from the number of hours worked. Assume an
// hourly rate of $12.

public class tax {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            System.out.print("Working hours : ");
            int H = s.nextInt();
            UtopiasTax pay = new UtopiasTax(H);
            System.out.println("The Net Payment is : " + pay.netPay() + "$");
            s.close();
        }catch(InputMismatchException e){
            System.out.println("Enter a valid Number");
        }
    }
}

class UtopiasTax {

    int hours;
    final double HourlyRate = 12;

    UtopiasTax(int H) {
        this.hours = H;
    }

    double netPay() {
        return calculateGrossPay() - calculateTax();
    }

    double calculateTax() {
        return calculateGrossPay() * 0.15;
    }

    double calculateGrossPay() {
        return HourlyRate * hours;
    }
}
