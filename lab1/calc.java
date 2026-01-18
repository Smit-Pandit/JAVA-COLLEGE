package lab1;

import java.util.Scanner;

public class calc{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int product = num1*num2;
        int diff = num1-num2;
        int quo = num1%num2;
        System.out.printf("sum:%d \ndifference:%d \nproduct:%d \nquotient:%d",sum,diff,product,quo);
        sc.close();
    }
}