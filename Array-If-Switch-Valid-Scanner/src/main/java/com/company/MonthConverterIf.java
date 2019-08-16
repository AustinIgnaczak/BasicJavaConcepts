package com.company;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 12");
        String userInput = myScanner.nextLine();
        int userInt = Integer.parseInt((userInput));
        //checking to see if their number is valid
        if (userInt < 1 || userInt > 12) {
            System.out.println("You have entered an invalid number." +
                    " You must enter a number between 1 and 12. Goodbye.");
            //else if for each case that is valid
        } else if (userInt == 1) {
            System.out.println("You picked January.");
        } else if (userInt == 2) {
            System.out.println("You picked February.");
        } else if (userInt == 3) {
            System.out.println("You picked March.");
        } else if (userInt == 4) {
            System.out.println("You picked April.");
        } else if (userInt == 5) {
            System.out.println("You picked May.");
        } else if (userInt == 6) {
            System.out.println("You picked June.");
        } else if (userInt == 7) {
            System.out.println("You picked July.");
        } else if (userInt == 8) {
            System.out.println("You picked August.");
        } else if (userInt == 9) {
            System.out.println("You picked September.");
        } else if (userInt == 10) {
            System.out.println("You picked October");
        } else if (userInt == 11) {
            System.out.println("You picked November.");
        } else if (userInt == 12) {
            System.out.println("You picked December");


        }

    }
}
