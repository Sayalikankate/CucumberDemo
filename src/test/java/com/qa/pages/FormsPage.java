package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class FormsPage extends TestBase{
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement newButton;

	@FindBy(xpath="//button[@class='ui button'][1]")	
	WebElement formElementButton;
	
	@FindBy(xpath="//button[@class='ui red button']")
	WebElement okButton;
	
	public FormsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToFormsPage() {
		driver.findElement(By.xpath(prop.getProperty("formsLink"))).click();
	}
	
	public void clickonnewButton() throws InterruptedException {
		newButton.click();
		formElementButton.click();
		//driver.switchTo().alert();
		okButton.click();
		Thread.sleep(3000);
	}
	
	public void switchToframe() {
		Dimension size= driver.findElement(By.tagName("iframe")).getSize();
		System.out.println(size+"------------------");
	}
	
}
