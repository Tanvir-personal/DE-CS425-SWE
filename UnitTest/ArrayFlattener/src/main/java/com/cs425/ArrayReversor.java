package com.cs425;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayReversor {
    private ArrayFlattener arrayFlattener;

    public ArrayReversor(ArrayFlattener arrayFlattener) {
        this.arrayFlattener = arrayFlattener;
    }

    public int[] reverseArray(int[][] array){
        if(array == null)
            throw new NullPointerException();
        var flattened = arrayFlattener.flattenArray(array);
        for(int i = 0, j = flattened.length - 1; i < j; i++, j--){
            int temp = flattened[i];
            flattened[i] = flattened[j];
            flattened[j] = temp;
        }
        return flattened;
    }
}
