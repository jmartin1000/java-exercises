package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {
        String aName;
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        aName = in.next();
        System.out.println("Hello, " + aName);
    }
}
