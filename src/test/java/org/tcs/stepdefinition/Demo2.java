package org.tcs.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo2 {
	public static WebDriver driver;
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();	    
	}

	@When("user enters the customer details with firstname lastname email address mobileno")
	public void user_enters_the_customer_details_with_firstname_lastname_email_address_mobileno(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    List<List<String>> userlist= dataTable.asLists(String.class);
	    driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(userlist.get(0).get(0));
	    driver.findElement(By.id("lname")).sendKeys(userlist.get(0).get(1));
	    driver.findElement(By.id("email")).sendKeys(userlist.get(0).get(2));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(userlist.get(0).get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(userlist.get(0).get(4));
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	}

	@Then("user should get the confirmation page")
	public void user_should_get_the_confirmation_page() {
		String s = driver.getCurrentUrl();
	    boolean b=s.contains("uid");
	    Assert.assertTrue(b);
	    driver.close();
	    
	}


}
