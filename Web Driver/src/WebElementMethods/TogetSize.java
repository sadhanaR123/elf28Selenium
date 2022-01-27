package WebElementMethods;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver2.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
 WebElement Size = driver.findElement(By.id("email"));
Rectangle Etf = Size.getRect();
WebElement Size1 = driver.findElement(By.id("passContainer"));
Rectangle Ptf = Size1.getRect();
System.out.println(Etf.getX());
System.out.println(Ptf.getX());
}
}
