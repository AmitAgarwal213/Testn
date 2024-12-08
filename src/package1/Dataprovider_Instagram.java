package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test
public class Dataprovider_Instagram {
	@DataProvider(name="data5")
public Object Text_data2() throws InterruptedException {
		Object a[][]= new Object[5][4];
		a[0][0]= "ram@gmail.com";
		a[0][1]= "Amit Agarwal";
		a[0][2]= "amit121113";
		a[0][3]= "password@223";
		
		a[1][0]= "ram12@gmail.com";
		a[1][1]= "Umesh Agarwal";
		a[1][2]= "amit1111213";
		a[1][3]= "password@112345";
		
		a[2][0]= "shivam@gmail.com";
		a[2][1]= "Ashish";
		a[2][2]= "shivam122213";
		a[2][3]= "shivam@12345";
	
		a[3][0]= "vishal@gmail.com";
		a[3][1]= "vishal Agarwal";
		a[3][2]= "vishal12122";
		a[3][3]= "vishal@12345";
		
		a[4][0]= "mohini@gmail.com";
		a[4][1]= "mohini Agarwal";
		a[4][2]= "moghini122213";
		a[4][3]= "password@123duu45";
		
		
	return a ;
	}
	@Test(dataProvider = "data5")
	public void signup(String Email,String FullName, String Un, String Password) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");	
	
	driver.findElement(By.xpath("//input[@aria-label=Mobile Number or Email']")).sendKeys(Email);
	
	driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys(FullName);
	driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys(Un);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	   
}
