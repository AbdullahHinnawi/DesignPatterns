package singleton;

import singleton.interfaces.Cap;
import singleton.interfaces.Jeans;
import singleton.interfaces.Shoes;
import singleton.interfaces.Tshirt;

// Asiakas: käyttää abstraktin tehtaan ja abstraktin tuotteen rajapintoja
public class Jasper {

    public void chooseFactory(AbstractClothesFactory factory){
        Jeans jeans = factory.createJeans();
        Tshirt tshirt = factory.createTshirt();
        Cap cap = factory.createCap();
        Shoes shoes = factory.createShoes();
        System.out.println("I am wearing " + jeans + ", " + tshirt + ", " + cap + " and " + shoes + ".");

    }
}
