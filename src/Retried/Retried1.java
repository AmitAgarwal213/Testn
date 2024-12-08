package Retried;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Retried1 {
	@Test(retryAnalyzer=Retried.IRAProgramm.class)
	public void retried () {
		
	
	ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 WebElement a= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a2= new Actions(driver);
		a2.moveToElement(a).perform();
	a.click();
	driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("amitaggarwal1213@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amit@12345");
	
	driver.findElement(By.id("signInSubmit")).click();  
	
}
}