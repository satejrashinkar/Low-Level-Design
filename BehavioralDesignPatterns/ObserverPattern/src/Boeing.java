public class Boeing implements IAircraft, IObserver {

    private ISubject tower;

    public Boeing(ISubject tower) {
        this.tower = tower;
    }

    @Override
    public void fly() {
        tower.addObserver(this);
        System.out.println("Boeing is flying");
    }

    @Override
    public void land() {
        // unsubscribe the subject upon landing
        System.out.println("Boeing is landing");
        tower.removeObserver(this);
    }

    @Override
    public void proceed(Object newState) {
        System.out.println("Inside proceed method for notifying");
    }
}
