package singleton.boss;

import singleton.interfaces.Cap;
// Konkreettinen tuote:
// määrittelee tuotteen, joka luodaan vastaavalla konkreettisella tehtaalla;
// toteuttaa abstraktin tuotteen rajapinnan
public class BossCap implements Cap {
    public  String toString(){
        return "Boss cap";
    }
}
