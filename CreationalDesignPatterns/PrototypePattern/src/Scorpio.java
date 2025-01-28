public class Scorpio implements IScorpioPrototype {
    ScorpioEngine engine;

    public Scorpio() {
        // default engine
        this.engine = new ScorpioEngine();
    }

    private Scorpio(ScorpioEngine scorpioEngine) {
        // deep copy using copy ctor
        this.engine = new ScorpioEngine(scorpioEngine);
    }

//    @Override
//    public IScorpioPrototype clone() {
//        try {
//            return (Scorpio) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    // Shallow Copy
//    @Override
//    public IScorpioPrototype clone() {
//        return new Scorpio();
//    }

    // Deep Copy
    @Override
    public IScorpioPrototype clone() {
        IScorpioPrototype clonedScorpio = new Scorpio(this.engine);
        return clonedScorpio;
    }

    @Override
    public void setEngine(ScorpioEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Scorpio has started");
    }
}
