package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

    public WebDriver driver;

    @BeforeTest
    public void setup(){

        System.out.println("Setting up Browser");

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

    }



    @Test
    public void testMethod(){

        System.out.println("Test Method");

        driver.get("https://www.google.com");

    }


    @AfterTest
    public void teardown() throws InterruptedException{

        System.out.println("teardown");
        Thread.sleep(5000);
        driver.quit();

    }






}
