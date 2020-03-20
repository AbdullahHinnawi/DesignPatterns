package abstractfactory.adidas;

import abstractfactory.interfaces.Shoes;

// Konkreettinen tuote:
// määrittelee tuotteen, joka luodaan vastaavalla konkreettisella tehtaalla;
// toteuttaa abstraktin tuotteen rajapinnan
public class AdidasShoes implements Shoes {

    public  String toString(){
        return "Adidas shoes";
    }
}
