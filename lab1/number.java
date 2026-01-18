package lab1;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number ek:");
        int num1 = sc.nextInt();
        System.out.println("number do:");
        int num2 = sc.nextInt();
        System.out.println("number teen:");
        int num3 = sc.nextInt();    
        int sum = num1+num2+num3;
        int avg = sum/3;
        int product = num1*num2*num3; 
        System.out.println("Product is : " + product + "\nSum is : " + sum + "\nAverage is : " + avg);
        if (num1>num2 && num1>num3) {
            System.out.println("Largest is number 1 " + num1);
        } else if(num2>num1 && num2>num3){
            System.out.println("Largest is number 2 " + num2);
        }else{
            System.out.println("Largest is number 3 " + num3);
        }
        sc.close();
    }
}
