package abstractfactory.boss;

import abstractfactory.interfaces.Tshirt;
// Konkreettinen tuote:
// määrittelee tuotteen, joka luodaan vastaavalla konkreettisella tehtaalla;
// toteuttaa abstraktin tuotteen rajapinnan
public class BossTshirt implements Tshirt {
    public  String toString(){
        return "Boss T-shirt";
    }
}
