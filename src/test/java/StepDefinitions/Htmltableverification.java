package StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class Htmltableverification {

	WebDriver wd;
	
	public Htmltableverification(WebDriver wd) {
		this.wd = wd;
	}
	 
	 public void finalcheck(DataTable dt) {
		 List<String> table = dt.asList();
		 
		 for(int i = 1; i < wd.findElements(By.xpath("//tr")).size(); i++) {
			 for(int j=1;j<4;j++) {
			 String elements = wd.findElement(By.xpath("//tr["+i+"]/td["+j+"]")).getText();
			 if(table.contains(elements)) {
				Assert.assertTrue(true);
			 }
		 }
		 }
	 }
	 
	 public void findanddeletecustomer(DataTable dt) {
		 List<String> table = dt.asList();
		 List<List<String>> table2 = dt.asLists();
		 
		 for(int i=1;i<wd.findElements(By.xpath("//tr")).size();i++) {
			 String firstname = wd.findElement(By.xpath("//tr["+i+"]/td[1]")).getText();
			 String lastname = wd.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
			 String postcode = wd.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
			 if(table.contains(firstname)&&table.contains(lastname)&&table.contains(postcode)) {
				for(List<String> row: table2) {
						if(row.contains(firstname)&&row.contains(lastname)&&row.contains(postcode)) {
							wd.findElement(By.xpath("//tr["+i+"]/td[5]")).click();
						}
					 }
			 }
			 
		 }
	 }

}
