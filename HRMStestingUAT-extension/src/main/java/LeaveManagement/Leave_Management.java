package LeaveManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Establishment.login;
public class Leave_Management extends login{
	@BeforeMethod
	public void setup() throws InterruptedException {
		intialize();}
	@AfterMethod
	public void teardown()
	{
		driver.quit();}
	@Test(enabled=false)
	public void Leaves() throws InterruptedException
	{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Leaves']")).click();Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Add Employee Leave Detail")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='date']")).sendKeys("29-04-2022");Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();Thread.sleep(2000);
	}       
	@Test(enabled=false)
public void Leaves_All_field_blank() throws InterruptedException
{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//a[normalize-space()='Leaves']")).click();Thread.sleep(2000);
driver.findElement(By.partialLinkText("Add Employee Leave Detail")).click();Thread.sleep(2000);
String actualErrorMessage = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).getText();
String expectedErrorMessage="Fill All The Details";
Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"");
//driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();Thread.sleep(2000);	
//System.out.println("All fields are NULL");
/*String string1 = "every end is a new beginning";
System.out.println(string1.toLowerCase().startsWith("new".toLowerCase()));
System.out.println(string1.toLowerCase().startsWith("EVERY".toLowerCase()));
System.out.println(string1.toLowerCase().startsWith(""));*/
  }
@Test(enabled=false)
	public void EMP_all_Leave_list () throws InterruptedException
	{
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Leaves']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);	
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();Thread.sleep(2000);	
	String actualErrorMessage = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/button[2]")).getText();
	String expectedErrorMessage="Are you Sure, you want to delete?";
	Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"DELETE POP-UP NOT PRESENT");
	}
	@Test(enabled=true)
	public void Attendance() throws InterruptedException
	{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Attendance']")).click();Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Add Employee Attenda")).click();Thread.sleep(2000);
	//Select Employee
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);	
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();Thread.sleep(2000);	
//Calendar Year
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);	
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();Thread.sleep(2000);	
//Month
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);	
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]")).click();Thread.sleep(2000);	
//Section 
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);	
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();Thread.sleep(2000);	
//Working Days 
driver.findElement(By.xpath("(//input)[10]")).sendKeys("365");Thread.sleep(2000);	
//Total Present Days 
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/input[1]")).sendKeys("365");Thread.sleep(2000);	
//Total Absent Days 
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]/div[2]/input[1]")).sendKeys("365");Thread.sleep(2000);	
//Total Leave Days :
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[2]/input[1]")).sendKeys("365");Thread.sleep(2000);	
driver.findElement(By.xpath("(//button[@class='btn btn-primary'][normalize-space()='SUBMIT'])[2]")).click();Thread.sleep(2000);	
String actualErrorMessage = driver.findElement(By.xpath("//div[@class='cdk-overlay-container']")).getText();
	String expectedErrorMessage="Working Days,Total Present Days,Total Absent Days,Total Leave Days shold not same";
	Assert.assertEquals(actualErrorMessage, expectedErrorMessage," ");
	}
	@Test(enabled=false)
	void Upload_Employee_Attendance() throws InterruptedException
	{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Attendance']")).click();Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Upload Employee Atte")).click();Thread.sleep(2000);
WebElement upload_file = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-attendance[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/input[1]"));
upload_file.sendKeys("C:\\Users\\PCS\\Desktop\\sqldeveloper - Shortcut.lnk");
driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();Thread.sleep(2000);
	System.out.println("File Uploaded Successfully");
	String actualErrorMessage = driver.findElement(By.xpath("//span[normalize-space()='Success']")).getText();
	String expectedErrorMessage="Invalid File Type";
	Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"File type And size is not defined");
	}
	@Test(enabled=false)
	void Leave_application() throws InterruptedException
	{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()='Leave Application']")).click();Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Apply Leave Applicat")).click();Thread.sleep(2000);
	//Select EMP ID
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves-apply[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves-apply[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]")).click();Thread.sleep(2000);
//Number of Leaves
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves-apply[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/div[1]/span[1]")).click();Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-leaves-apply[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]")).click();Thread.sleep(2000);
//From Date
driver.findElement(By.xpath("(//input[@type='date'])[1]")).sendKeys("04-07-2022");Thread.sleep(2000);
//To Date
driver.findElement(By.xpath("(//input[@type='date'])[2]")).sendKeys("10-07-2022");Thread.sleep(2000);
//Upload Document
WebElement upload_file = driver.findElement(By.xpath("//input[@name='pimage']"));
upload_file.sendKeys("C:\\Users\\PCS\\Desktop\\sqldeveloper - Shortcut.lnk");
System.out.println("File Uploaded Successfully");
driver.findElement(By.xpath("//textarea[@id='re']")).click();Thread.sleep(2000);
/*String actualErrorMessage = driver.findElement(By.xpath("")).getText();
String expectedErrorMessage="Invalid File Type";
Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"File type And size is not defined");*/

/*driver.findElement(By.xpath("")).click();Thread.sleep(2000);
driver.findElement(By.xpath("")).click();Thread.sleep(2000);
driver.findElement(By.xpath("")).click();Thread.sleep(2000);
driver.findElement(By.xpath("")).click();Thread.sleep(2000);
driver.findElement(By.xpath("")).click();Thread.sleep(2000);
driver.findElement(By.xpath("")).click();Thread.sleep(2000);
driver.findElement(By.xpath("")).click();Thread.sleep(2000);
driver.findElement(By.xpath("")).click();Thread.sleep(2000);
driver.findElement(By.xpath("")).click();Thread.sleep(2000);
driver.findElement(By.xpath("")).click();Thread.sleep(2000);
*/

		
	}
	}









