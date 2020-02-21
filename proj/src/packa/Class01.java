package packa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Class01 {


	public static void main(String[] args)  throws InterruptedException {
		
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET\\Desktop\\kalyan s\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	Actions acr=new Actions(driver);
	
	driver.get("http://apps.qaplanet.in/hrm/login.php");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	acr.moveToElement(driver.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
	Thread.sleep(3000);
	acr.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Nationality & Race')]"))).perform();


Thread.sleep(3000);
	//driver.close();
	
	
	

	}

}
