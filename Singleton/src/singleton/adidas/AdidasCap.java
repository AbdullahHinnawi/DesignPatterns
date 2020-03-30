package singleton.adidas;

import singleton.interfaces.Cap;

// Konkreettinen tuote:
// määrittelee tuotteen, joka luodaan vastaavalla konkreettisella tehtaalla;
// toteuttaa abstraktin tuotteen rajapinnan
public class AdidasCap implements Cap{
    public  String toString(){
        return "Adidas cap";
    }
}
