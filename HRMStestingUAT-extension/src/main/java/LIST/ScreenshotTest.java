package LIST;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(customListener.class)
public class ScreenshotTest extends Base {
@BeforeMethod
public void setup()
{
intialize();
}
@AfterMethod
public void teardown()
{
driver.quit();
}
@Test
public void takeScreenshots()
{
Assert.assertEquals(false, true);
}
@Test
public void takeScreenshots1()
{
Assert.assertEquals(false, true);
}
@Test
public void takeScreenshots2()
{
Assert.assertEquals(false, true);
}


}