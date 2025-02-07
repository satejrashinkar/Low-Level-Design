import java.util.ArrayList;
import java.util.List;

public class ATCTower {
    List<IAircraft> queueForLanding = new ArrayList<>();

    public synchronized void requestPermissionForLanding(IAircraft aircraft) {
        if (queueForLanding.isEmpty()) {
            System.out.println("Granted permission for landing");
            aircraft.land();
        } else {
            queueForLanding.add(aircraft);
        }
    }
}
