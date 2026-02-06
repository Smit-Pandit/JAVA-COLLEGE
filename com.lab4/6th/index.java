
import java.util.Scanner;

// Q.6)Declare an interface called Function that has a method named evaluate that takes an int parameter and
// returns an int value.Create a class Half that implements Function. Make the implementation of the method
// evaluate() return the value obtained by dividing the int argument by 2.In a client, create a method that takes an
// arbitrary array of int values as parameter and returns an array that has the same length, but the value of an
// element in the new array is half that of the value in the corresponding element in the array passed as parameter.
// Let the implementation of this method create an instance of Half and use this instance to calculate the values in
// the array to be returned.

public class index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of values you want to enter: ");
        int x = s.nextInt();
        int []arr = new int[x];
        for(int i=0;i<x;i++){
            System.out.print(i+": ");
            arr[i] = s.nextInt();
        }
        client nx = new client(arr);
        nx.calc();
        s.close();
    }
}
interface Function {
    public int evaluate(int x);
}

class Half implements Function {
    @Override
    public int evaluate(int x) {
        return x / 2;
    }
}
class client{
    int []arr;
    Half m = new Half();
    client(int []arr) {
        this.arr = arr;
    }
    void calc(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(m.evaluate(arr[i])+" ");
        }
    }
}
