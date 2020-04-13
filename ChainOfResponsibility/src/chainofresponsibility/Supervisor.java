package chainofresponsibility;


public class Supervisor extends Handler {

    @Override
    public void processRequest(PayRaiseRequest request) {
        double salary = request.getSalary();
        double payRaise = request.getPayRaise();
        if(payRaise <= (salary * 2 / 100)){
            System.out.println("Supervisor will approve " + payRaise + " € pay raise in your salary");
        }else{
            super.processRequest(request);
        }




    }
}
