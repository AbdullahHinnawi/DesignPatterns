package abstractfactory;


import abstractfactory.adidas.AdidasCap;
import abstractfactory.adidas.AdidasJeans;
import abstractfactory.adidas.AdidasShoes;
import abstractfactory.adidas.AdidasTshirt;
import abstractfactory.interfaces.Cap;
import abstractfactory.interfaces.Jeans;
import abstractfactory.interfaces.Shoes;
import abstractfactory.interfaces.Tshirt;

public class AdidasConcreteFactory extends AbstractClothesFactory {
    @Override
    public Jeans createJeans() {
        return new AdidasJeans();
    }

    @Override
    public Tshirt createTshirt() {
        return new AdidasTshirt();
    }

    @Override
    public Cap createCap() {
        return new AdidasCap();
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }
}
