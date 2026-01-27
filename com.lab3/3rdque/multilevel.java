// package com.lab3;
import java.util.Scanner;

// Q3.) Design a class named 'x' having two attributes i and j of the type int. Let it have a constructor that takes in
// two argument of type int and assign them to i and j.Let it also have a method name final sum that compute the
// sum of i and j that return it.Let a class 'y' extend class x,lets it have its own constructer and method name find
// product that compute and return i*j. lets a class Z extend a class Y.Design a class name multilevel inheritance
// demo it must have the main method in which the object of class Z is constructed and all the methods(its own and
// the inherited one ) are invokeand the sum difference and the product are display.
public class multilevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i:");
        int i = sc.nextInt();
        System.out.println("Enter j:");
        int j = sc.nextInt();
        Z l = new Z(i,j);
        System.out.println("DIFF IS : " + l.finalDiff(i, j) + "\nSUM IS " + l.finalSum(i, j) + "\nPRODUCT IS " + l.finalProduct(i, j));
        sc.close();
    }
}
class X{
    int i,j;
    public X(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public final int finalSum(int i,int j){
        return i+j;
    }
}
class Y extends X{
    public Y(int i, int j) {
        super(i, j);
        this.i = i;
        this.j = j;
    }
    public final int finalProduct(int i,int j){
        return i*j;
    }
}
class Z extends Y{
    public Z(int i, int j) {
        super(i, j);
        this.i = i;
        this.j = j;
    }
    public final int finalDiff(int i,int j){
        return i-j;
    }
}