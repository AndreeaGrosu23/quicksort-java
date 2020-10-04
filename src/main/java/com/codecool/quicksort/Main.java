package com.codecool.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Use the tests to check your code!

        List<Integer> list = Arrays.asList(5, 3, 1, 5, 9);
        List<Integer> toSort = Arrays.asList(5, 3, 1, 12, 9);
//        Random random = new Random();
//
//        for (int i = 0; i < 5; i++) {
//            list.add(random.nextInt(5 * 10));
//        }

        //Before sort
        System.out.println(list);
        System.out.println(toSort);

        //After sort
        QuickSort quickSort = new QuickSort();
        System.out.println(quickSort.sort(list));
        System.out.println(quickSort.sort(toSort));
    }

}
