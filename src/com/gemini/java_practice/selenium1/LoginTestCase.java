package com.gemini.java_practice.selenium1;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestCase {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.demo.guru99.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLogina() throws Exception {
        driver.get(baseUrl + "/V4/");
        driver.findElement(By.name("uid")).clear();
        driver.findElement(By.name("uid")).sendKeys("mngr60292");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("qw1@");
        driver.findElement(By.name("btnLogin")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}
