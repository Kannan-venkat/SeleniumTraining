package org.stepdefinition;

import org.bas.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBlogin extends BaseClass {

	@Given("To launch the chrome browser and maximum window")
	public void to_launch_the_chrome_browser_and_maximum_window() {
		launchTheBrowser();
		windowMax();

	}

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");

	}

	@When("To pass valid username and password")
	public void to_pass_valid_username_and_password() {

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kannanvent589@gmail.com");
		// WebElement password =
		// driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
		// password.sendKeys("Kannn@0782345");
		System.out.println(email);
	}

	@When("To pass invalid username and password")
	public void to_pass_invalid_username_and_password() {

		WebElement pas = driver.findElement(By.id("pass"));
		pas.sendKeys("Kannn@078612345");
		System.out.println(pas);
		// WebElement password =
		// driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
		// password.sendKeys("Kann0782345");

	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

	}

	@When("To check whether navigate to the homepage or not")
	public void to_check_whether_navigate_to_the_homepage_or_not() {
		System.out.println("To check your login credentials");

	}

	@Then("To close the browser")
	public void to_close_the_browser() {

	}

}
