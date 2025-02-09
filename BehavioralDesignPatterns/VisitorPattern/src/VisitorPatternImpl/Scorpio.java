package VisitorPatternImpl;

public class Scorpio implements ICar {
    @Override
    public void accept(ICarVisitor carVisitor) {
        System.out.println("Inside Scorpio accept method");
        carVisitor.visitScorpio(this);
    }
}
