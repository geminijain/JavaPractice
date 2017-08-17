package com.gemini.againSelenium;

import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UserLoginLogout {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://carguruji.com/";
    }

    @Test(dataProvider = "userDataProvider")
    public void testUserLoginLogout(String username, String password) {
        driver.get(baseUrl + "/shop/");
        driver.findElement(By.cssSelector("#tdb3 > span.ui-button-text"))
                .click();
        driver.findElement(By.name("email_address")).clear();

        driver.findElement(By.name("email_address")).sendKeys(username);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("tdb5")).click();
        driver.findElement(By.cssSelector("#tdb4 > span.ui-button-text"))
                .click();
        driver.findElement(By.cssSelector("#tdb4 > span.ui-button-text"))
                .click();
    }

    @DataProvider(name = "userDataProvider")
    public Iterator<Object[]> userDataProvider() throws Exception {
        String csvFile = "D:\\userData_v1.csv";
        String csvSplitter = ",";
        List<Object[]> testCases = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String line;
        String[] data;
        while ((line = br.readLine()) != null) {
            data = line.split(csvSplitter);
            testCases.add(data);
        }
        br.close();
        return testCases.iterator();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}
