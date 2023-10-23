package com.xpanxion.assignments.student;

import com.xpanxion.assignments.shared.PersonRepository;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class JavaTwo {
    private static Scanner sc;
    public JavaTwo(){

    }
    public void ex1(){
        sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        while (true){
            System.out.print("Enter Person: ");
            String input = sc.nextLine().trim();
            if(input.equalsIgnoreCase("done")){
                break;
            }
            String[] name = input.split(" ");
            personList.add(new Person(Integer.parseInt(String.valueOf(name[0].charAt(0))), name[1], name[2]));
        }
        for(int i = 0; i < personList.size(); i++){
            System.out.println(personList.get(i).toString());
        }
    }
    public void ex2(){
        sc = new Scanner(System.in);

        while (true){
            sc = new Scanner(System.in);
            System.out.print("Enter Person ID: ");
            String id = sc.nextLine();
            if(id.equalsIgnoreCase("done")){
                break;
            }
            try {
                PersonRepository personRepository = new PersonRepository();

                Person person = personRepository.getPerson(Integer.parseInt(id));
                System.out.println(person.toString());
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("There are no employees with this id");
            }
        }
    }
    public void ex3(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
    public void ex4(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
    public void ex5(){
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }
    public void ex6(){
        sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int res = 0;
        while (true){
            System.out.print("Enter First Number: ");
            String one = sc.nextLine();
            if(one.equalsIgnoreCase("done")){
                break;
            }
            System.out.print("Enter Second Number: ");
            int two = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter operation (add, sub, mul, div): ");
            String operation = sc.nextLine();
            res = calculator.Calculate(Integer.parseInt(one), two, operation);
            System.out.printf("Result : %d", res);
            System.out.println();
        }
        calculator.print();
    }
    public void ex7(){
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );
        List<Person> newPersonList = new ArrayList<>();
        // TODO: YOUR CODE HERE...
       for (Person p : personList){
           p.setLastName("xxx");
           newPersonList.add(p);
       }
        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }


}
