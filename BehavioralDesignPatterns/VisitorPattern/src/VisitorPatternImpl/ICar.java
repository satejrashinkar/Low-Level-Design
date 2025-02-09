package VisitorPatternImpl;

public interface ICar {
    // Important function for double dispatch
    public void accept(ICarVisitor carVisitor);
}
