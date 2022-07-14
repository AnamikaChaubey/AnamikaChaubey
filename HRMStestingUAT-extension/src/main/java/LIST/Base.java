package LIST;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.TakesScreenshot;

public class Base {
public static WebDriver driver;
	public void intialize()
	{
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
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
