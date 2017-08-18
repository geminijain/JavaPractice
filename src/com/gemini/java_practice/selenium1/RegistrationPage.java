package com.gemini.java_practice.selenium1;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    private WebDriver driver;
    private String baseUrl;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        baseUrl = "http://www.carguruji.com/";
        createChromDriver();
        System.out.println("created driver " + driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void createFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        FirefoxProfile profile = new FirefoxProfile();
        dc.setCapability(FirefoxDriver.PROFILE, profile);
        driver = new FirefoxDriver(dc);
    }

    public void createChromDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testRegistrationPage() throws Exception {
        driver.get(baseUrl + "shop/");
        driver.findElement(By.xpath("//div[@id='bodyContent']/div/div/a[2]/u"))
                .click();
        driver.findElement(By.name("gender")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("firstname");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("lastname");
        driver.findElement(By.linkText("1")).click();
        driver.findElement(By.name("email_address")).clear();
        driver.findElement(By.name("email_address")).sendKeys(
                "lastname@firstname.com");
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("firstlast");
        driver.findElement(By.name("street_address")).clear();
        driver.findElement(By.name("street_address")).sendKeys("firststreet");
        driver.findElement(By.name("postcode")).clear();
        driver.findElement(By.name("postcode")).sendKeys("1234");
        driver.findElement(By.name("city")).clear();
        driver.findElement(By.name("city")).sendKeys("lastcity");
        driver.findElement(By.name("state")).clear();
        driver.findElement(By.name("state")).sendKeys("firststate");
        new Select(driver.findElement(By.name("country")))
                .selectByVisibleText("Angola");
        driver.findElement(By.name("telephone")).clear();
        driver.findElement(By.name("telephone")).sendKeys("9583058670");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("firstlast");
        driver.findElement(By.name("confirmation")).clear();
        driver.findElement(By.name("confirmation")).sendKeys("firstlast");
        driver.findElement(By.id("tdb4")).click();
        driver.findElement(By.cssSelector("#tdb5 > span.ui-button-text"))
                .click();
        driver.findElement(By.cssSelector("#tdb4 > span.ui-button-text"))
                .click();
        driver.findElement(By.cssSelector("#tdb4 > span.ui-button-text"))
                .click();
        driver.get(baseUrl + "/shop/");
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
