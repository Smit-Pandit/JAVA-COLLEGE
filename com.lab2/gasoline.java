package lab2;
import java.util.Scanner;
// a)total miles driven per day
// b)cost per gallon of gasoline
// c)average fees per day
// d)tolls per day 
public class gasoline{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total miles driven per day : ");
        int a = sc.nextInt();
        System.out.println("Cost per gallon of gasoline : ");
        int b = sc.nextInt();
        System.out.println("Average fees per day : ");
        int c = sc.nextInt();
        System.out.println("Tolls per day  : ");
        int d = sc.nextInt();
        full f = new full(a,b,c,d);

        int full_cost = f.fullcost();
        System.out.println("Fuel" + full_cost);
        sc.close();
    }
}
class full{
    int a,b,c,d;

    public full(int a,int b,int c,int d) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    int fullcost(){
        return a*b*c*d;
    }
    
}
