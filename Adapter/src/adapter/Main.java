package adapter;

public class Main {

    public static void main(String[] args){


        PlugTypeAdaptee adaptee = new PlugTypeAdaptee();
        Plug ovenPlug = new OvenPlug(adaptee);
        ovenPlug.getType();


        System.out.println("--------------");


        Plug fridgePlug = new FridgePlug();
        fridgePlug.getType();


        System.out.println("--------------");

        Plug washingMachinePlug = new WashingMachinePlug();
        washingMachinePlug.getType();

    }
}
