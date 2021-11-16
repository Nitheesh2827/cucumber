package com.baseclass.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;

	public static WebDriver Launchbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nithe\\eclipse-workspace\\Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\nithe\\eclipse-workspace\\Project\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else {
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void Url(String url) {
		driver.get(url);
	}

	public static void Dropdown(WebElement drop, String str) {
		Select s = new Select(drop);

		s.selectByValue(str);
	}

	public static void passvalues(WebElement element, String str) {
		element.sendKeys(str);
	}

	public static void empty(WebElement element) {
		element.clear();
	}

	public static void pause(long i) throws InterruptedException {
		Thread.sleep(i);
		}
	public static void hold(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");

	}
	public static void scroll1(int j) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");
	}

	public static void press(WebElement element) {
		element.click();
	}
	
}
