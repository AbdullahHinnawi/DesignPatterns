package abstractfactory;

import abstractfactory.interfaces.Cap;
import abstractfactory.interfaces.Jeans;
import abstractfactory.interfaces.Shoes;
import abstractfactory.interfaces.Tshirt;

// An interface can be used instead of abstract class.
public abstract class AbstractClothesFactory {

    public abstract Jeans createJeans();
    public abstract Tshirt createTshirt();
    public abstract Cap createCap();
    public abstract Shoes createShoes();
}
