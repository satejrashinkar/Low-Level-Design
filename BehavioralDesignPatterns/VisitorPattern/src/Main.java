import DynamicDispatch.AdvancedBrakes;
import DynamicDispatch.AdvancedScorpio;
import DynamicDispatch.StandardBrakes;
import VisitorPatternImpl.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    /*
        // Dynamic Dispatch

        Scorpio scorpio = new Scorpio();
        Scorpio advancedScorpio = new AdvancedScorpio();
        StandardBrakes standardBrakes = new StandardBrakes();
        StandardBrakes advancedBrakes = new AdvancedBrakes();

        scorpio.applyBrakes(standardBrakes);
        advancedScorpio.applyBrakes(standardBrakes);

        scorpio.applyBrakes(advancedBrakes);
        advancedScorpio.applyBrakes(advancedBrakes);
     */

        // Visitor Pattern Impl
        Fleet fleet = new Fleet();
        ICar scorpio = new Scorpio();
        ICar alto = new Alto();
        fleet.addCar(scorpio);
        fleet.addCar(alto);

        Iterator<ICar> carIterator = fleet.getIterator();
        ICarVisitor insurancePriceVisitor = new InsurancePriceVisitor();

        while (carIterator.hasNext()) {
            carIterator.next().accept(insurancePriceVisitor);
        }
    }
}