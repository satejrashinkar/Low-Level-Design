public class PressureIssueHandler extends AbstractHandler {

    public static int code = 303;

    public PressureIssueHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (request.getRequestCode() == code){
            System.out.println("PressureIssueHandler is handling the request");
        }else{
            super.handleRequest(request);
        }
    }
}
