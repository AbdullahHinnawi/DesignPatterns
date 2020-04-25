package prototype;

public class Viisari implements Cloneable {

    private int arvo;

    public Viisari(int arvo){

        this.arvo= arvo;
    }

    public int getArvo() {
        return arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    // By convention, classes that implement Cloneable interface should override
    // clone() method (which is protected) with a public method.
    // Javalla oletustoteutus clone()-operaatiolle toteuttaa matalakopioinnin (shallow copy)
    //eli klooni viittaa samoihin osaolioihin kuin alkuperäinenkin.
    @Override
    public Viisari clone() throws CloneNotSupportedException {
        // Matalakopio (shallow copy)
        return (Viisari) super.clone();
    }
}
