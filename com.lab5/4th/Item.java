import java.util.Scanner;
// 1. Name of the fruit.
// 2. Single fruit or bunch fruit.
// 3. Price.
// Define a suitable constructor and displayFruit() method that displays values of all the
// attributes. Write a program that creates 2 objects of fruit class and display their attributes.
public class Item {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter details of 1st Fruit : ");
        System.out.print("Name : ");
        String name1 = s.nextLine();
        System.out.print("Price : ");
        int price1 = s.nextInt();
        System.out.print("Number of Fruits : ");
        int n1 = s.nextInt();
        s.nextLine();
        System.out.print("Enter details of 2nd Fruit : \n");
        System.out.print("Name : ");
        String name2 = s.nextLine();
        System.out.print("Price : ");
        int price2 = s.nextInt();
        System.out.print("Number of Fruits : ");
        int n2 = s.nextInt();
        fruit obj1 = new fruit(name1, n1, price1);
        fruit obj2 = new fruit(name2, n2, price2);
        //array of fruits
        fruit []fruits = {obj1,obj2};
        for (fruit f : fruits) {
            f.displayFruit();
        }
        s.close();
    }
}
class fruit{
    String name;
    int n,price;
    fruit(String name, int n, int price) {
        this.name = name;
        this.n = n;
        this.price = price;
    }
    void displayFruit(){
        System.out.println("Fruit name : " + name);
        System.out.println("Number of Fruits : " + n);
        System.out.println("Price of one fruit is : " + price);
        System.out.println("Total Price : " + n*price);
    }
}