package singleton.boss;

import singleton.interfaces.Shoes;
// Konkreettinen tuote:
// määrittelee tuotteen, joka luodaan vastaavalla konkreettisella tehtaalla;
// toteuttaa abstraktin tuotteen rajapinnan
public class BossShoes implements Shoes {
    public  String toString(){
        return "Boss shoes";
    }
}
