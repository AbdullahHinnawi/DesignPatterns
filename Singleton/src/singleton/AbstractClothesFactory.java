package singleton;

import singleton.interfaces.Cap;
import singleton.interfaces.Jeans;
import singleton.interfaces.Shoes;
import singleton.interfaces.Tshirt;

// An interface can be used instead of abstract class.

// Abstrakti tehdas: määrittelee rajapinnat operaatioille, joilla tuotteet luodaan
public abstract class AbstractClothesFactory {

    public abstract Jeans createJeans();
    public abstract Tshirt createTshirt();
    public abstract Cap createCap();
    public abstract Shoes createShoes();
}
