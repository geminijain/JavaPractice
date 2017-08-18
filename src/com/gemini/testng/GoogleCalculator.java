package com.gemini.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class GoogleCalculator {

    @Test
    public void googleCalculator() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("lst-ib")).sendKeys("2+2");
        driver.findElement(By.id("_fZl")).click();
        String result = driver.findElement(By.xpath("//*[@id='cwtltblr']/div[2]")).getText();
        Assert.assertEquals("4", result);
    }

}
