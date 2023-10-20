package com.xpanxion.assignments.student;

import com.xpanxion.assignments.Main;

import java.util.Scanner;
public class JavaOne {
    private static Scanner sc;
    //
    // Constructors
    //
    public JavaOne() {
    }
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
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        System.out.printf("Number of uppercase letters: %d", count);
    }
    public void ex3() {
              /*
        1. prompt user for a string
        2. store the string in a variable
        3. create a string array and then store the string using the split method to break up word on the white space
        4. output the string
         */
        sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = sc.nextLine();
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = arr[i].toUpperCase();
        }
        System.out.printf(String.join(" ", arr));
    }
    public void ex4() {
               /*
        1. Prompt user for a string
        2. create helper method to do the following :
        2. store the string in a variable
        3. use two pointers to check if all the characters match in the start and end pointer
        4. return a boolean in the helper method
        4. if they match return yes else no
         */
        sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        if (ispalindrome(word.toLowerCase())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public void ex5() {
               /*
        1. prompt user for a word / string
        2. store the word / string in a variable
        3. create vowel and constant integer variables
        4. then create a helper method to check if a letter is a vowel
        5. then return the count
         */
        System.out.println("Enter a String: ");
        sc = new Scanner(System.in);
        String word = sc.nextLine();
        int vowel = 0, constants = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isvowel(c)) {
                vowel++;
            } else {
                constants++;
            }
        }
        System.out.printf("Number of Vowel %d \nNumber of Constants %d", vowel, constants);
    }
    public void ex6() {
        /*
        1. create a scanner
        2. take the first input store it in a variable
        3. take the second input store it in a variable
        4. print the addition both variables
         */
        sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int one = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int two = sc.nextInt();
        System.out.printf("Result %d", (one + two));
    }
    public void ex7() {
        /*
        1. create a scanner to take the first and second numbers
        2. use the scanner to store the first and second number
        3. clear the scanner and then clear the results ask the user which operation he would like perform
        4. use a switch case to perform the proper operation base on the input string of the user
        5. return the value of the operation they wanted to perform.
         */
        sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int one = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int two = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.nextLine();
        String op = operation;
        int res = 0;
        switch (op) {
            case "sub" -> res = one - two;
            case "add" -> res = one + two;
            case "div" -> res = one / two;
            case "mul" -> res = one * two;
        }
        System.out.printf("Result : %d", res);
    }
    public void ex8() {
        /*
        1. create a scanner to take the price per square foot
        2. create an int variable to store the price
        3. use a while loop to keep the program running while you add the dimensions
        4. check if the string entered is done or width x height
        5. if it is a valid string store the dimensions in a string array by splitting on the x
        6. the perform the calculations to get the proper cost and add it into total cost
         */
        sc = new Scanner(System.in);
        System.out.print("Enter price per square feet: ");
        double price = sc.nextDouble();
        sc.nextLine();
        double total = 0.0;
        while (true) {
            System.out.print("Enter room dimensions (width x height): ");
            String input = sc.nextLine().trim();
            if(input.equalsIgnoreCase("done")){
                break;
            }
            if(input.equals("0")){
                break;
            }
            String[] dimensions = input.split("x");
            if(dimensions.length != 2){
                System.out.println("Invalid values");
                continue;
            }
            try {
                double width = Double.parseDouble(dimensions[0].trim());
                double height = Double.parseDouble(dimensions[1].trim());
                double roomArea = width * height;
                double roomCost = roomArea * price;
                total += roomCost;
            }catch (NumberFormatException e){
                System.out.println("Please Enter valid numbers for width and height");
            }
        }
        System.out.printf("Total cost: $ %.02f", total);
    }
    public void ex9() {
        /*
        1. create a random number from 1 to 5
        2. and store the number in a variable
        3. create a flag boolean
        4. use the flag boolean in a while loop to continue the program while the user
        5. if the user guesses right then the flag gets switched to false
        6. if the guess is wrong the user will continue untill they guess the number
         */
        int randomNumber = (int) (Math.random() * 5) + 1;
        boolean flag = true;

        while(flag){
            System.out.print("Enter a Number: ");
            sc = new Scanner(System.in);
            int guess = sc.nextInt();
            if(guess == randomNumber){
                System.out.println("You Guessed it!!!");
                flag = false;
            }
            else {
                System.out.println("Please Try Again....");
            }
        }
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }
    //
    // Private helper methods
    //
    private boolean ispalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (!Character.isAlphabetic(word.charAt(start))) {
                start++;
            }
            if (!Character.isAlphabetic(word.charAt(end))) {
                end--;
            }
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean isvowel(char c) {
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < vowel.length(); i++) {
            if (vowel.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}
