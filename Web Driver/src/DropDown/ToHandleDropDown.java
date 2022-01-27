package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/signup");
	WebElement daySelect = driver.findElement(By.id("day"));
	WebElement monthSelect = driver.findElement(By.id("month"));
	WebElement YearSelect = driver.findElement(By.id("year"));
	 Select Day=new Select(daySelect);
	 System.out.println(Day.isMultiple());
	 
	 Select Month=new Select(monthSelect);
	 System.out.println( Month.isMultiple());
	 
	 Select Year=new Select(YearSelect);
	 System.out.println(Year.isMultiple());
}
}
