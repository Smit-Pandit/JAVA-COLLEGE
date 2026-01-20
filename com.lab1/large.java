package com.lab1;

import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("1st number is greater " + num1);
        }else if (num1 < num2) {
            System.out.println("2nd number is greater " + num2);
        }
        else{
            System.out.println("1st and 2nd number is equal");
        }
    sc.close();
    }
}
