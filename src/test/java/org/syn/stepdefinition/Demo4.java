package org.syn.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Demo4 {
	public static WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("customer enters the details with firstname lastname email address mobileno")
	public void customer_enters_the_details_with_firstname_lastname_email_address_mobileno(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);
	   driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(userlist.get(1).get("firstname"));
	    driver.findElement(By.id("lname")).sendKeys(userlist.get(1).get("lastname"));
	    driver.findElement(By.id("email")).sendKeys(userlist.get(1).get("email"));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(userlist.get(1).get("address"));
	    driver.findElement(By.id("telephoneno")).sendKeys(userlist.get(1).get("mobileno"));
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("customer gets confirmation")
	public void customer_gets_confirmation() {
	    String s= driver.getCurrentUrl();
	    boolean b=s.contains("uid");
	    Assert.assertTrue(b);
	    driver.close();
	}


}
