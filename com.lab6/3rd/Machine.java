
import java.util.Scanner;
// Create a washing machine class with methods as switchOn, acceptClothes, acceptDetergent, switchOff.
// acceptClothes accepts the noofClothes as argument & returns the no of Clothes.

public class Machine {

    public static void main(String[] args) {
        int n = 0;
        Scanner s = new Scanner(System.in);
        washingMachine M = new washingMachine();
        boolean start = true, d = false;
        while (start) {
            System.out.print("Enter your Option\n1-Start\n2-Put Clothes\n3-Put Detergent\n4-Turn OFF\n");
            int x = s.nextInt();
            switch (x) {
                case 1 -> {
                    d = M.switchOn();
                }
                case 2 -> {
                    if (d) {
                        System.out.print("Enter the number of clothes : ");
                        n = s.nextInt();
                        M.acceptClothes(n);
                    } else {
                        System.out.println("Turn it on first");
                    }
                }
                case 3 -> {
                    M.acceptDetergent();
                }
                case 4 -> {
                    System.out.println("Giving back " + n + " clothes");
                    M.switchOff();
                    start = false;
                }
            }
        }
        s.close();
    }
}

class washingMachine {

    boolean On = false;

    boolean switchOn() {
        System.out.println("Machine is Turned on");
        On = true;
        return true;
    }

    void acceptClothes(int n) {
        System.out.println("Machine is accepting " + n + " clothes");
    }

    void acceptDetergent() {
        if (On) {
            System.out.println("Machine is accepting detergent");
        } else {
            System.out.println("Turn it on first");
        }
    }

    void switchOff() {
        System.out.println("Machine is turned off...");
        On = false;
    }
}
