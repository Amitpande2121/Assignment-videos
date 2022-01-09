import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {

    @Test
    public void shouldGetLengthofAString(){
        int length= "Hello World".length();
        Assert.assertEquals(length,11);
    }
    @Test
    public void shouldAddTwoNumbers(){


        int sum = new Calculator().getSum(10,20);

        Assert.assertEquals(30,sum);
    }
    @Test
    public void shouldMultiplyTwonumbers(){
        int result = new Calculator().getResultOfMultiplication(10, 10);
        Assert.assertEquals(100,result);
    }


}
