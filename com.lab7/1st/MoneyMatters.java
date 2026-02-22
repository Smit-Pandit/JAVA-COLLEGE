import java.util.Scanner;
// Develop  a  program  that  accepts  an  initial  amount  of  money  (called  the  principal),  a  simple  annual  interest 
// rate,  and  a  number  of  months  will  compute  the  balance  at  the  end  of  that  time.  Assume  that  no  additional 
// deposits  or  withdrawals  are  made  and  that  a  month  is  1/12  of  a  year.  Total  interest  is  the  product  of  the 
// principal, the annual interest rate expressed as a decimal, and the number of years.
public class MoneyMatters{
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter principal amount : ");
            int principal = s.nextInt();
            System.out.println("Enter simple annual interest rate : ");
            int interest = s.nextInt();
            System.out.println("Enter number of months : ");
            int time = s.nextInt();
            int i = interest/12;
            bank b = new bank();
            System.out.println("The total Amount of Interest Accumulated is : " + b.calcInterest(principal,i,time));
        }
    }
}
class bank{
    int calcInterest(int p,int r,int t){
        int SI = p*r*t/100;
        return SI;
    }
}