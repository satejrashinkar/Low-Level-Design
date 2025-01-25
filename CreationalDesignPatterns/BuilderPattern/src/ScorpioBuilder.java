import Models.ICar;
import Models.Scorpio;

public class ScorpioBuilder implements ICarBuilder {
    Scorpio car;
    @Override
    public void buildEngine() {
        System.out.println("Building Scorpio Engine");
    }

    @Override
    public void buildChassis() {
        System.out.println("Building Scorpio Chassis");
    }

    @Override
    public void buildTyres() {
        System.out.println("Building Scorpio Tyres");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Building Scorpio BodyShell");
    }

    @Override
    public ICar build() {
        System.out.println("Scorpio is built");
        return car;
    }
}
