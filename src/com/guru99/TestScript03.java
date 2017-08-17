package com.guru99;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * 
 * @author Krishna Rungta
 *         This script uses Excel to parameterize the Script
 */

public class TestScript03 {

    static WebDriver driver; // Selenium control driver
    private static String baseUrl; // baseUrl of Website Guru99

    public static void setUp() throws Exception {
	File pathToBinary = new File(Util.FIREFOX_PATH);
	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	FirefoxProfile firefoxProfile = new FirefoxProfile();
	driver = new FirefoxDriver(ffBinary, firefoxProfile);
	baseUrl = Util.BASE_URL;
	driver.manage().timeouts()
		.implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
	driver.get(baseUrl + "/V4/");
    }

    /**
     * SS1: Enter valid userid & password 
     *      Expected: Login successful home page shown 
     * SS2: Enter invalid userid & valid password 
     * SS3: Enter valid userid & invalid password 
     * SS4: Enter invalid userid & invalid password 
     *      Expected: A pop-up “User or Password is not valid” is shown
     * 
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
	// Read test data from excel file
    // Method 	getDataFromExcel is defined in class Util
    	String[][] testData = Util.getDataFromExcel(Util.FILE_PATH,
    			Util.SHEET_NAME, Util.TABLE_NAME);
	String username, password;
	String actualTitle;
	String actualBoxtitle;

	//Testing for all parameters stored in the Excel File
	for (int i = 0; i < testData.length; i++) {
	    username = testData[i][0]; // get username
	    password = testData[i][1]; // get password
	    
	    //Setup Firefox driver
	    setUp();
	    // Enter username
	    driver.findElement(By.name("uid")).clear();
	    driver.findElement(By.name("uid")).sendKeys(username);

	    // Enter Password
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(password);

	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
       
        /* Determine Pass Fail Status of the Script
         * If login credentials are correct,  Alert(Pop up) is NOT present. An Exception is thrown and code in catch block is executed	
         * If login credentials are invalid, Alert is present. Code in try block is executed 	    
         */
	    try{ 
	    
	       	Alert alt = driver.switchTo().alert();
			actualBoxtitle = alt.getText(); // get content of the Alter Message
			alt.accept();
			if (actualBoxtitle.contains(Util.EXPECT_ERROR)) { // Compare Error Text with Expected Error Value
			    System.out.println("Test case SS[" + i + "]: Passed"); 
			} else {
			    System.out.println("Test case SS[" + i + "]: Failed");
			}
		}    
	    catch (NoAlertPresentException Ex){ 
	    	actualTitle = driver.getTitle();
			// On Successful login compare Actual Page Title with Expected Title
			if (actualTitle.contains(Util.EXPECT_TITLE)) {
			    System.out.println("Test case SS[" + i + "]: Passed");
			} else {
			    System.out.println("Test case SS[" + i + "]: Failed");
			}
			
        } 
	    driver.close();
	    } 
       
		
	    }
	

    }
