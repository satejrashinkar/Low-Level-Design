public abstract class AbstractScorpio {
    // Bridge
    AbstractScorpioImpl scorpioImpl;

    public AbstractScorpio(AbstractScorpioImpl scorpioImpl) {
        this.scorpioImpl = scorpioImpl;
    }

    public abstract boolean isRightHanded();

    public abstract void printSafetyRequirements();
}
