package VisitorPatternImpl;

public class Alto implements ICar {
    @Override
    public void accept(ICarVisitor carVisitor) {
        System.out.println("Inside Alto accept method");
        carVisitor.visitAlto(this);
    }
}
