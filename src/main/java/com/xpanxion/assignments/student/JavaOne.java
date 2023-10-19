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
            /*
        1. prompt use for a sentence with proper formmting
        2. store the sentence in a string variable
        3. create an int variable and initialize it to zero
        4. loop thru the string and look for the upper case char
        5. increment the variable when a upper cae is found
         */
        sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = sc.nextLine();
        int count = 0;
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        System.out.printf("Number of uppercase letters: %d", count);
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
