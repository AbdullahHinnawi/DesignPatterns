package factorymethod;

// Creator
public abstract class AterioivaOtus {
    // Creator (abstract) : AterioivaOtus, se esittelee tehdasMethodin
    // Concrete Creator : Opettaja, Opiskelija ja Opintosihteeri, se esittää toteutuksen tehdasmetodille
    // Concrete Product : Vesi, Tee ja Kahvi, se  määrittelee tuotteen rajapinnan toteutuksen
    // Product (interface) : Juoma, se määrittelee rajapinnan Factory Methodilla luotavalle oliolle

    Juoma juoma = null;

    public abstract Juoma createJuoma(); // Factory method


    public void aterioi(){
        syö();
        juo();
    }

    public void syö(){
        System.out.println("Kylläpä ruoka maistuukin hyvältä");
    }


    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }
}
