package com.company;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] array = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(array);

    }

    public static int[][] flipAndInvertImage(int[][] array) {
        int[][] newArray = new int[array.length][array[0].length];

        for(int i = 0; i < array.length; i++) {
            int k = 0;
            for(int j = array[0].length - 1; j >= 0; j--) {
                if (array[i][j] == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }

                newArray[i][k] = array[i][j];
                k++;
            }
        }

        return newArray;
    }

    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int C = A[0].length;
            for (int[] row: A)
                for (int i = 0; i < (C + 1) / 2; ++i) {
                    int tmp = row[i] ^ 1;
                    row[i] = row[C - 1 - i] ^ 1;
                    row[C - 1 - i] = tmp;
                }

            return A;
        }
    }
}
