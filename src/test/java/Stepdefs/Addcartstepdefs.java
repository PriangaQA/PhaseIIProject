package Stepdefs;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Addcartstepdefs {
	
	WebDriver driver= Hooks.driver;
	WebElement Productname;

	@Given("I have Clicked on Loginbutton")
	public void i_have_Clicked_on_Loginbutton() {
		WebElement loginBtn = driver.findElement(By.name("login-button"));
		loginBtn.click();
	}

	@Then("I should land on Home Page")
	public void i_should_land_on_Home_Page() {
	    System.out.println("I am in my home page");
	}

	@When("I find a product")
	public void i_find_a_product() {
	 Productname= driver.findElement(By.cssSelector("div.inventory_item_name"));
	}

	@When("I Click on the Add To Cart button in the product")
	public void i_Click_on_the_Add_To_Cart_button_in_the_product() {
	    WebElement AddToCartbtn=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	    AddToCartbtn.click();
	}

	@When("I Click the shopping cart button")
	public void i_Click_the_shopping_cart_button() {
	    WebElement Cartbtn=driver.findElement(By.cssSelector("a.shopping_cart_link"));
	    Cartbtn.click();
	}

	@Then("I should verify the product name")
	public void i_should_verify_the_product_name() {
	    WebElement Prodname=driver.findElement(By.id("item_4_title_link"));
	    String ActProductname=Prodname.getText();
	    String ExpProductname="Sauce Labs Backpack";
	    Assert.assertEquals(ActProductname, ExpProductname);
	    
	    
	   



	
	
	
}}
