package lab2;
import java.util.Scanner;
public class invoice {
    public static void main(String[] args) {
        String x, y;
        int q;
        double p;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter part number, part description, quantity and price per item:");
        x = s.nextLine();
        y = s.nextLine();
        q = s.nextInt();
        p = s.nextDouble();
        random l = new random(x, y, q, p);
        System.out.println("Part Number: " + l.getpno());
        System.out.println("Description: " + l.getpdec());
        System.out.println("Quantity: " + l.getq());
        System.out.println("Price per Item: " + l.getprice());
        System.out.println("Invoice Amount: " + l.getamt());
    }
}

class random {
    String pno;
    String pdesc;
    int q;
    double price;

    public random(String pno, String pdesc, int q, double price) {
        this.pno = pno;
        this.pdesc = pdesc;
        this.q = q;
        this.price = price;
    }

    public void setPricePerItem(double price) {
        if (price > 0.0)
            this.price = price;
        else
            this.price = 0.0;
    }

    public String getpno() {
        return pno;
    }

    public String getpdec() {
        return pdesc;
    }

    public int getq() {
        return q;
    }

    public double getprice() {
        return price;
    }

    public double getamt() {
        return q * price;
    }
}
