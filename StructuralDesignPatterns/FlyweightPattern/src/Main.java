public class Main {
    public static void main(String[] args) {
        Tejas plane = new Tejas();
        for (int i = 0; i < 5; i++) {
            int srcX = 0, srcY = 0;
            int destX = 100, destY = 100;
            int speed = 15;
            System.out.println("Time to reach dest : " + plane.getTotalTimeToReachDestination(srcX, srcY, destX, destY, speed));
        }
    }
}