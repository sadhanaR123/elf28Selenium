package AutomationScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actisoftware {
	public static void main(String[] args) {
		String testURL="https://demo.actitime.com/login.do";
		String username="admin";
		String password="manager";
		String expectedLoginpageTitle="";
		String expectedHomepageTitle="";
		
		//open the browser enter URL
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Launch the browser successfully");
		driver.manage().window().maximize();
		System.out.println("maximize the browser successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Enter the URL
		driver.get("https://demo.actitime.com/login.do");
		//Enter the Username into Username textfield
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

	}
}
