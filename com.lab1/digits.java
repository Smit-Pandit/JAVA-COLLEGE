package com.lab1;
// Write an application that inputs one number consisting of five digits from the user, separate the number into
// its individual digits and print the digit separates from one another for three spaces each. for example if the user

import java.util.Scanner;

// type the number 42335 the program should print ( 4 2 3 3 5)
public class digits{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        System.out.println("Enter your number :");
        int a = s.nextInt();
        if(a>=10000 && a<=99999){
            for ( i = 0; i < 5; i++) {
                arr[i] = a%10;
                a = a/10;
            }
            i=0;
            System.out.printf("{");
            while (i<4) { 
                 System.out.printf("%d,",arr[4-i]);
                 i++;
            }
             System.out.printf("%d}",arr[0]);
        }else{
            System.out.println("The number is not 5 digit");
        }
    }
}