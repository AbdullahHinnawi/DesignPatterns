package abstractfactory;

import abstractfactory.interfaces.Cap;
import abstractfactory.interfaces.Jeans;
import abstractfactory.interfaces.Shoes;
import abstractfactory.interfaces.Tshirt;

public class Jasper {

    public void chooseFactory(AbstractClothesFactory factory){
        Jeans jeans = factory.createJeans();
        Tshirt tshirt = factory.createTshirt();
        Cap cap = factory.createCap();
        Shoes shoes = factory.createShoes();
        System.out.println("I am wearing " + jeans + ", " + tshirt + ", " + cap + " and " + shoes + ".");

    }
}
