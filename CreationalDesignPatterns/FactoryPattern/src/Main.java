import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
//        Scorpio scorpio = new Scorpio();
//        scorpio.driveCar();
//
//        ScorpioN scorpioN = new ScorpioN();
//        scorpioN.driveCar();
//
//        ScorpioClassic scorpioClassic = new ScorpioClassic();
//        scorpioClassic.driveCar();

//        ScorpioFactory factory = new ScorpioFactory();
//        Scorpio car1 = factory.createScorpio('N');
//        car1.driveCar();

        Collection<Scorpio> carList = new ArrayList<>();
        Scorpio car1 = new ScorpioN();
        Scorpio car2 = new ScorpioClassic();
        carList.add(car1);
        carList.add(car2);

        for (Scorpio car : carList){
            car.driveCar();
        }
    }
}