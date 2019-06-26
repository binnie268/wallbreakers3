package com.company;

public class TransposeMatrix {

    public static void main(String[] args) {
//        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array = {{1,2,3},{4,5,6}};
        transpose(array);
    }

    public static int[][] transpose(int[][] array) {

        int[][] transposedArray = new int[array[0].length][array.length];

        for(int i = 0; i < array[0].length; i++) {

            for(int j = 0; j < array.length; j++) {
                transposedArray[i][j] = array[j][i];
            }
        }

        return transposedArray;
    }
}
