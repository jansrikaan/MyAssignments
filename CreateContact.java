package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("janani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("jans");
		driver.findElement(By.name("departmentName")).sendKeys("CS");
		driver.findElement(By.name("description")).sendKeys("This is a sample text");
		driver.findElement(By.name("primaryEmail")).sendKeys("janani@gmail.com");
		
WebElement SourceSV = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select ss = new Select(SourceSV);
ss.selectByVisibleText("New York");

driver.findElement(By.name("submitButton")).click();

String title = driver.getTitle();
System.out.println(title);

driver.findElement(By.partialLinkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_description")).clear();
driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is very Important!");
driver.findElement(By.name("submitButton")).click();

String ss1 = driver.getTitle();
System.out.println(ss1);
	}

}
