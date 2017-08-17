package com.guru00.againSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestCase {
    public static void main(String[] args) {
        System.out.println("Start...");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://www.demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr77780");
        driver.findElement(By.name("password")).sendKeys("vyqypuj");
        driver.findElement(By.name("btnLogin")).click();

        driver.close();
        System.out.println("Start...");
    }
}
