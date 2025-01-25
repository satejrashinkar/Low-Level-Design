import Models.Fortuner;
import Models.ICar;

public class FortunerBuilder implements ICarBuilder{
    Fortuner car;
    @Override
    public void buildEngine() {
        System.out.println("Building Fortuner Engine");
    }

    @Override
    public void buildChassis() {
        System.out.println("Building Fortuner Chassis");
    }

    @Override
    public void buildTyres() {
        System.out.println("Building Fortuner Tyres");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Building Fortuner BodyShell");
    }

    @Override
    public ICar build() {
        System.out.println("Fortuner is built");
        return car;
    }
}
