package com.gemini.selenium1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class googleCal {

    

    public class calculatorTest {
        
        @Test
        //Tests google calculator
        public void googleCalculator(){
            
            //Create firfox driver's instance
            WebDriver driver = new FirefoxDriver();
            
            //Set implicit wait of 10 seconds
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            //Launch google
            driver.get("http://www.google.com");
            
            //Write 2+2 in google textbox
            WebElement googleTextBox = driver.findElement(By.id("lst-ib"));
            googleTextBox.sendKeys("2+2");
            
            //Click on searchButton
            WebElement searchButton = driver.findElement(By.id("_fZl"));
            searchButton.click();
            
            //Get result from calculator
            WebElement calculatorTextBox = driver.findElement(By.xpath("//*[@id='cwtltblr']/div[2]"));
            String result = calculatorTextBox.getText();
            
            //Verify that result of 2+2 is 4
            Assert.assertEquals(result, "4");
        }
        
    }

}
