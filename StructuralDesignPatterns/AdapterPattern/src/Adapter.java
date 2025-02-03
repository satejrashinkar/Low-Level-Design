public class Adapter implements ICar {
    HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon balloon) {
        this.hotAirBalloon = balloon;
    }

    @Override
    public void start() {
        String gasToBeUsed = hotAirBalloon.getGasUsed();
        hotAirBalloon.start(gasToBeUsed);
    }
}
