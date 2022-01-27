package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectDropdown {
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
	Day.selectByIndex(3);
	Select Month=new Select(monthSelect);
	Month.selectByValue("10");
	Select Year=new Select(YearSelect);
	Year.selectByVisibleText("2020");
}
}
