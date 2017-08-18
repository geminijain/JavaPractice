package com.gemini.java_practice.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TakeScreenShot {

@Test
public void captureScreenShot() throws Exception{
    WebDriver driver =  new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://twitter.com/");
    Utility.captureScreenShot(driver, "site");
    
    driver.findElement(By.linkText("Log in")).click();
    Utility.captureScreenShot(driver, "Log in page");
    
    driver.quit();
    }

}
