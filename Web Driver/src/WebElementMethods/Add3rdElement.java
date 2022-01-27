package WebElementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add3rdElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("tshirts for women");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement ThirdElement = driver.findElement(By.xpath("(//div[@data-id])[3]"));
		ThirdElement.click();
		Thread.sleep(2000);

		String ParentWindowId=driver.getWindowHandle();
		Set<String> allwindowId=driver.getWindowHandles();
		allwindowId.remove(ParentWindowId);
		for(String windowId: allwindowId) {
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			String FindElements = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
            String price=FindElements.replaceAll("[^\\d.]","");
			int cost=Integer.parseInt(price);
			if(cost<6000) {
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				driver.findElement(By.xpath("//span[text()='Cart']")).click();
			}
			else
			{
				System.out.println("product cost is morethan 6000");
			}
		}
	}

}

