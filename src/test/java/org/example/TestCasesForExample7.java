package org.example;

import org.junit.jupiter.api.Assertions;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestCasesForExample7 {

    @org.junit.Test
    public void emptyString(){
        String s1 = "";
        char expected = '$';
        assertEquals(expected,Example7.nonRepeatingFirstChar(s1));
    }
}
