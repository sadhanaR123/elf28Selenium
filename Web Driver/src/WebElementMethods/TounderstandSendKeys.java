package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandSendKeys {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver2.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://crmaccess.vtiger.com/");
	driver.findElement(By.id("loginspan")).click();
	Thread.sleep(3000);
	WebElement UsernameTextField = driver.findElement(By.name("username"));
	UsernameTextField.clear();
	UsernameTextField.sendKeys("sadh","na"," ","ram",Keys.CONTROL+"a");
	Thread.sleep(2000);
	UsernameTextField.sendKeys(Keys.CONTROL+"c");
	WebElement passwordTextfield = driver.findElement(By.name("password"));
	passwordTextfield.clear();
	passwordTextfield.sendKeys(Keys.CONTROL+"v");
	driver.findElement(By.partialLinkText("Sign")).click();
	
}
}
