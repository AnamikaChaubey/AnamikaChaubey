package LIST;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.model.Log;
import com.google.inject.matcher.Matcher;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LIST1 extends login
{ 
	@BeforeMethod
	public void setup() throws InterruptedException {
	intialize();}
/*@AfterMethod
public void teardown()
{driver.quit();}*/
@Test(enabled=false)
public void List() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
	////////EMPLOYEE////////
	driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();Thread.sleep(2000);
	/////LIST/////////
	driver.findElement (By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]")).click();Thread.sleep(2000);
	////ADD NEW EMP/////
	driver.findElement (By.cssSelector(".btn.btn-success")).click();Thread.sleep(2000);
	/////MANAGE EMP///
	driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("9807912891");Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//button[normalize-space()='OK']")).click();Thread.sleep(2000);
	///PERSON NAME///
	driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[3]/div[2]/input[1]")).sendKeys("Shri Ram");Thread.sleep(2000);
	/////EMAIL////
	driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[4]/div[2]/input[1]")).sendKeys("");Thread.sleep(2000);
	//////PHONE NUMBER//////
	driver.findElement (By.xpath("//input[@type='number']")).click();Thread.sleep(2000);
	///////PERSON DOB/////
	driver.findElement (By.xpath("//input[@type='date']")).sendKeys("06-06-1897");Thread.sleep(2000);
	driver.findElement (By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[2]/div[2]/input[1]")).sendKeys("qwe12");Thread.sleep(2000);
	Actions Actions1 =new Actions(driver);
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[4]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"))).click();
	WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[4]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]"));
	Actions1.moveToElement(element1).click().build().perform();
	driver.findElement (By.xpath("//button[normalize-space()='Select Employee Node']")).click();Thread.sleep(2000);
	Actions Actions11 =new Actions(driver);
	WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']"))).click();
	WebElement element11 = driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));
	Actions11.moveToElement(element11).click().build().perform();
	driver.findElement (By.xpath("//div[@class='col-2 ng-star-inserted']//button[@class='btn btn-primary']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//div[@class='col-2 ng-star-inserted']//button[@class='btn btn-primary']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//i[@class='fa fa-arrow-up']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[7]/div[1]/button[3]")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//button[@class='btn btn-outline-success'][normalize-space()='Submit']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//button[normalize-space()='Yes, Add it!']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//button[normalize-space()='OK']")).click();Thread.sleep(2000);
	String actualString =driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).getText();
	String expectedString="Invalid Number";
	Assert.assertEquals(actualString, expectedString);
	System.out.println("Test Case failed__Invalid Phone No OR email");Thread.sleep(2000);}
