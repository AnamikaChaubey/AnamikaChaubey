import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Establishment.login;
public class Leave_Management extends login{
	@BeforeMethod
	public void setup() throws InterruptedException {
		intialize();}
	/*@AfterMethod
	public void teardown()
	{
		driver.quit();}*/
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
	@Test(enabled=true)
public void All_field_blank() throws InterruptedException
{driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//a[normalize-space()='Leaves']")).click();Thread.sleep(2000);
driver.findElement(By.partialLinkText("Add Employee Leave Detail")).click();Thread.sleep(2000);
String string = " ";
if (string == null || string.isEmpty() || string.trim().isEmpty()) 
    System.out.println("String is null, empty or blank.");
else
    System.out.println("String is neither null, empty nor blank");
driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();Thread.sleep(2000);	
System.out.println("All fields are NULL");
/*String string1 = "every end is a new beginning";
System.out.println(string1.toLowerCase().startsWith("new".toLowerCase()));
System.out.println(string1.toLowerCase().startsWith("EVERY".toLowerCase()));
System.out.println(string1.toLowerCase().startsWith(""));*/
  
}
	
}





















