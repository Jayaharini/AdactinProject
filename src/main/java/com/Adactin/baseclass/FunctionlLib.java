package com.Adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionlLib {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
	}

	public static void browserLaunch() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\welcome\\Desktop\\cucumber\\MavenDay1\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public static void openApp(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public static void enterText(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

	}

	public static void waitForVisibilityOfWebElement(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void clickBtn(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static void dropDown(WebElement element, String value, String options) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (options.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else {
			s.selectByVisibleText(value);
		}
	}

	public static boolean elementIsDisplayed(WebElement element) throws Exception {

		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static File screenshot(String image) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\com\\Adactin\\reports\\screenshot\\" + image + ".png");
		FileUtils.copyFile(f1, f2);
		return f2;
	}

	public static void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window,scrollBy(0,500)");

	}

	public static void elementHighlight(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background:green;border 2px solid red')", element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void driverQuit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
