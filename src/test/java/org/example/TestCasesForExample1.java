package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class TestCasesForExample1{

    @Test
    public void testCase1(){
        int[] arr = {0,1,0,3,2};
        int[] expected = {1,3,2,0,0};
        Example1.moveZeroesToEnd(arr);
        Assertions.assertArrayEquals(expected,arr);
    }


    @Test
    public void allZeroesTest(){
        int[] arr = {0,0,0};
        int[] expected = {0,0,0};
        Example1.moveZeroesToEnd(arr);
        Assertions.assertArrayEquals(expected,arr);
    }

    @Test
    public void emptyArray(){
        int[] arr = {};
        int[] expected = {};
        Example1.moveZeroesToEnd(arr);
        Assertions.assertArrayEquals(expected,arr);
    }

    @Test
    public void noZeroesTest(){
        int[] arr = {1,2,3};
        int[] expected = {1,2,3};
        Example1.moveZeroesToEnd(arr);
        Assertions.assertArrayEquals(expected,arr);
    }
}
