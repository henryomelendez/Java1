package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> operationsList;
    public Calculator(){
        this.operationsList = new ArrayList<>();
    }
    public Calculator(List<String> operations) {
        this.operationsList = operations;
    }
    public int Calculate(int firstNumber, int secondNumber, String operations){
        int total = 0;
        switch (operations){
            case "add" :
                total = firstNumber + secondNumber;
                this.operationsList.add(firstNumber + " + "+ secondNumber + " = " + total);
                break;
            case "sub" :
                total = firstNumber - secondNumber ;
                this.operationsList.add(firstNumber + " - " + secondNumber + " = " + total);
                break;
            case "mul" :
                total = firstNumber * secondNumber;
                this.operationsList.add(firstNumber + " * " + secondNumber + " = " + total);
                break;
            case "div" :
                total = firstNumber / secondNumber;
                this.operationsList.add(""+ firstNumber + " / " + secondNumber + " = " + total);
                break;
        }
        return total;
    }
   public void print(){
        for(String s : operationsList){
            System.out.println(s);
        }
   }
}
