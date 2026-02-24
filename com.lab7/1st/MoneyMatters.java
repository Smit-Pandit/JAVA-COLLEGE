import java.util.Scanner;
// Develop  a  program  that  accepts  an  initial  amount  of  money  (called  the  principal),  a  simple  annual  interest 
// rate,  and  a  number  of  months  will  compute  the  balance  at  the  end  of  that  time.  Assume  that  no  additional 
// deposits  or  withdrawals  are  made  and  that  a  month  is  1/12  of  a  year.  Total  interest  is  the  product  of  the 
// principal, the annual interest rate expressed as a decimal, and the number of years.
public class MoneyMatters{
    public static void main(String[] args) throws Exception {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter principal amount : ");
            int principal = s.nextInt();
            System.out.println("Enter simple annual interest rate : ");
            float interest = s.nextFloat();
            System.out.println("Enter number of months : ");
            int time = s.nextInt()/12;
            float i = interest;
            bank b = new bank();
            if(time<0 || principal < 0 || interest < 0 ) throw new Exception("User entered a negative value");
            System.out.println("The total Amount of Interest Accumulated is : " + b.calcInterest(principal,i,time));
        }
    }
}
class bank{
    float calcInterest(int p,float r,int t) {
        float SI = p*r*t/100;
        return SI;
    }
}