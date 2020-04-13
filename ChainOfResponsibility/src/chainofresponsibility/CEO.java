package chainofresponsibility;

public class CEO extends Handler {
    @Override
    public void processRequest(PayRaiseRequest request) {
        double salary = request.getSalary();
        double payRaise = request.getPayRaise();
        if (payRaise >  (salary * 5 / 100)) {
            System.out.println("CEO will approve " + payRaise + " € pay raise in your salary");
        }
        else {
            super.processRequest(request);
        }
    }

}
