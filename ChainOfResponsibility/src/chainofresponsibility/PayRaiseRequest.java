package chainofresponsibility;

public class PayRaiseRequest {
    private double salary;
    private double payRaise;

    public PayRaiseRequest(double salary, double payRaise){
        this.salary = salary;
        this.payRaise = payRaise;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPayRaise() {
        return payRaise;
    }

    public void setPayRaise(double payRaise) {
        this.payRaise = payRaise;
    }
}
