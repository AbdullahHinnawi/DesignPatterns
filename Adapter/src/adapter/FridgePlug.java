package adapter;

public class FridgePlug implements Plug {
    @Override
    public void getType() {
        System.out.println("Fridge has EU plug type.");
    }


}
