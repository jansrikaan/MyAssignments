package week2.Assignments;


 import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment1 {
	
	public static void main(String[] args) {
		
	ChromeDriver dd = new ChromeDriver();
	dd.get("https://en-gb.facebook.com/");
	dd.manage().window().maximize();
	
	//to add implicit wait
	
	dd.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	dd.findElement(By.xpath("//a[text()='Create new account']")).click();
	dd.findElement(By.name("firstname")).sendKeys("janani");
	dd.findElement(By.name("lastname")).sendKeys("srikaanth");
	dd.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("janani@gmail.com");
	dd.findElement(By.xpath("//input[@id= 'password_step_input']")).sendKeys("asdfgh");
	
	WebElement datedd = dd.findElement(By.xpath("//select[@id= 'day']"));	
	Select dds = new Select(datedd);
	dds.selectByVisibleText("1");
	
	WebElement monthdd = dd.findElement(By.xpath("//select[@id= 'month']"));
	Select ddm = new Select(monthdd);
	ddm.selectByVisibleText("Aug");
	
	WebElement yeardd = dd.findElement(By.xpath("//select[@id= 'year']"));
	Select ddy = new Select(yeardd);
	ddy.selectByVisibleText("1986");
	
	dd.findElement(By.xpath("//label[text() = 'Female']")).click();
	
	
		
	
	
}
	
}
