package StepDefinitions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class Addcustomers {
	
	WebDriver wd;
	
	public Addcustomers(WebDriver wd) {
		this.wd = wd;
	}
	
	public void customerdata(DataTable dt) {
		List<String> tabledata = dt.asList();
		Iterator <String> data = tabledata.iterator();
		while(data.hasNext()) {
		wd.findElement(By.xpath("//input[@ng-model='fName']")).sendKeys(data.next());
		wd.findElement(By.xpath("//input[@ng-model='lName']")).sendKeys(data.next());
		wd.findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys(data.next());
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		wd.switchTo().alert().accept();
		}
	}

}
