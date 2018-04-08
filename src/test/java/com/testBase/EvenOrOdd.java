package com.testBase;

public class EvenOrOdd {

    public static void main(String[] args) {
     EvenOrOdd orOdd=new EvenOrOdd();
     orOdd.even(7);

    }

    public String even(int number){
        if(number % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
        return (number % 2 == 0) ? "Even": "Odd";
    }
}
