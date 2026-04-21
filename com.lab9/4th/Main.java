import java.util.*;

class Player extends Thread{
    int n,r;

    Player(int n){
        this.n=n;
    }
    @Override
    public void run(){
        r=(int)(Math.random()*100)+1;
        System.out.println(getName()+" Number = "+r);
    }
}

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);

        System.out.print("Player 1 Enter: ");
        int a=sc.nextInt();

        System.out.print("Player 2 Enter: ");
        int b=sc.nextInt();

        Player p1=new Player(a);
        Player p2=new Player(b);

        p1.setName("Player 1");
        p2.setName("Player 2");

        p1.start();
        p2.start();

        if(p1.r>p2.r)
            System.out.println("Player 1 Wins Points = "+(p1.r-p2.r));
        else if(p2.r>p1.r)
            System.out.println("Player 2 Wins Points = "+(p2.r-p1.r));
        else
            System.out.println("Draw");
    }
}