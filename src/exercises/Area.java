package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner in = new Scanner(System.in);

        System.out.println("length of rectangle:");
        length = in.nextDouble();
        System.out.println("width of rectangle:");
        width = in.nextDouble();
        area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}