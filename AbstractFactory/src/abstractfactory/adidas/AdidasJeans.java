package abstractfactory.adidas;

import abstractfactory.interfaces.Jeans;

// Konkreettinen tuote:
// määrittelee tuotteen, joka luodaan vastaavalla konkreettisella tehtaalla;
// toteuttaa abstraktin tuotteen rajapinnan
public class AdidasJeans implements Jeans {

    public  String toString(){
        return "Adidas jeans";
    }
}
