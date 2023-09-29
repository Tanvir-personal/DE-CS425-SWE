package com.cs425;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ArrayReversorTest {
    private ArrayFlattener arrayFlattenerMock;
    private ArrayReversor arrayReversor;
    @BeforeEach
    void setUp() {
        arrayFlattenerMock = mock(ArrayFlattener.class);
        arrayReversor = new ArrayReversor(arrayFlattenerMock);

    }
    @Test
    void TwoDimensionlArrayReversedTo1D(){
        int[][] input = {
                { 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8, 9 }
        };
        var flattened = new int[]{1,2,3,4,5,6,7,8,9};
        var reversed = new int[]{9,8,7,6,5,4,3,2,1};
        when(arrayFlattenerMock.flattenArray(input)).thenReturn(flattened);
        assertArrayEquals(reversed, arrayReversor.reverseArray(input));
    }

    @Test
    void NullInputThrowsException(){
        int[][] input = null;
        assertThrows(NullPointerException.class,
                ()->{
                    arrayReversor.reverseArray(input);
                });
    }
}