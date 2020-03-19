package factorymethod;

// Concrete creator
public class Opiskelija extends AterioivaOtus {

    // Create concrete product (Tee)
    public Juoma createJuoma(){

        return new Tee();
    };
}
