package com.company;

import java.util.Scanner;

public class ArrayFunUserArray{
    public static void main(String[] args) {
        //calling scanner for user input
        Scanner myScanner = new Scanner(System.in);
        //setting array
        int[] userArray = new int[5];
        //looping though array
        for (int i = 0; i < 5; i++){
            System.out.println("Please enter your number");
            //setting a value to make checking values easier
            int userInt = myScanner.nextInt();
            //setting values into array
            userArray[i] = userInt;
        }
        //loop to go though new array data
        for(int i = 0; i < 5; i++){
            //printing out user input from array
            System.out.println("You entered: " + userArray[i]);
        }


    }
}
