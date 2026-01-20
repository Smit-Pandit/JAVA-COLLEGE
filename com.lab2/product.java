package com.lab2;

import java.util.Scanner;

public class product {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a part number : ");
        int no = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the part description : ");
        String desc = sc.nextLine();

        System.out.println("Enter quantity of the item being purchased : ");
        int quantity = sc.nextInt();

        System.out.println("Enter price per item : ");
        double price = sc.nextDouble();

        invoice x = new invoice(no, quantity, desc, price);
        System.out.println("The final price is : " + x.getInvoiceAmount(quantity, price));
        sc.close();
    }
}

final class invoice {

    int no, quantity;
    String desc;
    double price;

    invoice(int no, int quantity, String desc, double price) {
        this.no = no;
        setQuantity(quantity);
        setPrice(price);
        this.desc = desc;
    }

    public int getNo() {
        return no;
    }

    public String getDesc() {
        return desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    double getInvoiceAmount(int quantity, double price) {
        return quantity * price;
    }
}