@Test(enabled=false)
void ADD_Education_info() throws InterruptedException
{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]")).click();Thread.sleep(2000);driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-education-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);
driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-education-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);
driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-education-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[11]")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='Add Education Detail']")).click();Thread.sleep(2000);
Actions Actions1 =new Actions(driver);
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-education-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"))).click();
WebElement element1 = driver.findElement(By.xpath("//span[normalize-space()='Post Graduation (CS)']"));
Actions1.moveToElement(element1).click().build().perform();
Actions Actions11 =new Actions(driver);
WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(30));
wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-education-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"))).click();
WebElement element11 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-education-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]"));
Actions11.moveToElement(element11).click().build().perform();
driver.findElement (By.xpath("//input[@type='number']")).sendKeys("2014");Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();Thread.sleep(2000);
//driver.findElement (By.xpath("//button[normalize-space()='Yes, Add it!']")).click();
//Thread.sleep(2000);
}
@Test(enabled=false)
void EMP_Education_Detail_Update() throws InterruptedException
{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]")).click();Thread.sleep(2000);
driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-education-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[2]")).click();Thread.sleep(2000);	
driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-education-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='Update']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//input[@type='number']")).clear();Thread.sleep(2000);
driver.findElement (By.xpath("//input[@type='number']")).sendKeys("2021");Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='Update']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='Yes, Update it!']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='OK']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[@class='btn btn-outline-primary']")).click();Thread.sleep(2000);
String actualErrorMessage = driver.findElement(By.xpath("//button[@class='btn btn-outline-danger']")).getText();
String expectedErrorMessage="Are you Sure, you want to delete?";
Assert.assertEquals(actualErrorMessage, expectedErrorMessage," ");
//String labelText = driver.findElement(By.xpath("//div[normalize-space()='Bank :']")).getText();  
//System.out.println("Label found");
}
@Test(enabled=false)
void Nominee_Info() throws InterruptedException
{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//a[@routerlink='/hrms/party/nom-info']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']")).click();Thread.sleep(2000);
/////////////////////Nominee Name 
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/input[1]")).sendKeys("Anamika");Thread.sleep(2000);
/////////////////////Nominee Email 
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/input[1]")).sendKeys("anamika123");Thread.sleep(2000);
////////////////////Nominee Phone No
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/input[1]")).sendKeys("1234567898");Thread.sleep(2000);
///////////////////Nominee Relation
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();Thread.sleep(2000);
//////////////////Nominee Bank Name
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[2]/input[1]")).sendKeys("SBI");Thread.sleep(2000);
/////////////////Nominee Branch Name
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[2]/input[1]")).sendKeys("Jankipuram");Thread.sleep(2000);
/////////////////Nominee IFSC Code
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/div[2]/input[1]")).sendKeys("SBI1234567");Thread.sleep(2000);
////////////////Nominee Bank Account No
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/input[1]")).sendKeys("1234567898");Thread.sleep(2000);
///////////////Nominee Share 	
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[11]/div[2]/input[1]")).sendKeys("2%");Thread.sleep(2000);
//////////////Submi
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Yes, Add it!']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(2000);
	SoftAssert softAssert = new SoftAssert();
    String ActualErrorMEssage =  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).getText();
   // String ActualErrorMEssage2 =  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).getText();
   // String ExpectedErrorMessage="Invalid Email";
    String ExpectedErrorMessage="Invalid Account Number";
    //softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMessage,"Anu123");
   softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMessage,"00000000000000");
   softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMessage,"ABCDEFGHIJK");
   softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMessage,"#anamika1234567");
   softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMessage,"_1234567898_");
   softAssert.assertAll();
