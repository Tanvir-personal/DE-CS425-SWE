package com.cs425;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var arrayFlattener = new ArrayFlattener();
        var arrayReversor = new ArrayReversor(arrayFlattener);
        int[][] arr = {
                { 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8, 9 }
        };
//        System.out.println(Arrays.toString(arrayFlattener.flattenArray(arr)));
        System.out.println(Arrays.toString(arrayReversor.reverseArray(arr)));
    }
}