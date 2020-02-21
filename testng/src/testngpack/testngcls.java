package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class testngcls {
	WebDriver driver;
	String bpath="http://apps.qaplanet.in/hrm/login.php";
	
  @Test(enabled=true,priority=1,groups="login")
  //valid/valid
  public void f1() {
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	  
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	  
	  
	  
  }
  @Test(enabled=true,priority=2,groups="login")
  //valid-invalid
  public void f2() {
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
	  String gt=driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[2]/strong[1]/font[1]")).getText();
	  //Assert.assertEquals(driver.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login");
	  System.out.println(gt);
	  
  }
  
  @BeforeMethod
  
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAPLANET\\Desktop\\kalyan s\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(bpath);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
 
  }

}
