package click.webelement.so;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class Main {
@Test
    public void testTitle() {
        String observed = "Title that you have received from driver";
        String[] expectedTitles = {
                "Test 1",
                "Title that you have received from driver",
                "Test 2"
        };
        Assert.assertTrue(Arrays.asList(expectedTitles).contains(observed));
    }
}