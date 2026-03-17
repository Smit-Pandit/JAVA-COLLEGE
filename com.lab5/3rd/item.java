
import java.util.Scanner;
// Create ElectricalProduct having the following additional attributes: VoltageRange and Wattage. 
// Add a behavior to change the Wattage and price of the electrical product.
// Display the updated ElectricalProduct details.

public class item {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter Product ID : ");
            int PID = s.nextInt();
            System.out.print("Enter Category ID : ");
            int CID = s.nextInt();
            System.out.print("Enter Unit Price : ");
            int UP = s.nextInt();
            System.out.print("Enter Voltage Range : ");
            int VR = s.nextInt();
            System.out.print("Enter Wattage : ");
            int W = s.nextInt();
            ElectricalProduct EP = new ElectricalProduct(PID, CID, UP, VR, W);
            System.out.println("");
            EP.Display();
            System.out.println("Enter Unit Price (new) : ");
            int x = s.nextInt();
            EP.setUnitPrice(x);
            System.out.println("Enter Wattage (new) : ");
            int y = s.nextInt();
            EP.setWattage(y);
            System.out.println("\nUpdated Details\n");
            EP.Display();
            s.close();
        }
    }
}

class Product {

    int ProductID, CategoryID, UnitPrice;

    Product(int PID, int CID, int UP) {
        this.ProductID = PID;
        this.CategoryID = CID;
        this.UnitPrice = UP;
    }

    public void Display() {
        System.out.println("Product ID : " + ProductID);
        System.out.println("Category ID : " + CategoryID);
        System.out.println("Unit Price : " + UnitPrice);
    }
}

class ElectricalProduct extends Product {

    int VoltageRange, Wattage;

    ElectricalProduct(int PID, int CID, int UP, int VR, int W) {
        super(PID, CID, UP);
        this.VoltageRange = VR;
        this.Wattage = W;
    }

    void setUnitPrice(int x) {
        UnitPrice = x;
    }

    void setWattage(int y) {
        Wattage = y;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Voltage Range : " + VoltageRange);
        System.out.println("Wattage : " + Wattage);

    }
}
