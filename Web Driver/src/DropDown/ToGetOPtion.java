package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetOPtion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		WebElement daySelect = driver.findElement(By.id("day"));
		WebElement monthSelect = driver.findElement(By.id("month"));
		WebElement YearSelect = driver.findElement(By.id("year"));
	Select day=new Select(daySelect);
	  List<WebElement> DayList = day.getOptions();
		  for(WebElement ele:DayList) {
			  System.out.println(ele.getText());
	  }
		  Select Month=new Select(monthSelect);
		 List<WebElement> monthList = Month.getOptions();
		 for(WebElement ele1:monthList) {
			 System.out.println(ele1.getText());
		 }
		 Select year=new Select(YearSelect);
		 List<WebElement> YearList = year.getOptions();
		 for(WebElement ele3:YearList) {
			 System.out.println(ele3.getText());
		 }
}
}