package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveYourCursor {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://www.myntra.com/");
	 WebElement kidsElement = driver.findElement(By.linkText("KIDS"));
	 Actions action=new Actions(driver);
	 action.moveToElement(kidsElement).perform();
}
}
