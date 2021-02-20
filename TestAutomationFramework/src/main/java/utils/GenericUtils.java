package utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import driverManager.DriverManager;

public class GenericUtils {

	WebDriverWait wait = null;
	public String driverPath = null;

	public Map<String,String> configMap = new HashMap<String,String>();
	public static String projectPath = System.getProperty("user.dir");

	/***
	 * Method to double click on a web element using Actions class
	 * @param ele
	 * @param fieldName
	 * @throws Exception
	 */
	public void doubleClick(WebElement ele, String fieldName)throws Exception{

		try {
			explicitWait(ele);
			new Actions(DriverManager.getDriver()).moveToElement(ele).doubleClick().perform();

			System.out.println(fieldName+ " is double clicked successfully"); 

		}catch (Exception e) {
			Assert.fail("Double click on "+fieldName+ " failed");
		}
	}

	/***
	 * Method to click on an element using Actions class
	 * @param ele
	 * @param fieldName
	 * @throws Exception
	 */
	public void actionsClick(WebElement ele, String fieldName)throws Exception{
		try {
			explicitWait(ele);
			new Actions(DriverManager.getDriver()).moveToElement(ele).click().perform();
			System.out.println(fieldName+ " is clicked successfully"); 
		}
		catch (Exception e) {
			
			Assert.fail("Click on "+fieldName+ " failed");
		}
	}

	