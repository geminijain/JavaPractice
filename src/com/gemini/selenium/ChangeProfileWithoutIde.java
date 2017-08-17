package com.gemini.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeProfileWithoutIde {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://www.carguruji.com/shop/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.name("email_address")).sendKeys(
                "first2@last2.COM");
        driver.findElement(By.name("password")).sendKeys("first");
        driver.findElement(By.id("tdb5")).click();
        driver.findElement(By.linkText("Change my account password.")).click();
        driver.findElement(By.name("password_current")).sendKeys("first2");
        driver.findElement(By.name("password_new")).sendKeys("first3");
        driver.findElement(By.name("password_confirmation")).sendKeys(
                "first3");
        driver.findElement(By.id("tdb5")).click();
        Assert.assertEquals("Your password has been successfully updated.", driver.findElement(By.xpath("//*[@id='bodyContent']/table/tbody/tr/td")).getText().trim());
    }

    @After
    public void afterSetUp() {
        driver.close();
    }
}
