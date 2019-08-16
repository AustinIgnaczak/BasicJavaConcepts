package com.company;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        //Calling scanner for user input
        Scanner myScanner = new Scanner(System.in);
        //initing new array, as we know how many words we want
        String[] userArray = new String[5];
        //For loop to get user input five times
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter your word.");
            //Catches user input
            String userInt = myScanner.nextLine();
            //Pushes value into array
            userArray[i] = userInt;

        }
        //Loop that goes though the array's length, printing each value.
        for (int i = 0; i <userArray.length; i++){
            System.out.println(userArray[i]+ " ");
        }
    }
}
