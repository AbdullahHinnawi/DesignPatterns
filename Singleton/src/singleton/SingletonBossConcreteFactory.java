package singleton;

import singleton.boss.BossCap;
import singleton.boss.BossJeans;
import singleton.boss.BossShoes;
import singleton.boss.BossTshirt;
import singleton.interfaces.Cap;
import singleton.interfaces.Jeans;
import singleton.interfaces.Shoes;
import singleton.interfaces.Tshirt;

// Konkreettinen tehdas: määrittelee luontioperaatioiden toteutukset
public class SingletonBossConcreteFactory extends AbstractClothesFactory {

    private static SingletonBossConcreteFactory INSTANCE = null;

    private SingletonBossConcreteFactory() {}

    public static SingletonBossConcreteFactory getInstance() {

        if(INSTANCE==null){
            INSTANCE = new SingletonBossConcreteFactory();
        }
        return INSTANCE;
    }

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
