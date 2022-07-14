package LIST;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(customListener.class)
public class empLIST extends Base {

	public WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	//@Test(dataProvider ="loginTestData" String username, String password)
	public void Employee() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://uat.erp2.upda.co.in/#/index");

		driver.findElement(By.cssSelector(".col-5.ng-star-inserted")).click();
		driver.findElement(By.name("email")).sendKeys("7778889999");

		driver.findElement(By.name("password")).sendKeys("User@1");
		driver.findElement(By.cssSelector("div[class='col-5 ng-star-inserted'] button[type='submit']")).click();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		/////DROPDOWN///////
		Actions Actions =new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']"))).click();

		WebElement element = driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='10 - DEMO ACCOUNT']"));
		Actions.moveToElement(element).click().build().perform();
		driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();

		Assert.assertTrue(driver.findElement(By.partialLinkText("UPDA Support")).isDisplayed());
		System.out.println("Test Case Passed UPDA Support");
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
		Thread.sleep(2000);
		////////EMPLOYEE////////
		driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();
		Thread.sleep(2000);
		/////LIST/////////

		driver.findElement (By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);

		////ADD NEW EMP/////
		driver.findElement (By.cssSelector(".btn.btn-success")).click();
		Thread.sleep(2000);

		/////MANAGE EMP///
		driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("98079120");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);

		driver.findElement (By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		///PERSON NAME///
		driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[3]/div[2]/input[1]")).sendKeys("Hello");
		Thread.sleep(2000);
		/////EMAIL////
		driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[4]/div[2]/input[1]")).sendKeys("Gargi31");
		Thread.sleep(2000);
		//////PHONE NUMBER//////
		driver.findElement (By.xpath("//input[@type='number']")).click();
		Thread.sleep(2000);
		///////PERSON DOB/////
		driver.findElement (By.xpath("//input[@type='date']")).sendKeys("06-06-1897");
		Thread.sleep(2000);
		driver.findElement (By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
		Thread.sleep(2000);

		String actualString =driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).getText();
		String expectedString="Invalid Number";
		Assert.assertEquals(actualString, expectedString);
		System.out.println("Test Case failed__Invalid Phone No OR email");
		Thread.sleep(2000);
	}
}

/*@SuppressWarnings("deprecation")
	
			////////EMPLOYEE////////
			driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();
			Thread.sleep(2000);
			/////LIST/////////

		driver.quit();
	}
}




///////////////////// /////////////////////DROPDOWN/////////////////////////////////////
/*Actions actions111 =new Actions(driver);
			@SuppressWarnings("unused")
			WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(30));

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']"))).click();

			// Thread.sleep(2000);
			WebElement element1111 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-probation[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]"));
			actions111.moveToElement(element1111).click().build().perform();
			//Thread.sleep(2000);

			//driver.findElement (By.xpath("//a[@class='nav-link active']")).click();
			//Thread.sleep(2000);
			////////////////COMPLAIN/////////////////////////////////	 
			driver.findElement (By.xpath("//a[@routerlink='/hrms/arr/complaint']")).click();
			Thread.sleep(2000);
			////////////////ENQUIRY/////////////////////////////////	 	 

			driver.findElement (By.xpath("//a[@routerlink='/hrms/arr/enquiry']")).click();
			Thread.sleep(2000);
			///////////////SUSPENTION/////////////////////////////////		 
			driver.findElement (By.xpath("//a[@routerlink='/hrms/arr/suspension']")).click();
			Thread.sleep(2000);

 */



