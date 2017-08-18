package com.gemini.selenium;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageJUnit {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.carguruji.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testRegistrationPageJUnit() throws Exception {
        driver.get(baseUrl + "/shop/");
        driver.findElement(By.xpath("//div[@id='bodyContent']/div/div/a[2]/u"))
                .click();
        driver.findElement(By.name("gender")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("FIRST");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("LAST");
        driver.findElement(By.id("dob")).sendKeys("09/12/2004");
        driver.findElement(By.name("email_address")).clear();
        driver.findElement(By.name("email_address")).sendKeys(
                "FIRSTLAST3@LAST.COM");
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("FIRST");
        driver.findElement(By.name("street_address")).clear();
        driver.findElement(By.name("street_address")).sendKeys("123 abc");
        driver.findElement(By.name("postcode")).clear();
        driver.findElement(By.name("postcode")).sendKeys("POST");
        driver.findElement(By.name("city")).clear();
        driver.findElement(By.name("city")).sendKeys("CITY");
        driver.findElement(By.name("state")).clear();
        driver.findElement(By.name("state")).sendKeys("STATE");
        new Select(driver.findElement(By.name("country")))
                .selectByVisibleText("Argentina");
        driver.findElement(By.name("telephone")).clear();
        driver.findElement(By.name("telephone")).sendKeys("3456789021");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("FIRSTLAST");
        driver.findElement(By.name("confirmation")).clear();
        driver.findElement(By.name("confirmation")).sendKeys("FIRSTLAST");
        driver.findElement(By.id("tdb4")).click();
        driver.findElement(By.cssSelector("#tdb5 > span.ui-button-text"))
                .click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
