package org.example;

import org.junit.jupiter.api.Assertions;

public class TestCasesForExample3 {


    @org.junit.Test
    public void allPositive(){
        int[] arr = {1,2,3,4};
        int expectedAnswer = 10;
        int actualAnswer = Example3.kadaneAlgo(arr);
        Assertions.assertEquals(expectedAnswer,actualAnswer);
    }

    @org.junit.Test
    public void allNegative(){
        int[] arr = {-1,-2,-3,-4};
        int expectedAnswer = -1;

        int actualAnswer = Example3.kadaneAlgo(arr);
        Assertions.assertEquals(expectedAnswer,actualAnswer);
    }
}
