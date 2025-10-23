package org.example;

import org.junit.jupiter.api.Assertions;

public class TestCasesForExample2 {

    @org.junit.Test
    public void numberMissing(){
        int[] arr = {1,2,3,4,0};
        int expectedVal = 5;
        int actualVal = Example2.findMissingNumber(arr);
        Assertions.assertEquals(expectedVal,actualVal);
    }

    @org.junit.Test
    public void noMissingNumber(){
        int[] arr = {1,2,3,4};
        int expectedVal = 0;
        int actualVal = Example2.findMissingNumber(arr);
        Assertions.assertEquals(expectedVal,actualVal);
    }


}
