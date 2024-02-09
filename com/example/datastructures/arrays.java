package com.example.datastructures;
import java.util.Arrays;

//iterate array 

public class arrays {
    /**
     * @param args
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

       //iterate array
       
        for (int i = 0 ; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        int min = numbers[0];
        int max = numbers[0];

        System.out.print(min);
        System.out.print(max);
        
        Arrays.sort(numbers);
        
        System.out.print("\n Min = " + numbers[0]);
        System.out.print("\n Max = " + numbers[numbers.length-1]);
    }
}
