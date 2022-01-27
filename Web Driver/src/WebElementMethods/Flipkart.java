package WebElementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver2.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	
		//1st Product
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 64 GB)']")).click();
		addTocart(driver,"Buy Apple iPhone 12 ( 64 GB Storage ) Online at Best Price On Flipkart.com");
		Thread.sleep(2000);
		//2nd Product
		driver.findElement(By.name("q"));
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("mi mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Redmi 9A (SeaBlue, 32 GB)']")).click();
		Thread.sleep(1000);
		addTocart(driver,"Mi Redmi 9A ( 32 GB Storage, 2 GB RAM ) Online at Best Price On Flipkart.com");
		Thread.sleep(3000);
		//3rd product
		driver.findElement(By.name("q")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Realme",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='realme C21Y (Cross Black, 64 GB)']")).click();
		Thread.sleep(1000);
		addTocart(driver,"realme C21Y ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Cart")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		
			}
	public static void addTocart(WebDriver driver,String expectedPageTitle) 
	{
		String ParentWindowId=driver.getWindowHandle();
		Set<String> allwindowId=driver.getWindowHandles();
		 allwindowId.remove(ParentWindowId);
		 for(String windowId: allwindowId) {
			 driver.switchTo().window(windowId);
			 String actualPagetitle=driver.getTitle();
			 if(actualPagetitle.equals(expectedPageTitle)) {
				 System.out.println("driver swiched the control to current page");
			 }
			 
			 driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			 driver.switchTo().window(ParentWindowId);
		 }
		
	}
}