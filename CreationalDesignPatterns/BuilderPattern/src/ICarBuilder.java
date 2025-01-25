import Models.ICar;

public interface ICarBuilder {
    public void buildEngine();

    public void buildChassis();

    public void buildTyres();

    public void buildBodyShell();

    public ICar build();
}
