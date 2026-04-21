
class thread1 implements Runnable {

    public void run() {
        int a = 1, b = 1;

        System.out.println("Fibonacci Numbers:");

        System.out.println(a);
        System.out.println(b);

        for (int i = 3; i <= 50; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Fibonacci thread resumed:");
        for (int i = 51; i <= 60; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}

class thread2 implements Runnable {

    @Override
    public void run() {

        int count = 0;
        int num = 2;

        System.out.println("Prime Numbers:");

        while (count < 25) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
                count++;
            }
            num++;
        }

    }
}

public class Main {

    public static void main(String[] args) {
        thread1 t1 = new thread1();
        Thread threads1 = new Thread(t1);

        thread2 t2 = new thread2();
        Thread threads2 = new Thread(t2);

        threads1.setPriority(8);
        threads2.setPriority(5);

        threads1.start();
        threads2.start();
    }
}
