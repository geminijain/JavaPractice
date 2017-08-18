package com.gemini.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearchBox {

    public static void main(String[] args) {
     WebDriver driver = new FirefoxDriver();
     
     driver.get("http://www.amazon.com");
     
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
     
     driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
     
             }

}
