package Stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs {
	
	
	WebDriver driver= Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    
		driver.get("https://www.saucedemo.com/");
		
	}

	
	@When("I enter username as {string}")
	public void i_enter_username_as(String UserNameValue) {
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys(UserNameValue);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String Pwd) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(Pwd);
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
		
		WebElement loginBtn = driver.findElement(By.name("login-button"));
		loginBtn.click();
	   
	}
	@Then("i should land on Home Page")
	public void i_should_land_on_Home_Page() {
	    
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String string) {
		
		WebElement error = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3"));
		String ActError = error.getText();
		if(ActError=="Epic sadface: Username and password do not match any user in this service")
		{
			String Experror="Epic sadface: Username and password do not match any user in this service";
			Assert.assertEquals(ActError, Experror);
		}
		else if(ActError=="Epic sadface: Sorry, this user has been locked out.")
		{
			
			String Experror="Epic sadface: Sorry, this user has been locked out.";
			Assert.assertEquals(ActError, Experror);
		}
		
			
		
	System.out.println(ActError);
		
	    
	}




}
