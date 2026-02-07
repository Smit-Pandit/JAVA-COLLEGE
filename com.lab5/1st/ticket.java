import java.util.Arrays;
import java.util.Scanner;
// Image a queue of people standing at the bus stand to buy tickets .whenever a person buys a ticket,he leaves
// the queue and all the remaining people take one step forward.any new person joins the queue at the
// back.implement the above queue for integer in the following mannerdefine an interface named QueueImpl that
// will have method to insert into the queue ,delete from the queue and display the integer currently present int the
// queue.let a class calleld QueueDemo implement the interface .Make your own provisions for exception handaling
// in case of overflow and underflow condation use an array (with maximum size 10) to hiuse the queue. Write a
// single main program to demonstrate the insert , delete and display operations as well as the Exception handaling
// in case of overflow and underflow condation

public class ticket {

    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            final int size = 10;
            char[] queue = new char[size];
            boolean val = true;
            Arrays.fill(queue, 'N');
            QueueDemo x = new QueueDemo(queue);
            System.out.println("Menu\n1 : Insert\n2 : Delete\n3 : Display\n0 : Exit");
            while (val) {
                System.out.println("Enter the option : ");
                int m = s.nextInt();
                switch (m) {
                    case 0 -> {
                        x.display();
                        System.out.println("Exiting...");
                        val = false;
                    }
                    case 1 ->
                        x.insert();
                    case 2 ->
                        x.delete();
                    case 3 ->
                        x.display();
                    default ->
                        throw new AssertionError();
                }
            }
        } catch (IndexOutOfBoundsException x) {
            System.out.println("Index out of range");
        }
    }
}

interface QueueImpl {

    public void insert() throws Exception;

    public void delete() throws Exception;

    public void display();
}

class QueueDemo implements QueueImpl {

    char[] queue;
    static int i = 0;

    QueueDemo(char... queue) {
        this.queue = queue;
    }

    @Override
    public void insert() throws Exception {
        if (i == 10) {
            throw new Exception("Queue Overflow horaha hai");
        }
        queue[i++] = 'P';
    }

    @Override
    public void delete() throws Exception {
        if (i == 0) {
            throw new Exception("Queue Underflow horaha hai");
        }
        queue[--i] = 'N';
    }

    ;
    @Override
    public void display() {
        if (i == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int j = 0; j < queue.length; j++) {
            System.out.print(queue[j] + " ");
        }
        System.out.println();
    }
}
