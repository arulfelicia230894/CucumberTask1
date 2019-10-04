package org.wip.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo3 {
	public static WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user enters details with firstname lastname email address mobileno")
	public void user_enters_details_with_firstname_lastname_email_address_mobileno(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	
		Map<String,String > userlist= dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(userlist.get("firstname"));
	    driver.findElement(By.id("lname")).sendKeys(userlist.get("lastnamw"));
	    driver.findElement(By.id("email")).sendKeys(userlist.get("email"));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(userlist.get("address"));
	    driver.findElement(By.id("telephoneno")).sendKeys(userlist.get("mobileno"));
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	}

	@Then("user confirm the booking")
	public void user_confirm_the_booking() {
		String s = driver.getCurrentUrl();
	    boolean b=s.contains("uid");
	    Assert.assertTrue(b);
	    driver.close();
	    
	}



}
