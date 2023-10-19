package com.xpanxion.assignments.student;

import java.util.Scanner;

public class JavaOne {
    private static Scanner sc;
    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
          /*
        1. collect user name
        2. store user name
        3. print out use name
         */
        System.out.println("Please Enter your name: ");
        sc = new Scanner(System.in);
        String name = sc.next();
        System.out.printf("Your name in upper case is %s", name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
