import java.util.Stack;

class P1 extends Thread {
    String result;
    @Override
    public void run() {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");

        String b = stack.pop();
        String a = stack.pop();

        stack.push("(" + a + "*" + b + ")");
        result = stack.pop();

        System.out.println("Thread 1: " + result);
    }
}

class P2 extends Thread {
    String result;
    @Override
    public void run() {
        Stack<String> stack = new Stack<>();

        stack.push("C");
        stack.push("D");

        String d = stack.pop();
        String c = stack.pop();

        stack.push("(" + c + "/" + d + ")");
        result = stack.pop();

        System.out.println("Thread 2: " + result);
    }
}

public class Main {
    public static void main(String[] args) {

        P1 t1 = new P1();
        P2 t2 = new P2();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String finale = "(" + t1.result + "+" + t2.result + ")";

        System.out.println("Final Infix Expression: " + finale);
    }
}