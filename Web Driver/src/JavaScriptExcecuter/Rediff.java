package JavaScriptExcecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.rediff.com/");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Sign in")).click();
	Thread.sleep(2000);
	 WebElement UserName =driver.findElement(By.id("login1"));
	 UserName.clear();
	 UserName.sendKeys("sumanthElfBatch@rediffmail.com");
	 WebElement Password =driver.findElement(By.id("password"));
	 Password.clear();
	 Password.sendKeys("Testing@123");
	 driver.findElement(By.name("proceed")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[.='Write mail']")).click();
	WebElement Totext = driver.findElement(By.id("TO_IDcmp2"));
	Totext.clear();
	Totext.sendKeys("sumanthElfBatch@rediffmail.com");
	WebElement Subject = driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp4']"));
	Subject.clear();
	Subject.sendKeys("Sadhana");
	WebElement WriteSomething = driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"));
	WriteSomething.clear();
	WriteSomething.sendKeys("Hii Good noon");
	driver.findElement(By.linkText("Send")).click();
	driver.findElement(By.linkText("Inbox"));
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.findElement(By.xpath("//cite[@class='rd_mail_tickbox']")).click();
	driver.findElement(By.xpath("//span[contains(@class,'rd_fil_del')]")).click();
	driver.findElement(By.id("jqi_state0_buttonOk")).click();
	
	}
}
