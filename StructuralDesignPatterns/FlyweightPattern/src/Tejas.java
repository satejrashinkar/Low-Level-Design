public class Tejas implements IAircraft {
    // Intrinsic Properties
    private final String name = "Tejas";
    private final int seater = 2;
    private final String dimensions = "15m long, 4m wide";
    private final String wingSpan = "40 feet";

    // Extrinsic Properties
    public double getTotalTimeToReachDestination(int srcX, int srcY, int destX, int destY, int speed) {
        double distance = Math.sqrt(Math.pow(destX - srcX, 2) + Math.pow(destY - srcY, 2));
        double time = distance/speed;
        return Math.round(time * 100.0) / 100.0;  // Rounded to two decimal places
    }
}
