package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver; // global so that rest of the classes can join
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\CucumberDemo\\src\\test\\java\\com\\qa\\config\\config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	

	public static void initization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\chromdriver\\chromedriver.exe");
		}
		
		
	//	WebDriverWait wait = new WebDriverWait(driver,30);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}
}