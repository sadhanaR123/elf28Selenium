package Actions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeyDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		List<WebElement> navElement = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		Actions action= new Actions(driver);
		for( WebElement ele:navElement) {
			action.keyDown(Keys.CONTROL).click(ele).perform();
			action.keyUp(Keys.CONTROL).perform();
		}
		String Home="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		Set<String> allwindow=driver.getWindowHandles();
		for(String ele1:allwindow) {
			driver.switchTo().window(ele1);
			String Title = driver.getTitle();
			if(Title.equals(Home)) {
				driver.close();
				
			}
		}
	}
}
