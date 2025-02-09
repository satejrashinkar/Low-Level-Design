package VisitorPatternImpl;

public class DepreciationPriceVisitor implements ICarVisitor{

    @Override
    public void visitScorpio(Scorpio scorpio) {
        System.out.println("DepreciationPriceVisitor is visiting Scorpio");
    }

    @Override
    public void visitAlto(Alto alto) {
        System.out.println("DepreciationPriceVisitor is visiting Alto");
    }
}
