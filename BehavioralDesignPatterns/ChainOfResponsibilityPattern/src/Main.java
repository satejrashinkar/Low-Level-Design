public class Main {
    public static void main(String[] args) {
        AbstractHandler pressureIssueHandler = new PressureIssueHandler(null);
        AbstractHandler engineIssueHandler = new EngineIssueHandler(pressureIssueHandler);

        PressureIssueRequest pressureIssueRequest = new PressureIssueRequest();
        engineIssueHandler.handleRequest(pressureIssueRequest);
    }
}