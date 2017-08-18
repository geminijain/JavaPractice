package com.gemini.selenium1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpsHandle {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.unionbankonline.co.in");
        driver.manage().window().maximize();

        String homePage = driver.getWindowHandle();
        System.out.println(homePage);

        driver.findElement(By.linkText("  Retail User Login")).click();
             
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows.size());
        
        Iterator<String> itr = windows.iterator();
        
        String currentWindowId;
        while(itr.hasNext()){
            currentWindowId = itr.next().toString();
            System.out.println(currentWindowId);
            
            if(!currentWindowId.equals(homePage)){
                driver.switchTo().window(currentWindowId);
                driver.findElement(By.xpath("html/body/table/tbody/tr/td/table[2]/tbody/tr/td[2]/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[27]/td/a/img")).click();
                
                Set<String> windows1 = driver.getWindowHandles();
                System.out.println(windows1.size());
                
            }
            
        }
        
        
    }

}
