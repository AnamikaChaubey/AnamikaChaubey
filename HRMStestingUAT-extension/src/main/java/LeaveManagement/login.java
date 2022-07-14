package LeaveManagement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
public void intialize() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	driver.get("https://uat.erp2.upda.co.in/");
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys("9838780000");
	driver.findElement(By.id("password")).sendKeys("User@1");
	driver.findElement(By.cssSelector("div[class='col-5 ng-star-inserted'] button[type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	wait.until(ExpectedConditions.elementToBeClickable(By.name("b_acct_id"))).click();

	       WebElement element = driver.findElement(By.xpath("//span[normalize-space()='9 - Integrated Testing Module']"));
	       actions.moveToElement(element).click().build().perform();
	       driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	      
		     
	       //System.out.println("come here 1")

}
}
