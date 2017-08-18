package com.gemini.java_practice.misc;

import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailInboxMail {

    public static void main(String[] args) {
        File file = new File("C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.google.com");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gemini.jain05@gmail.com");
        driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("divine123");
        driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
        driver.findElement(By.xpath("//*[@id=':2o']/div[1]/span/div")).click();
        driver.findElement(By.xpath("//*[@id=':2r']/div")).click();
        driver.findElement(By.xpath("//*[@id=':10j']/div")).click();
        driver.findElement(By.xpath("//*[@id=':xm']/img")).click();
    }

}
