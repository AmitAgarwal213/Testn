package package1;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();

	driver.get("https://www.amazon.in/?");
	WebElement s1= driver.findElement(By.id("twotabsearchtextbox"));
	s1.sendKeys("shoes");
	
	s1.sendKeys(Keys.ENTER);
	WebElement scroll= driver.findElement(By.linkText("COVID-19 and Amazon"));
	Point p = scroll.getLocation();
	int x= p.getX();
	int y=p.getY();
	System.out.println(x);
	System.out.println(y);
	JavascriptExecutor js1= driver;
	js1.executeScript("window.scrollBy(0 , "+y+")");
	//js1.executeScript("window.scrollBy("+x+" , "+y+")");
	Thread.sleep(1000);
	js1.executeScript("window.scrollBy(0 , -300)");// When scroler go to down to up than we take negative value 
	
	
}//.executeScript("window.scrollBy(" x++Y+")");
}
