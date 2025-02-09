public class Main {
    public static void main(String[] args) {
        AirForce airForce = new AirForce();
        ICustomIterator customIterator = airForce.createIterator();

        while (customIterator.hasNext()){
            System.out.println(customIterator.next());
        }
    }
}