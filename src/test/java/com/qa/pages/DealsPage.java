package com.qa.pages;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class DealsPage extends TestBase{

	@FindBy(xpath="//span[text()='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath="//div[@class='value']//p[1]")
	WebElement countOnHeader;
	
	@FindBy(xpath= "//span[text()='Home']")
	WebElement homepageLink;
	
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToDealsPage() {
		dealsLink.click();
	}
	public List<WebElement> dealscount() throws InterruptedException {
		Thread.sleep(3000);
		java.util.List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		for(WebElement itr : list) {
			System.out.println(itr.getText());
			}
		System.out.println("This is Page:"+list.size());
		String value= countOnHeader.getText();
		int value1= Integer.parseInt(value);
		int value2= list.size();
		try {
			Assert.assertEquals(value1, value2);
		}
		catch (AssertionError e) {
			System.out.println("Not equal");
		}
		System.out.println("Equal");
		
		
		return list;
	}
	
	public void navigationToHomePage() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("-------Page----------");
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).build().perform();
		homepageLink.click();
		action.keyUp(Keys.CONTROL).build().perform();
		//homepageLink.click();
		 ArrayList tabs = new ArrayList (driver.getWindowHandles());
		 driver.switchTo().window((String) tabs.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("formsLink"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		
	}
	
}
