package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraNavElement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver2.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	List<WebElement> navElement =  driver.findElements(By.xpath("//a[@data-type='navElements']"));
	for(WebElement ele: navElement) {
		System.out.println(ele.getText());
	}
}
}
