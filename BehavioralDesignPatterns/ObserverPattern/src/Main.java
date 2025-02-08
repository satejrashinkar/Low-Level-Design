public class Main {
    public static void main(String[] args) {
        ATCTower tower = new ATCTower();
        Boeing boeing = new Boeing(tower);

        boeing.fly();
        boeing.land();
    }
}