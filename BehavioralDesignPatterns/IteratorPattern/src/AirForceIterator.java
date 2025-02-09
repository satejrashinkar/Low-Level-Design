import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AirForceIterator implements ICustomIterator {

    List<IAircraft> jets;
    IAircraft[] helis;
    LinkedList<Boeing> cargo;
    int jetsPosition = 0;
    int helisPosition = 0;
    int cargoPosition = 0;

    public AirForceIterator(AirForce airForce) {
        jets = airForce.getJets();
        helis = airForce.getHelis();
        cargo = airForce.getCargo();
    }

    @Override
    public IAircraft next() {
        if (helisPosition < helis.length){
            return helis[helisPosition++];
        }
        if (jetsPosition < jets.size()){
            return jets.get(jetsPosition++);
        }
        if (cargoPosition < cargo.size()){
            return cargo.get(cargoPosition++);
        }
        // next element not available
        throw  new RuntimeException("No more elements");
    }

    @Override
    public boolean hasNext() {
        return (helis.length > helisPosition || jets.size() > jetsPosition || cargo.size() > cargoPosition);
    }
}
