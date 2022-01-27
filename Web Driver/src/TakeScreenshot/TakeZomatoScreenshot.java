package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeZomatoScreenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.zomato.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
 File temp= ts.getScreenshotAs(OutputType.FILE);
	System.out.println(temp);
File wbsc=new File("./errorshot/scr2.png");
FileUtils.copyFile(temp, wbsc);
}
}