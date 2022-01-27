package JavaScriptExcecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollhorizontal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	WebElement ele = driver.findElement(By.xpath("//a[contains(@class,'view-all-comp')]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("window.scrollBy(0,2500);");
Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView(true);",ele);
}
}
