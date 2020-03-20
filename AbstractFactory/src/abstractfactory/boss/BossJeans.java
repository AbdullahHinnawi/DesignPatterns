package abstractfactory.boss;

import abstractfactory.interfaces.Jeans;
// Konkreettinen tuote:
// määrittelee tuotteen, joka luodaan vastaavalla konkreettisella tehtaalla;
// toteuttaa abstraktin tuotteen rajapinnan
public class BossJeans implements Jeans {
    public  String toString(){
        return "Boss jeans";
    }
}
