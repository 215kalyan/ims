package packa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAPLANET\\Desktop\\kalyan s\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		Thread.sleep(3000);
		
		
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(3000);
		

	}

}
