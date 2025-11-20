package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCasesForExample2 {

    @Test
    public void numberMissing(){
        int[] arr = {1,2,3,4,0};
        int expectedVal = 5;
        int actualVal = Example2.findMissingNumber(arr);
        Assertions.assertEquals(expectedVal,actualVal);
    }

    @Test
    public void noMissingNumber(){
        int[] arr = {1,2,3,4};
        int expectedVal = 0;
        int actualVal = Example2.findMissingNumber(arr);
        Assertions.assertEquals(expectedVal,actualVal);
    }


}
