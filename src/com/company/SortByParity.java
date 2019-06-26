package com.company;

public class SortByParity {

    public static void main(String[] args) {

        int[] array = {3,1,2,4};
        sortArrayByParity(array);
    }


    public static int[] sortArrayByParity(int[] array) {

        int[] sortedArray = new int[array.length];
        int[] remainingArray = new int[array.length];
        int count = 0;
        int sortedCount = 0;

        for(int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0) {
                sortedArray[sortedCount] = array[i];
                sortedCount++;
            } else {
                remainingArray[count] = array[i];
                count++;
            }
        }

        for(int i = 0; i < count; i++) {
            sortedArray[sortedCount] = remainingArray[i];
            sortedCount++;
        }

        return sortedArray;
    };
}
