package factorymethod;

// Concrete creator
public class Opettaja extends AterioivaOtus {

    // Create concrete product (Vesi)
    public Juoma createJuoma(){

        return new Vesi();
    };

}
