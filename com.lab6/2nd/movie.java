import java.util.Scanner;
//Each customer pays $5 per ticket. 
//Every performance costs the theater $20, plus $.50 per attendee.
//Develop the program calculate TotalProfit that
//consumes the number of attendees (of a show)
//and calculates how much income the show earns.
public class movie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number of Attendee's : ");
        int n = s.nextInt();
        theater t = new theater(n);
        System.out.println("The total profit is : " + t.TotalPay());
        s.close();
    }
}
class theater{
    int attendee;
    double TotalPayout,GrossPay;
    theater(int n) {
        this.attendee = n;
    }
    double TotalPay(){
        GrossPay = attendee*5;
        TotalPayout=20 + attendee*0.5;
        return GrossPay - TotalPayout;
    }
}