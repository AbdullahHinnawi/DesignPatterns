package abstractfactory;

import abstractfactory.boss.BossCap;
import abstractfactory.boss.BossJeans;
import abstractfactory.boss.BossShoes;
import abstractfactory.boss.BossTshirt;
import abstractfactory.interfaces.Cap;
import abstractfactory.interfaces.Jeans;
import abstractfactory.interfaces.Shoes;
import abstractfactory.interfaces.Tshirt;

// Konkreettinen tehdas: määrittelee luontioperaatioiden toteutukset
public class BossConcreteFactory extends AbstractClothesFactory {

    @Override
    public Jeans createJeans() {
        return new BossJeans();
    }
    @Override
    public Tshirt createTshirt() {
        return new BossTshirt();
    }

    @Override
    public Cap createCap() {
        return new BossCap();
    }

    @Override
    public Shoes createShoes() {
        return new BossShoes();
    }
}
