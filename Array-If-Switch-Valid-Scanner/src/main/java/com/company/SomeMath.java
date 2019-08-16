package com.company;

public class SomeMath {

    public static int total5() {
        int[] numbers = new int[]{ 1,2,3,4,5};
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            //+= adds each value together
            total += numbers[i];
        }
        return total;
    }
    public static double average5(){
        int[] numbers = new int[]{1,3,5,7,9};
        //setting variables for clarity
        int total = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            average = total / numbers.length;
        }
        return average;
    }
    public static double largest5(){
        double[] numbers = new double[]{42.0,35.1,2.3,40.2,15.6};
        double largest = 0;
        for(int i = 0; i < numbers.length; i++){
            //checking to see if current value is larger than current largest value
            if(numbers[i]> largest){
                //changing largest to new value if it is
                largest = numbers[i];
            }
        }

        return largest;
    }


    public static void main(String[] args) {
        //for testing

        System.out.println(total5());
        System.out.println(average5());
        System.out.println(largest5());
    }
}
