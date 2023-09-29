package com.cs425;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayFlattener {
    public int[] flattenArray(int[][] array){
        if(array == null)
            throw new NullPointerException();
        return Stream.of(array)
                .flatMapToInt(row -> IntStream.of(row))
                .toArray();
    }
}
