package POPUP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleFileUploadPopUp {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]")).sendKeys("sadhanagouda15@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]")).sendKeys("8050577286");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		
	}
}
