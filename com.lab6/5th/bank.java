import java.util.Scanner;
//Create a Bank class with methods deposit & withdraw. 
//The deposit method would accept attributes amount
//& balance & returns the new balance which is the sum of amount & balance. 
//Similarly, the withdraw method would accept the attributes amount & balance 
//& returns the new balance ‘balance – amount’ 
//if balance > = amount or return 0 otherwise.
public class bank {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter your balance : ");
            long bal = s.nextLong();
            long amt = 0;
            BankMethod B = new BankMethod(bal, amt);
            boolean play=true;
            while(play){
                System.out.print("Enter your option\n1 - Deposit\n2 - Withdrawl\n3 - show info\n0 - Exit\n");
                int choice = s.nextInt();
                switch(choice){
                    case 0 -> {
                        B.display();
                        play = false;
                    }
                    case 1 -> {
                        System.out.print("Enter Amount to deposite: ");
                        amt = s.nextLong();
                        B.setAmount(amt);
                        System.out.println("The balance after depositing is : " + B.deposit());
                    }
                    case 2 -> {
                        System.out.print("Enter Amount to Withdraw: ");
                        amt = s.nextLong();
                        B.setAmountW(amt);
                        System.out.println("The balance after Withdrawl is : " + B.withdraw());
                    }
                    case 3 -> B.display();
                    default-> {
                        System.out.println("Invalid");
                    }
                }
            }
            s.close();
        }
    }
}

class BankMethod {
    long balance, amount;
    BankMethod(long bal, long amt) {
        setBal(bal);
        setAmount(amt);
    }
    final void setBal(long bal) {
        if (bal < 0) {
            System.out.println("INVALID");
            balance = 0;
        } else {
            balance = bal;
        }
    }
    final void setAmount(long amt) {
        if (amt < 0 ) {
            System.out.println("INVALID");
            amount = 0;
        } else {
            amount = amt;
        }
    }
    final void setAmountW(long amt){
        if (amt < 0 || amt > balance) {
            System.out.println("INVALID");
            amount = 0;
        } else {
            amount = amt;
        }
    }
    long deposit() {
        balance = balance + amount;
        return balance;
    }

    long withdraw() {
        balance = balance - amount;
        return balance;
    }
    void display(){
        System.out.println("Your Remaining balance is : " + balance);
    }
}
