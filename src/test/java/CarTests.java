import org.testng.annotations.Test;

public class CarTests {
    @Test
    public void ShouldStartCar(){
        new Car().start();
    }
}
