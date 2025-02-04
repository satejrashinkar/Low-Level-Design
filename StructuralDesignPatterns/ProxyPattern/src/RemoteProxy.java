public class RemoteProxy implements ICar {

    private RCScorpio rcScorpio = new RCScorpio();

    @Override
    public void turnLeft() {
        System.out.println("Inside turnLeft in Remote class");
        rcScorpio.turnLeft();
    }

    @Override
    public void turnRight() {
        System.out.println("Inside turnRight in Remote class");
        rcScorpio.turnRight();
    }

    @Override
    public void goStraight() {
        System.out.println("Inside goStraight in Remote class");
        rcScorpio.goStraight();
    }
}
