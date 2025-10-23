package org.example;

import static org.testng.AssertJUnit.*;

public class TestCasesForExample6 {


    @org.junit.Test
    public void TestCase1(){
        String s1 = "listen";
        String s2 = "silenT";
        assertTrue(Example6.isAnagram(s1,s2));
    }
    @org.junit.Test
    public void TestCase2(){
        String s1 = "abba";
        String s2 = "aabb";
        assertTrue(Example6.isAnagram(s1,s2));
    }
}
