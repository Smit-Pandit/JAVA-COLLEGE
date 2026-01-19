package com.lab2;

import java.util.Scanner;
// (Gas mileage ) Drivers are concerned with the mileage theit automobiles get. One driver has kept track of // several trips by recording the miles driven and gallons used for each tankful.Develop a java application that will input the miles driven and gallons used(both as in) for each trip.The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point. All averaging calculate should produce floating point results. Use class scanner and sentinel-controlled repetition to obtain the data from the user.
public class gas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tmiles = 0;
        double fule = 0;
        double miles = 0;
        while (miles != -1) {
            System.out.println("Enter miles driven (-1 to stop): ");
            miles = sc.nextDouble();
            System.out.println("Enter gallons : ");
            double gallons = sc.nextDouble();
            gasmileage g = new gasmileage(miles, gallons);
            System.out.println("Miles per gallon for this trip: " + g.mpg());
            tmiles += miles;
            fule += gallons;
        }
        System.out.println("Combined miles per gallon: " + (tmiles/fule));
        sc.close();
    }
}

class gasmileage {
    double miles, gallons;
    gasmileage(double miles, double gallons) {
        this.miles = miles;
        this.gallons = gallons;
    }
    double mpg() {
        return miles / gallons;
    }
}
