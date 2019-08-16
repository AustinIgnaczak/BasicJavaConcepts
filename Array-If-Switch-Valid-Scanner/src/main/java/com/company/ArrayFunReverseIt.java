package com.company;

public class ArrayFunReverseIt {
    public static void main(String[] args) {

        //inting array as we know how many values we have
        int[] data = {1,2,3,4,5};
        //loop to go though each array value
        for (int i = 0; i < data.length; i++)
        {
            //prints out each value before it is changed
            System.out.println(data[i]);
        }
        //loop that will go though the array from end to start
            for(int j = data.length -1; j >= 0; j--){
                //printing out the values
                System.out.println(data[j]);
            }

    }

}
