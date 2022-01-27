package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloRightclick {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver,10);
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("sadhanagouda15@gmail.com");
		explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
driver.findElement(By.id("login")).click();	
driver.findElement(By.id("password")).sendKeys("sennosad123");
driver.findElement(By.id("login-submit")).click();
driver.findElement(By.xpath("//div[@class='board-tile-details-name']")).click();
WebElement cardElement = driver.findElement(By.xpath("//span[text()='SDLC']"));
 Actions action = new Actions(driver);
 action.contextClick(cardElement).perform();
}
}
