package com.guru99;

/*
 * Set of test script for testing Website Guru99 Bank
 * The test scripts is developed using Selenium Framework
 *
 */
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Krishna Rungta Test Script 01 ************** Test Steps 1) Go to
 *         http://www.demo.guru99.com/V4/ 2) Enter valid UserId 3) Enter valid
 *         Password 4) Click Login
 **/

public class TestScript01 {

    public static void main(String[] args) {

        // Setup Firefox driver
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.demo.guru99.com/V4/";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);

        // Enter username
        driver.findElement(By.name("uid")).sendKeys("mngr77780");

        // Enter Password
        driver.findElement(By.name("password")).sendKeys("vyqypuj");

        // Click Login
        driver.findElement(By.name("btnLogin")).click();

    }

}
