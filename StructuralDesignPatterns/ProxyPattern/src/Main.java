import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RemoteProxy remoteProxy = new RemoteProxy();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the action : ");
            String action = sc.nextLine().toLowerCase();
            switch (action) {
                case "left":
                    remoteProxy.turnLeft();
                    break;
                case "right":
                    remoteProxy.turnRight();
                    break;
                case "straight":
                    remoteProxy.goStraight();
                    break;
                case "stop":
                    System.out.println("Stopping");
                    return;
                default:
                    System.out.println("Invalid action");
            }
        }
    }
}