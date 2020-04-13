package chainofresponsibility;


public class HeadOfUnit extends Handler {
    @Override
    public void processRequest(PayRaiseRequest request) {
        double salary = request.getSalary();
        double payRaise = request.getPayRaise();

        if(payRaise > (salary * 2 / 100) && payRaise <= (salary * 5 / 100)) {
            System.out.println("Head of unit will approve " + payRaise+ " € pay raise in your salary");
        }else{
            super.processRequest(request);
        }


    }
}
