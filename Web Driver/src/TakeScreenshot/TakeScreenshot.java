package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");
	File Screenshot=driver.getScreenshotAs(OutputType.FILE);
	System.out.println(Screenshot);
File dest=new File("./errorshot/scr1.png");
FileUtils.copyFile(Screenshot, dest);
File Sc1=driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getScreenshotAs(OutputType.FILE);


}
}
