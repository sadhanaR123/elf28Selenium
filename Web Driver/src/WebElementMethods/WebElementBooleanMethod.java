package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementBooleanMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver2.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	WebElement UsernameTextField = driver.findElement(By.name("username"));
	WebElement PasswordTextField = driver.findElement(By.name("password"));
	WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log In']"));
	System.out.println(loginButton.isEnabled());
	UsernameTextField.sendKeys("sadhana");
	PasswordTextField.sendKeys("TestYantra");
	System.out.println(loginButton.isEnabled());
}
}