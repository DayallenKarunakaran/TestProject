package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
	
	WebDriver wd;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dayallen\\eclipse-workspace\\Cucumberjava\\src\\chromedriver.exe");
		wd = new ChromeDriver();
	    wd.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	    wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() { 
		wd.findElement(By.xpath("//button[@ng-click='manager()']")).click();
		wd.findElement(By.xpath("//button[@ng-click='addCust()']")).click();
	}

	@And("user adds customer")
	public void user_adds_customer_using_Firstname_and_Lastname_and_Postcode(DataTable dt) {		
		Addcustomers add = new Addcustomers(wd);
		add.customerdata(dt);
	}

	@And("user checks if the user is added successfully")
	public void user_checks_if_the_user_is_added_successfully(DataTable dt) {
	   wd.findElement(By.xpath("//button[@ng-click='showCust()']")).click();
	  Htmltableverification table = new Htmltableverification(wd);
	  table.finalcheck(dt);
	}
	
	@Then("user deletes specific customers")
	public void user_deletes_specific_customers(DataTable dt) {
		Htmltableverification html = new Htmltableverification(wd);
		html.findanddeletecustomer(dt);
	}

}




