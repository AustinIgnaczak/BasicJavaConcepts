package com.company;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10");
    String userInput;
    int userInt;
    do{
        System.out.println("You must enter a number between 1 and 10, please try again.");
        userInput = myScanner.nextLine();
        //could user myScanner.nextInt() to save this step, but I wanted to practice both ways
        userInt = Integer.parseInt((userInput));
    //logic step to check if the number is valid
    }while(userInt < 1 || userInt > 10);
        System.out.println(userInt);





    }
}
