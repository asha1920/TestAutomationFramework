package tests;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import driverManager.DriverManager;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	public static String projectPath = System.getProperty("user.dir");
	private WebDriver driver;
	public Properties config =new Properties(); 
	public FileInputStream inputstream;
	public WebDriverWait wait;
	

	public String browser;
	//public ExcelUtilities excel;

	@BeforeSuite
	public void beforeSuite() throws Exception {

		setUpConfigFile();
		setUpRunModeForTestCases();
		
	}

	@AfterSuite
	public void afterSuite() throws Exception {

		

	}

	
	private void setUpConfigFile() {

		try 
		{
			inputstream=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
			config.load(inputstream);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	
	private void setUpRunModeForTestCases() {

	}



}