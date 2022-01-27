import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeElementScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
	File temp = driver.getScreenshotAs(OutputType.FILE);
	System.out.println(temp);
	File destfile = new File("./errorshot/Scr1.png");
	FileUtils.copyFile(temp,destfile);
	File WebElementSc = driver.findElement(By.xpath("//a[@class='desktop-wishlist' and data-reactid='829]")).getScreenshotAs(OutputType.FILE);
	System.out.println(WebElementSc);
	File WebSC1=new File("./errorshot/wesc.png");
	FileUtils.copyFile(WebElementSc, WebSC1);
}
}