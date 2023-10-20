package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
}
