package factorymethod;

// Concrete creator
public class Opintosihteeri extends AterioivaOtus {

    // Create concrete product (Kahvi)
    public Juoma createJuoma() {
        return new Kahvi();
    }
}
