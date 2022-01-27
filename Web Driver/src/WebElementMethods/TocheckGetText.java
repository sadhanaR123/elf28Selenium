package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocheckGetText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver2.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement TogetText1 = driver.findElement(By.id("headerContainer"));
	String msg = TogetText1.getText();
	String actual_msg="Please identify yourself";
	System.out.println(msg.equals(actual_msg));
	WebElement TogetText2 = driver.findElement(By.id("adminCredentialsHeader"));
	String msg2=TogetText2.getText();
	String actualmsg1="Administrator:";
	System.out.println(msg2.equals(actualmsg1));
}
}
