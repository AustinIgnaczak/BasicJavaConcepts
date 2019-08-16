package com.company;

public class CalculatorObject {
    //An object with methods that can be called by instantiating
    //it in the app.
    //Returning text here for ease.

    public void add(int a, int b) {
        System.out.println(a + " +" + b + " = " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println(a + " +" + b + " = " + (a + b));    }
    public void subtract(int a, int b) {
        System.out.println(a + " -" + b + " = " + (a - b));    }

    public void subtract(double a, double b) {
        System.out.println(a + " -" + b + " = " + (a - b));    }
    public void multiply(int a, int b) {
        System.out.println(a + " *" + b + " = " + (a * b));
    }

    public void multiply(double a, double b) {
        System.out.println(a + " *" + b + " = " + (a * b));    }
    public void divide(int a, int b) {
        System.out.println(a + " /" + b + " = " + (a / b));    }

    public void divide(double a, double b) {
        System.out.println(a + " /" + b + " = " + (a / b));    }


}

