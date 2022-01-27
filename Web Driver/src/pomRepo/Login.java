package pomRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.getUsernameTextField().sendKeys("admin");
	loginpage.getPasswordTextField().sendKeys("manager");
	loginpage.getLoginButton().click();

}
}
