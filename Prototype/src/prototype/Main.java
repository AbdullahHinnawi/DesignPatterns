package prototype;

public class Main {

    public static void main(String[] arguments){


    Kello kello = new Kello(2, 30);
    System.out.println("kello:" + kello.getTunti().getArvo() + "." + kello.getMinuutti().getArvo());

    Kello kloonattuKello = kello.clone();
    kloonattuKello.getTunti().setArvo(4);
    kloonattuKello.getMinuutti().setArvo(45);


    System.out.println("kloonattuKello:" + kloonattuKello.getTunti().getArvo() + "." + kloonattuKello.getMinuutti().getArvo());
    System.out.println("kello:" + kello.getTunti().getArvo() + "." + kello.getMinuutti().getArvo());
    }
}
