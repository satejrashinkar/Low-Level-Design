public class Main {
    public static void main(String[] args) {
        BrakeMechanism brakeMechanism = new BrakeMechanism();
        AirSuspensionMechanism airSuspensionMechanism = new AirSuspensionMechanism();

        EngageBrakeCommand engageBrakeCommand = new EngageBrakeCommand(brakeMechanism);
        AirSuspensionCommand airSuspensionCommand = new AirSuspensionCommand(airSuspensionMechanism);

        Panel panel = new Panel();
        panel.setCommands(0,airSuspensionCommand);
        panel.setCommands(1,engageBrakeCommand);

        panel.liftSuspension();
        panel.applyBrakes();
    }
}