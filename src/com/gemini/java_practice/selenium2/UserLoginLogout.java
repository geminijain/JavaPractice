package com.gemini.java_practice.selenium2;

import static org.testng.Assert.fail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserLoginLogout {
    private WebDriver driver;
    private String baseUrl;
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
}
