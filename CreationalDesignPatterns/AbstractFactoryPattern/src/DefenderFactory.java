import Models.DefenderEngine;
import Models.IEngine;

public class DefenderFactory implements IVehicleFactory{
    @Override
    public IEngine createEngine() {
        System.out.println("Creating Defender Engine");
        return new DefenderEngine();
    }
}
