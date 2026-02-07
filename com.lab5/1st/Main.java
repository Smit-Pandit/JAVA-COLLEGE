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
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int size = 10;
        char[] queue = new char[size];

        Arrays.fill(queue, 'N');
        QueueDemo x = new QueueDemo(queue);
        while (true) { 
            System.out.println("Enter Your Option\n1 : Insert\n2 : Delete\n3 : Display");
            int x = s.nextInt();
            switch () {
                case :
                    
                    break;
                default:
                    throw new AssertionError();
            }  
        }
        x.insert();
        x.display();
        x.delete();
        x.display();
    }
}

interface QueueImpl{
    public void insert();
    public void delete();
    public void display();
}
class QueueDemo implements QueueImpl{
    char []queue;
    static int i=0;
    QueueDemo(char... queue){
        this.queue = queue;
    }
    @Override
    public void insert(){
        queue[i++] = 'P';
    }
    @Override
    public void delete(){
        queue[--i] = 'N'; 
    };
    @Override
    public void display(){
        System.out.println(Arrays.toString(queue));
        System.out.println("Number of people in Queue is : " + i);
    }
}