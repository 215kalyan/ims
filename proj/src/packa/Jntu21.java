package packa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverInfo;

public class Jntu21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAPLANET\\Desktop\\kalyan s\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		Actions acr=new Actions(driver);
		driver.navigate().to("https://www.flipkart.com/");
		//driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9573217371");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("kalyan215");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='Wbt_B2 _3mmoXN']//li[4]//ul[1]//li[10]//a[1]")).click();
		
		
		
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
		//driver.get("https://www.flipkart.com/mobiles/pr?sid=tyy,4io&offer=nb:mp:015b6ee811&fm=neo%2Fmerchandising&iid=M_76d9b847-a9d9-49cf-ba78-6e9a9ea81f48_2.WID7VR8AXNX7&ppt=browse&ppn=browse&ssid=dlp");
		//Actions acr=new Actions(driver);
		//acr.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/img[1]"))).click();
		
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
	   //System.out.println(driver.getTitle());
	  //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
	   //Thread.sleep(3000);
	   //driver.navigate().back();
	   //Thread.sleep(3000);
	   //driver.navigate().forward();
	   //Thread.sleep(3000);
	   //driver.navigate().refresh();
	   //System.out.println(driver.getCurrentUrl());
	   //System.out.println(driver.getPageSource());
	  // driver.quit();
	 //  driver.navigate().("");
	   //driver.close();
	   
	}

}
