package prototype;

public class Kello  implements Cloneable {
    private Viisari tunti;
    private Viisari minuutti;

    public Kello(int t, int m){
        this.tunti = new Viisari(t);
        this.minuutti = new Viisari(m);
    }

    public Viisari getTunti() {
        return tunti;
    }

    public void setTunti(Viisari tunti) {
        this.tunti = tunti;
    }

    public Viisari getMinuutti() {
        return minuutti;
    }

    public void setMinuutti(Viisari minuutti) {
        this.minuutti = minuutti;
    }

    // Javalla oletustoteutus clone()-operaatiolle toteuttaa matalakopioinnin (shallow copy)
    // eli klooni viittaa samoihin osaolioihin kuin alkuperäinenkin.
    // Jos halutaan syväkopio (deep copy), clone() pitää ylikirjoittaa siten, että se
    // kloonaa myös viitattavat oliot, ks. tunti ja minuutti.
    @Override
    public Kello clone(){
        // Syväkopio (deep copy)
        Kello k = null;
        try{
            k = (Kello) super.clone();
            // kun Kello luokassa toteutetaan syväkopiointi, myös Viisari olioista (tunti ja minuutti) pitää tehdä kopio,
            // eli kloonattu kello saa oma tunti & minuutti oliot.
            k.tunti =  tunti.clone();
            k.minuutti = minuutti.clone();

        }catch(CloneNotSupportedException e){
            e.getMessage();
        }

        return k;
    }
}
