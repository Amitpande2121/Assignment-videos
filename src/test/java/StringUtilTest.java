import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {

    @Test
    public void shouldGetLengthofAString(){
        String testString= "Hello World";
        Assert.assertEquals(testString.length(),11);
    }
}
