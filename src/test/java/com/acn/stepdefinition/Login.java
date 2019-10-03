package com.acn.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	static WebDriver driver;
	@Given("user is in loginpage")
	public void user_is_in_loginpage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		WebElement addcustomer=driver.findElement(By.xpath("(//a[@href='addcustomer.php'])[1]"));
		addcustomer.click();
			    
	}
	
	@When("the user enter all the fields {string} , {string} , {string} , {string} , {string}")
	public void the_user_enter_all_the_fields(String string, String string2, String string3, String string4, String string5) {
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(string);
	    driver.findElement(By.id("lname")).sendKeys(string2);
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(string3);
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(string4);
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(string5);
	    driver.findElement(By.name("submit")).click();
	    
	    
	}

	

	@When("user enter all the fields And clicks submit")
	public void user_enter_all_the_fields_And_clicks_submit() {
		System.out.println("Login successfully");
	    	}

	@Then("user sees the generated customer Id")
	public void user_sees_the_generated_customer_Id() {
	    System.out.println("viewed");	
	    }

	
	
	@When("user clicks email")
	public void user_clicks_email() {
	 System.out.println("done");    
	}

	@Then("the customer id is generated")
	public void the_customer_id_is_generated() {
		List<WebElement> td = driver.findElements(By.tagName("td"));
		for (WebElement data : td) {
			System.out.println(data.getText());
			
		}
		
	    	}



}
