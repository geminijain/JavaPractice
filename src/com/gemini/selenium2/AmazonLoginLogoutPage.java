package com.gemini.selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLoginLogoutPage {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("http://www.amazon.com");
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email"))
                .sendKeys("gemini.jain05@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("divine123");
        driver.findElement(By.id("signInSubmit")).click();
        driver.get("https://amazon.com/gp/site-directory");

        final Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("nav-link-accountList")))
                .perform();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("nav-item-signout")));                
      

     driver.findElement(By.id("nav-item-signout")).click();

    }

}
