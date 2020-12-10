package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\dell\\eclipse-workspace\\EmployeeDetails\\Driver1\\chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.out.println("Invalid Browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// WebElement signin =
			// driver.findElement(By.xpath("//div[@class='header_user_info']"));
			// signin.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void inputValuetoElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		waitForElement(element);
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void moveToElement(WebElement element) {
		waitForElement(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectDropDown(WebElement element, String value, String option) {
		if (option.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			Select s2 = new Select(element);
			s2.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			Select s3 = new Select(element);
			s3.selectByIndex(Integer.parseInt(value));
		}
	}

	public static void switchToFrameUsingId(String option, int index) {

		try {
			if (option.equalsIgnoreCase("id")) {
				driver.switchTo().frame(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getScreenshot() throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			File descfile = new File("C:\\Users\\dell\\eclipse-workspace\\AdactinCucumberr\\Screenshots");
			FileUtils.copyFile(srcfile, descfile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
