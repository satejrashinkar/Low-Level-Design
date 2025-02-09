package VisitorPatternImpl;

public class InsurancePriceVisitor implements ICarVisitor {
    // Multiple visit functions
    public void visitScorpio(Scorpio scorpio) {
        System.out.println("InsurancePriceVisitor is visiting Scorpio");
    }

    public void visitAlto(Alto alto) {
        System.out.println("InsurancePriceVisitor is visiting Alto");
    }
}
