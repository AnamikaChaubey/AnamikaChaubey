package HRMS;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class LoginHrms {
	public  WebDriver driver;
	
	public void loginpage()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\selenium\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://uat.erp2.upda.co.in/#/login");
	System.out.println(driver.getTitle());
}
	
	
@DataProvider(name ="loginTestData")
public Object[][]  LoginId() {
	Object[][] data = new Object[5][2];
	data[0][0]="7778889999";
	data[0][1]="User@3";

	data[1][0]="7778889998";
	data[1][1]="User@1";

	data[2][0]="7778889999";
	data[2][1]="";
	
	data[3][0]="";
	data[3][1]="User@1";
	
	data[4][0]="7778889999";
	data[4][1]="User@1";
	return data;
}
public void failed(String TestMethodName) {
Date d = new Date();
String fileName = d.toString().replace(":", "_") +".jpg";
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
FileUtils.copyFile(scrFile, new File("C:\\Users\\PCS\\eclipse-workspace\\" + "MyMavenProject\\src\\main\\java\\screenshot\\screeenshots" +TestMethodName + fileName + ".jpg"));
} catch (IOException e) {

e.printStackTrace();
}


}
}




