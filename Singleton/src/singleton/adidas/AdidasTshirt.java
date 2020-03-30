package singleton.adidas;

import singleton.interfaces.Tshirt;

// Konkreettinen tuote:
// määrittelee tuotteen, joka luodaan vastaavalla konkreettisella tehtaalla;
// toteuttaa abstraktin tuotteen rajapinnan
public class AdidasTshirt implements Tshirt {

    public String toString(){
        return "Adidas T-shirt";
    }
}
