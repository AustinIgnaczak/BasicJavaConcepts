package com.company;
import com.company.Interfaces.Converter;

import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {
        //Asking for user input to see which month they want
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int userInt;
        //Instantiating the two objects so their methods can be called
        Converter monthIf = new ConverterIf();
        Converter monthSwitch = new ConverterSwitch();

        System.out.println("Please enter your month's number");
        userInput = scanner.nextLine();
        //Using the monthIf methods by calling monthIf.(method here)
        userInt = Integer.parseInt(userInput);
        System.out.println(monthIf.convertMonth(userInt));

        System.out.println("Please enter what day it is");
        userInput = scanner.nextLine();
        userInt = Integer.parseInt(userInput);
        System.out.println(monthIf.convertDay(userInt));
        //Asking the user for their input again, this time calling the monthSwitch methods
        System.out.println("Please enter your month's number");
        userInput = scanner.nextLine();
        userInt = Integer.parseInt(userInput);
        System.out.println(monthSwitch.convertMonth(userInt));

        System.out.println("Please enter what day it is");
        userInput = scanner.nextLine();
        userInt = Integer.parseInt(userInput);
        System.out.println(monthSwitch.convertDay(userInt));


    }


}
