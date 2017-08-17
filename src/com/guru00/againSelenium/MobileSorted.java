package com.guru00.againSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MobileSorted {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://live.guru99.com/index.php/");
        String value = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[1]/div/div/h2")).getText();
Assert.assertTrue(value.contains("THIS IS DEMO SITE"));
driver.findElement(By.xpath(".//*[@id='nav']/ol/li[1]/a")).click();
value = driver.findElement(By.xpath("//*[@id='nav']/ol/li[1]/a")).getText();
Assert.assertTrue(value.equals("MOBILE"));
driver.findElement(By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")).click();
    driver.findElement(By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select/selected")).click();
    
    }

}
