package packa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cls2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAPLANET\\Desktop\\kalyan s\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Actions acr=new Actions(driver);
		
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.manage().window().maximize();
		
	Thread.sleep(3000);
		
		
	
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	//driver.manage().timeouts().implicitlyWait(int 10,int 50);
	//Thread.sleep(3000); 
		//driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		//driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		//acr.moveToElement(driver.findElement(By.xpath("//li[@id='admin']//a[@class='l1_link']"))).perform();
		//acr.moveToElement(driver.findElement(By.className("l2_link parent users"))).perform();
		//acr.moveToElement(driver.findElement(By.class("l2_link parent users"))).perform();
		
		//acr.moveToElement(driver.findElement(By.xpath("//a[@class='l2_link parent users']//span[contains(text(),'Users')]"))).perform();
		//driver.findElement(By.xpath("//span[contains(text(),'ESS Users')]")).click();
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		//Thread.sleep(3000);
		
		
		

	}

}
