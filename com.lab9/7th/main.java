import java.util.Random;

class father implements Runnable {

    static int balance = 600;
    Random random = new Random();

    @Override
    public void run() {
        synchronized (father.class) {
            while (balance < 2000) {
                int deposit = random.nextInt(200) + 1;
                balance += deposit;
                System.out.println("Father deposits : " + deposit + " | Balance : " + balance);
            }
            father.class.notify();
        }
    }
}

class son implements Runnable {

    Random random = new Random();

    @Override
    public void run() {
        synchronized (father.class) {

            while (father.balance <= 2000) {
                try {
                    father.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            while (father.balance > 500) {
                int withdraw = random.nextInt(150) + 1;
                father.balance -= withdraw;
                System.out.println("Son withdraws : " + withdraw + " | Balance : " + father.balance);
            }
            father.class.notify();
        }
    }
}

public class main {
    public static void main(String[] args) {

        Thread tf = new Thread(new father());
        Thread ts = new Thread(new son());

        tf.start();
        ts.start();
    }
}
