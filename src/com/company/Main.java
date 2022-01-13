package com.company;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {7, 3 , 4, 1,2};
    /*    BubbleSort Sorter = new BubbleSort();
        Sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    */
        InsertionSort Insert = new InsertionSort();
        Insert.Sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }


}
