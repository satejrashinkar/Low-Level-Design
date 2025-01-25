import Models.IEngine;
import Models.ScorpioEngine;

public class ScorpioFactory implements IVehicleFactory{
    @Override
    public IEngine createEngine() {
        System.out.println("Creating Scorpio Engine");
        return new ScorpioEngine();
    }
}
