package com.codecool.quicksort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    /**
     * This method sort the input ArrayList using quick sort algorithm.
     * @param toSort the ArrayList of integers.
     * @return sorted ArrayList of integers.
     */
    public List<Integer> sort(List<Integer> toSort) throws IllegalArgumentException {

        if (toSort == null) {
            throw new IllegalArgumentException();
        }

        if (toSort.size() <= 1) {
            return toSort;
        }

        int middle = (int) Math.ceil((double) toSort.size() / 2);
        int pivot = toSort.get(middle);

        List<Integer> less = new ArrayList<Integer>();
        List<Integer> greater = new ArrayList<Integer>();

        for (int i = 0; i < toSort.size(); i++) {
            if (toSort.get(i) <= pivot) {
                if (i == middle) {
                    continue;
                }
                less.add(toSort.get(i));
            } else {
                greater.add(toSort.get(i));
            }
        }

        return concatenate(sort(less), pivot,sort(greater));
    }

    /**
     * Join the less array, pivot integer, and greater array
     * to single array.
     * @param less integer ArrayList with values less than pivot.
     * @param pivot the pivot integer.
     * @param greater integer ArrayList with values greater than pivot.
     * @return the integer ArrayList after join.
     */
    private List<Integer> concatenate(List<Integer> less, int pivot, List<Integer> greater) throws IllegalArgumentException {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }

        list.add(pivot);

        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }

        return list;
    }
}
