package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipledropDownValue {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("file:///C:/Users/User/Downloads/dropDown.html");
	WebElement MultiSelectDropDown = driver.findElement(By.id("m1"));
	Select select=new Select(MultiSelectDropDown);
	System.out.println(select.isMultiple());
	select.selectByIndex(0);
	Thread.sleep(2000);
	select.selectByValue("1");
	Thread.sleep(200);
	select.selectByVisibleText("Pineapple");
}
}
