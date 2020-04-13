package chainofresponsibility;

public abstract class Handler {

    private Handler successor;

    public void  setSuccessor(Handler s){
        successor = s;
    }
    public void processRequest(PayRaiseRequest request){
        if(successor != null){
            successor.processRequest(request);
        }

    }
}
