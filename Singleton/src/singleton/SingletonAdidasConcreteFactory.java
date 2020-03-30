package singleton;


import singleton.adidas.AdidasCap;
import singleton.adidas.AdidasJeans;
import singleton.adidas.AdidasShoes;
import singleton.adidas.AdidasTshirt;
import singleton.interfaces.Cap;
import singleton.interfaces.Jeans;
import singleton.interfaces.Shoes;
import singleton.interfaces.Tshirt;

// Konkreettinen tehdas: määrittelee luontioperaatioiden toteutukset
public class SingletonAdidasConcreteFactory extends AbstractClothesFactory {


    private static SingletonAdidasConcreteFactory INSTANCE = null;

    private SingletonAdidasConcreteFactory() {}

    public static SingletonAdidasConcreteFactory getInstance() {

        if(INSTANCE==null){
            INSTANCE = new SingletonAdidasConcreteFactory();
        }
        return INSTANCE;
    }


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
