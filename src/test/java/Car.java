import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel>wheels;

    public Car() {
        engine=new Engine();
    }

    public void start(){
        System.out.println("starting car");
        engine.start();

    }
    private void stop(){
        System.out.println("stoping car");
        engine.stop();

    }
}

