package com.gllys.android;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class appiumUtil {
	 private AndroidDriver driver;

	@BeforeMethod
    public void setUp() throws Exception {  
        // set up appium  
        File classpathRoot = new File(System.getProperty("user.dir"));  
        File appDir = new File(classpathRoot, "apps");  
        File app = new File(appDir, "ContactManager.apk");  
        DesiredCapabilities capabilities = new DesiredCapabilities();  
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");  
        capabilities.setCapability("platformName", "Android");  
        capabilities.setCapability("deviceName","Android Emulator");  
        capabilities.setCapability("platformVersion", "4.4");  
        capabilities.setCapability("app", app.getAbsolutePath());  
        capabilities.setCapability("appPackage", "com.example.android.contactmanager");  
        capabilities.setCapability("appActivity", ".ContactManager");  
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);  
    }

}