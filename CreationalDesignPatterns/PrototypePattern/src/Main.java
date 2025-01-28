public class Main {
    public static void main(String[] args) {
        // Create a prototype
        IScorpioPrototype prototype = new Scorpio();

        IScorpioPrototype scorpioN = prototype.clone();
        scorpioN.setEngine(new ScorpioNEngine());
        scorpioN.start();

        IScorpioPrototype scorpioClassic = prototype.clone();
        scorpioClassic.setEngine(new ScorpioClassicEngine());
        scorpioClassic.start();
    }
}