package abstractfactory.boss;

import abstractfactory.interfaces.Shoes;
// Konkreettinen tuote:
// määrittelee tuotteen, joka luodaan vastaavalla konkreettisella tehtaalla;
// toteuttaa abstraktin tuotteen rajapinnan
public class BossShoes implements Shoes {
    public  String toString(){
        return "Boss shoes";
    }
}
