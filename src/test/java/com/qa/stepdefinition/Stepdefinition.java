package com.qa.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.qa.pages.DealsPage;
import com.qa.pages.FormsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefinition extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	FormsPage formspage;

	@Before
	public void setup() throws InterruptedException {
		TestBase.initization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@After
	public void teardown() {
		
		driver.quit();
	}

	@Given("^user opens browser$")
	public void user_opens_browser() {

	}

	@Then("^user is on login Page$")
	public void user_is_on_login_Page() {

		// String title = loginpage.validateTitle();

		// Assert.assertEquals("Free CRM #1 cloud software for any business large or
		// small", title);
		// System.out.println(title);

		// Assert.assertEquals("Free CRM #1 cloud software for any business large or
		// small", title);

	}

	@Then("^user enters credentials$")
	public void user_enters_credentials() throws Throwable {

	}

	@Then("^validate homepage title$")
	public void validate_homepage_title() throws Exception {
		String title = homepage.verifyhomepageTitleTest();
		Assert.assertEquals(title, "Cogmento CRM");

	}

	@Then("^validate username$")
	public void validate_username() throws Exception {
		Assert.assertTrue(homepage.verifyUsernameLabel());

	}

	@Then("^navigate to Deals Page and take deal count$")
	public void navigate_to_Deals_Page_and_take_deal_count() throws InterruptedException {
		dealspage = new DealsPage();
		dealspage.navigateToDealsPage();
		List l = dealspage.dealscount();
		System.out.println("This is Step Def:" + l.size());

	}

	@Then("^navigate to home Page and compare deal count$")
	public void navigate_to_home_Page_and_compare_deal_count() throws InterruptedException {
		System.out.println("----------------------------");
		dealspage = new DealsPage();
		dealspage.navigationToHomePage();

	}

	@Given("^User is on forms Page$")
	public void user_is_on_forms_Page() {
		formspage = new FormsPage();
		formspage.navigateToFormsPage();
	}

	@Then("^user clicks on new button and findelements button$")
	public void user_clicks_on_new_button_and_findelements_button() throws InterruptedException {
		formspage.clickonnewButton();
	}

	@Then("^user switches to frame$")
	public void user_switches_to_frame() throws Throwable {
		formspage.switchToframe();

	}

}
