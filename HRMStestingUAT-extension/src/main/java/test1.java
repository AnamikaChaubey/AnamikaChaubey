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

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import LIST.customListener;
@Listeners(customListener.class)
public class test1 extends Base{


	public WebDriver driver;
	@Test
	@SuppressWarnings("deprecation")
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
		Actions Actions =new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']"))).click();

		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='14 - Lucknow Development Authority']"));
		Actions.moveToElement(element).click().build().perform();
		driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();

		
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
		String actualString =driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).getText();
		String expectedString="Invalid Number";
		Assert.assertEquals(actualString, expectedString);
		System.out.println("Test Case failed__Invalid Phone No OR email");
		Thread.sleep(2000);
	}
	
}
/*String actualURL= driver.getCurrentUrl();
String expectedURL="https://uat.erp2.upda.co.in/#/login";
Assert.assertEquals(actualURL, expectedURL);
System.out.println("Test Case Passed Correct URL");*/

/*SELECT customer_id
FROM database.customers
WHERE  email_address IS NULL
OR NOT customer_type IN (“business”, “individual”)*/

/////////////////////////TO CHECK FOR STRING
//////////////////////////////////////////////////DEPENDENDY////////////////
/*<dependency>
<groupId>org.apache.commons</groupId>
<artifactId>commons-lang3</artifactId>
<version>3.11</version>
</dependency>
*/
//////////CODE/////////////////////
/*String nullString = null;

if(nullString == null) {
    System.out.println("String is null");
}
else if(StringUtils.isEmpty(nullString)) {
    System.out.println("String is empty");
}
else if(StringUtils.isBlank(nullString)) {
    System.out.println("String is blank");
}*/

///////////WITHOUT DEPENDENCY
//Using the equals() Method//
//The equals() method compares the two given strings based on their content and returns true if they're equal or false if they are not:
/* String string = "Hello there";
if(string == null || string.equals("") || string.trim().equals(""))
    System.out.println("String is null, empty or blank");
else
    System.out.println("String is neither null, empty nor blank");*/


/*Using the isEmpty() Method
The isEmpty() method returns true or false depending on whether or not our string contains any text. It's easily chainable with a string == null check, and can even differentiate between blank and empty strings:

String string = "Hello there";

if (string == null || string.isEmpty() || string.trim().isEmpty()) 
    System.out.println("String is null, empty or blank.");
else
    System.out.println("String is neither null, empty nor blank");
The trim() method removes all whitespaces to the left and right of a String, and returns the new sequence. If the String is blank, after removing all whitespaces, it'll be empty, so isEmpty() will return true.
*/

/*Using the Length of the String
As mentioned before, a string is empty if its length is equal to zero. We will be using the length() method, which returns the total number of characters in our string.

String blankString = " ";

if(blankString == null || blankString.length() == 0)
    System.out.println("This string is null or empty");
else
    System.out.println("This string is neither null nor empty");*/


/*String.startsWith()
This method does exactly what we need it to do - and is the most common way to solve this problem. It returns a boolean, which indicates if the string begins with the provided keyword:
String string = "every end is a new beginning";
System.out.println(string.toLowerCase().startsWith("new".toLowerCase()));
System.out.println(string.toLowerCase().startsWith("EVERY".toLowerCase()));
System.out.println(string.toLowerCase().startsWith(""));
Running this outputs:false
true
true*/
//ENABLE A BUTTON
/*elem = driver.find_element_by_id("myId")
if elem.is_enabled():
    elem.click()
else:
    pass # whatever logic to handle...*/

/*heads = driver.find_elements_by_xpath("//table/tbody/tr[1]/th")
# len method is used to get the size of that list
print(len(heads))
for h in heads:
   print(h.text)
#to close the browser
driver.close()*/
	