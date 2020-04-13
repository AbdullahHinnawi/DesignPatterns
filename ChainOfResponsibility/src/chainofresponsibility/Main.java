package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){
        Supervisor supervisor = new Supervisor();
        HeadOfUnit headOfUnit = new HeadOfUnit();
        CEO ceo = new CEO();

        supervisor.setSuccessor(headOfUnit);
        headOfUnit.setSuccessor(ceo);

        try{
            while(true){
                System.out.println("Enter your salary");
                double salary = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                System.out.println("Enter your desired pay raise");
                double amountToBeIncreased = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                supervisor.processRequest(new PayRaiseRequest(salary, amountToBeIncreased));
            }
        }catch(Exception e){
            System.exit(1);
        }
    }
}
