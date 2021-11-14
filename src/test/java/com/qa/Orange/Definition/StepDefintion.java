package com.qa.Orange.Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefintion {
	WebDriver driver;

	@Given("as a user we launch the url{string}")
	public void as_a_user_we_launch_the_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
 
	}

	@When("as a user we send username {string} and password {string}")
	public void as_a_user_we_send_username_and_password(String username, String pass) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);

	}
	@And("as a user click the login button")
	public void as_a_user_click_the_login_button() {
	    driver.findElement(By.id("btnLogin")).click();
	    
	}
	  	 
	@Then("as a user close the browser")
	public void as_a_user_close_the_browser() {
	    driver.close();
	}
	
}
