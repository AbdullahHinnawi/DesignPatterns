package facade;

public class CPU {

    public void freeze(){

        System.out.println("Processor Freezing");
    }
    public void jump(long position){

        System.out.println("Processor is jumping to the position " + position + " to process data");
    }
    public void execute(){

        System.out.println("Executing data");
    }
}
