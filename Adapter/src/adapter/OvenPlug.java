package adapter;

public class OvenPlug implements Plug {

    PlugTypeAdaptee plugTypeAdaptee;

    public OvenPlug(PlugTypeAdaptee adaptee){

        this.plugTypeAdaptee = adaptee;
    }
    public void getType() {
        System.out.println("The Oven has originally US plug type.");
        plugTypeAdaptee.changePlugType();
    }


}
