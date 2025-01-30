public class BulletProof extends ScorpioDecorator {
    ICar scorpio;

    public BulletProof(ICar scorpio) {
        this.scorpio = scorpio;
    }

    @Override
    public void start() {
        scorpio.start();
    }

    @Override
    public void stop() {
        scorpio.stop();
    }

    @Override
    public float getWeight() {
        return scorpio.getWeight() + 300f;
    }
}
