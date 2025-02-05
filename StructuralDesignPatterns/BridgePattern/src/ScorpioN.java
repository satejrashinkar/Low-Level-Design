public class ScorpioN extends AbstractScorpio {

    public ScorpioN(AbstractScorpioImpl scorpioImpl) {
        super(scorpioImpl);
    }

    @Override
    public boolean isRightHanded() {
        return scorpioImpl.isRightHanded();
    }

    @Override
    public void printSafetyRequirements() {
        scorpioImpl.printSafetyRequirements();
    }
}
