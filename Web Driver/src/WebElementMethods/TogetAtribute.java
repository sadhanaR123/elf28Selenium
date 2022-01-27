package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetAtribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver2.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String Username="sadhana";
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	WebElement usrnameTF = driver.findElement(By.id("username"));
	usrnameTF.clear();
	usrnameTF.sendKeys(Username);
	String Actualname=usrnameTF.getAttribute("value");
	System.out.println(Actualname);
	if(Actualname.equals(Username)){
		System.out.println("user name is enter properly");
		
	}
}
}
