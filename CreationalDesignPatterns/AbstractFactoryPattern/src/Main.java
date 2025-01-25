import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        IVehicleFactory scorpioFactory = new ScorpioFactory();
        IVehicleFactory defenderFactory = new DefenderFactory();
        Car car1 = new Car(scorpioFactory);
        Car car2 = new Car(defenderFactory);

        Collection<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        for (Car car : carList){
            car.driveCar();
        }
    }
}