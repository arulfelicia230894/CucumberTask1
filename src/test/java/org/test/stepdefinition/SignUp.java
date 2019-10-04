package org.test.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUp {
	static WebDriver driver;
	
	@Given("User in on sign up page")
	public void user_in_on_sign_up_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
				
	}

	@When("The user enters the information with firstname surname emailaddress newpassword")
	public void the_user_enters_the_information_with_firstname_surname_emailaddress_newpassword(io.cucumber.datatable.DataTable dataTable) {
	    List<String> userlist= dataTable.asList(String.class);
	    driver.findElement(By.name("firstname")).sendKeys(userlist.get(0));
	    driver.findElement(By.name("lastname")).sendKeys(userlist.get(1));
	    driver.findElement(By.name("reg_email__")).sendKeys(userlist.get(2));
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys(userlist.get(2));
	    driver.findElement(By.name("reg_passwd__")).sendKeys(userlist.get(3));
	    WebElement date=driver.findElement(By.id("day"));
	    Select s = new Select(date);
	    s.selectByIndex(2); 
	    WebElement month = driver.findElement(By.id("month"));
	    Select m= new Select(month);
	    m.selectByIndex(3);
	    WebElement year = driver.findElement(By.id("year"));
	    Select y = new Select(year);
	    y.selectByIndex(1994);
	    driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
	    driver.findElement(By.xpath("(// button[@type='submit'])[1]")).click();
	    
	}

	@Then("Login successfully")
	public void login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