/*String expected ="Incorrect Email";
String actual=driver.findElement(By.xpath("//button[@class='btn btn-primary']")).getText();
SoftAssert softAssert = new SoftAssert();
softAssert.assertEquals(actual, expected);
String expected1 ="Incorrect Account Number";
String actual1=driver.findElement(By.xpath("//button[@class='btn btn-primary']")).getText();
SoftAssert softAssert1 = new SoftAssert();
softAssert1.assertEquals(actual1, expected1, "00000000000000");
softAssert1.assertAll();
System.out.println("Wrong Input");*/
//softAssert.assertEquals(actual, "anamika12@gmail.com" );
//URI uri=new uri(driver.getCurrentUrl())
}
@Test(enabled=false)
void Nominee_Info1() throws InterruptedException
{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//a[@routerlink='/hrms/party/nom-info']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']")).click();Thread.sleep(2000);
/////////////////////Nominee Name 
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/input[1]")).sendKeys("Anamika");Thread.sleep(2000);
/////////////////////Nominee Email 
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/input[1]")).sendKeys("anamika123");Thread.sleep(2000);
////////////////////Nominee Phone No
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/input[1]")).sendKeys("1234567898");Thread.sleep(2000);
///////////////////Nominee Relation
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]")).click();Thread.sleep(2000);
//////////////////Nominee Bank Name
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[2]/input[1]")).sendKeys("SBI");Thread.sleep(2000);
/////////////////Nominee Branch Name
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[2]/input[1]")).sendKeys("Jankipuram");Thread.sleep(2000);
/////////////////Nominee IFSC Code
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/div[2]/input[1]")).sendKeys("SBI1234567");Thread.sleep(2000);
////////////////Nominee Bank Account No
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[2]/input[1]")).sendKeys("1234567898");Thread.sleep(2000);
///////////////Nominee Share 	
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[11]/div[2]/input[1]")).sendKeys("2%");Thread.sleep(2000);
//////////////Submit
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Yes, Add it!']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(2000); 
	String actualErrorMessage = driver.findElement(By.xpath("//button[@class='btn btn-primary']")).getText();
	String expectedErrorMessage="Invalid Email";
	Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"anamika123");
	
}
@Test(enabled=false)
void Update_Nominee_info() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();Thread.sleep(2000);
	driver.findElement (By.xpath("//a[@routerlink='/hrms/party/nom-info']")).click();Thread.sleep(2000);
	///////////Select Employee
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/div[1]/span[2]")).click();Thread.sleep(2000);	
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[24]/span[1]")).click();Thread.sleep(2000);
	/////////////////UPDATE
	driver.findElement(By.xpath("//button[normalize-space()='Update']")).click(); 
	/////////////////Delete
	//driver.findElement(By.xpath("//button[@class='btn btn-outline-danger']")).click(); 
	////////////////UPDATE PHONE NUMBER
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/input[1]")).clear();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-nominee-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/input[1]")).sendKeys("9807099189");Thread.sleep(2000); 
	///////////////////UPDATE 
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	//driver.findElement(By.xpath("//button[normalize-space()='Yes, Update it!']")).click();
	//Thread.sleep(2000); 
	driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
}
@Test(enabled=false)
void Bank_Detail() throws InterruptedException
{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();Thread.sleep(2000);	
/////////////////BANK DETAILS
driver.findElement (By.xpath("//a[normalize-space()='Bank Detail']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("(//span[@class='ng-arrow-wrapper'])[2]")).click();Thread.sleep(2000);
driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-bank-account-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]")).click();Thread.sleep(2000);
///////////////UPDATE BANK DETAIL
driver.findElement (By.xpath("//button[normalize-space()='Update Bank Detail']")).click();Thread.sleep(2000);
/////////////////////UPDATE BUTTON
driver.findElement (By.xpath("//button[normalize-space()='Update']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='Yes, Update it!']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='OK']")).click();Thread.sleep(2000);
String actualErrorMessage = driver.findElement(By.xpath("//div[contains(text(),'Branch NameBranch Name :')]")).getText();
String expectedErrorMessage="Branch Name";
Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"Branch Name occurs two times");
}
@Test(enabled=false)
void Bank_Detail1() throws InterruptedException
{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();Thread.sleep(2000);	
/////////////////BANK DETAILS
driver.findElement (By.xpath("//a[normalize-space()='Bank Detail']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("(//span[@class='ng-arrow-wrapper'])[2]")).click();Thread.sleep(2000);
driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-bank-account-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]")).click();Thread.sleep(2000);
///////////////UPDATE BANK DETAIL
driver.findElement (By.xpath("//button[normalize-space()='Update Bank Detail']")).click();Thread.sleep(2000);
/////////////////////UPDATE BUTTON
driver.findElement (By.xpath("//button[normalize-space()='Update']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='Yes, Update it!']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='OK']")).click();Thread.sleep(2000);
SoftAssert softAssert = new SoftAssert();
String ActualErrorMEssage =  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).getText();
String ExpectedErrorMessage="Invalid Account Number";
softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMessage,"00000000000000");
softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMessage,"ABCDEFGHIJK");
softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMessage,"#anamika1234567");
softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMessage,"_1234567898_");
softAssert.assertAll();
}
@Test(enabled=true)
void Bank_Detail2() throws InterruptedException
{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//span[normalize-space()='Employee']")).click();Thread.sleep(2000);	
/////////////////BANK DETAILS
driver.findElement (By.xpath("//a[normalize-space()='Bank Detail']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("(//span[@class='ng-arrow-wrapper'])[2]")).click();Thread.sleep(2000);
driver.findElement (By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-bank-account-info[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]")).click();Thread.sleep(2000);
///////////////UPDATE BANK DETAIL
driver.findElement (By.xpath("//button[normalize-space()='Update Bank Detail']")).click();Thread.sleep(2000);
/////////////////////UPDATE BUTTON
driver.findElement (By.xpath("//button[normalize-space()='Update']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='Yes, Update it!']")).click();Thread.sleep(2000);
driver.findElement (By.xpath("//button[normalize-space()='OK']")).click();Thread.sleep(2000);
String actualErrorMessage = driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']")).getText();
String expectedErrorMessage="ADD/Update Bank Detail";
Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"ADD necessory");

}

@SuppressWarnings("deprecation")
@Test(enabled=false)
void LOgin() throws InterruptedException
{WebDriverManager.chromedriver().setup();
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
WebElement element = driver.findElement(By.xpath("//span[normalize-space()='92 - Integrated Testing Account']"));
actions.moveToElement(element).click().build().perform();
driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
}





}































