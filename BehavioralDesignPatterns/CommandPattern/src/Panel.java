public class Panel {
    Command[] commands = new Command[5];

    public void setCommands(int index, Command command) {
        commands[index] = command;
    }

    public void liftSuspension() {
        commands[0].execute();
    }

    public void applyBrakes() {
        commands[1].execute();
    }
}
