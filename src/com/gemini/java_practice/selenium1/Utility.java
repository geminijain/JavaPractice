package com.gemini.java_practice.selenium1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
public static void captureScreenShot(WebDriver driver,String screenshotName) {
    try
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("D:/Screenshots/"+screenshotName+".png"));
        System.out.println("Screenshot taken");
    }
    catch (Exception e)
    {
        System.out.println("Exception while taking ScreenShot: " +e.getMessage());
    }
}
}
