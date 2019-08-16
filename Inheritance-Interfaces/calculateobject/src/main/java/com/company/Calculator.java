package com.company;
public class Calculator {
    public static void main(String[] args) {
        //Instantiating a new object to be able to call methods
        CalculatorObject calc = new CalculatorObject();
        //Testing the int methods
        System.out.println("Ints: ");
        calc.add(1, 1);
        calc.subtract(23, 52);
        calc.multiply(34,2);
        calc.divide(12,3);
        //Testing the double methods
        System.out.println("Doubles: ");
        calc.add(3.4,2.3);
        calc.multiply(6.7,4.4);
        calc.subtract(5.5,0.5);
        calc.divide(10.8,2.2);


    }
}
