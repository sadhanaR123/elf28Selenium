package WebElementMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver2.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("q")).click();
	Thread.sleep(2000);
	 List<WebElement> listofSuggestion = driver.findElements(By.xpath("//li[@role='presentation']"));
	 List<WebElement> dataOfSuggestion=driver.findElements(By.xpath("//li[@role='presentation']"));
System.out.println("The count of autosuggestion list: "+listofSuggestion.size());
for(WebElement ele:dataOfSuggestion) {
	System.out.println(ele.getText());
}
}
}
