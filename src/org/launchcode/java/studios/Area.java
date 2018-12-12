package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        double area;
        double PI = 3.14;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter a radius:");
            radius = in.nextDouble();
            if (radius < 0) {
                System.out.println("oops! you must choose a non-negative radius");
            } else {
                area = PI * radius * radius;
                System.out.println("The area of a circle of radius " + radius + " is " + area);
            }
        } while (radius < 0);
    }
}
