import Models.IBodyShell;
import Models.IEngine;
import Models.ScorpioBodyShell;
import Models.ScorpioEngine;

public class Scorpio {
    IEngine engine;
    IBodyShell bodyShell;

    public void makeScorpio() {
        System.out.println("Making Scorpio");
        this.engine = new ScorpioEngine();
        this.bodyShell = new ScorpioBodyShell();
    }

    public void driveCar() {
        this.makeScorpio();
        System.out.println("Inside drive car method of Scorpio parent class");
    }
}
