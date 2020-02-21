package onepackgetestngf;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	//Actions acr=new Actions(driver);
	String bpath="http://apps.qaplanet.in/hrm/login.php";
	
	
  @Test (enabled=true,priority=1,groups="login")
  

 public void Testcase1(){
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	  Assert.assertEquals("ar", "er");
	  
	 // acr.moveToElement(driver.findElement(By.xpath("//span[@class='drop'][contains(text(),'Reports')]"))).perform();
	 // acr.moveToElement(driver.findElement(By.xpath("//html"))).click();
	  
	  //Thread.sleep(3000);
  }
  
   @Test (enabled=true,priority=2,groups="login")
  public void Testcase2() {
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	 // Thread.sleep(3000);
	  
  }
  
  @BeforeMethod
  
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET\\Desktop\\kalyan s\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(bpath);
	   Actions acr=new Actions(driver);
	   
	   
	   
	   
	   
	   
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
