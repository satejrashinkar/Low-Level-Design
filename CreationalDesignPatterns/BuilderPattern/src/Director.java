public class Director {
    ICarBuilder carBuilder;

    public Director(ICarBuilder builder) {
        this.carBuilder = builder;
    }

    // instructions to build
    public void construct(boolean isEngineNeeded, boolean isChassisNeeded, boolean isBodyShellNeeded, boolean isTyreNeeded) {
        if (isEngineNeeded) carBuilder.buildEngine();
        if (isChassisNeeded) carBuilder.buildChassis();
        if (isBodyShellNeeded) carBuilder.buildBodyShell();
        if (isTyreNeeded) carBuilder.buildTyres();
    }
}
