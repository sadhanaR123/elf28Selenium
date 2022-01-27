package DropDown;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalender {
public static void main(String[] args) {
	LocalDateTime ldt=LocalDateTime.now().plusMonths(4);
	String month=ldt.getMonth().name();
	month=month.substring(0,1).toUpperCase()+month.substring(1,2).toLowerCase();
	int date=ldt.getDayOfMonth();
	int year=ldt.getYear();
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("Browser launched Successfully");
	driver.manage().window().maximize();
	System.out.println("Browser is maximized successfully");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.redbus.com/");
	driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
  for(;;) {
	try {
		driver.findElement(By.xpath("//td[@class='"+month+" "+year+"']/../..//td[text()='"+date+"']")).click();
		break;
	}catch(NoSuchElementException e) {
		driver.findElement(By.xpath("//td[@class='next']")).click();	}
  }
}
}
