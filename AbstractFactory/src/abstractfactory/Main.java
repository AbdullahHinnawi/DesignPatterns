package abstractfactory;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception {

        // There are two methods present in Reflection API which we can use to create objects

        // 1. Class.newInstance() → Inside java.lang package:
        // Class.newInstance() internally itself use the Constructor.newInstance() to create the object
        AbstractClothesFactory adidasFactory = AdidasConcreteFactory.class.newInstance();
        // another way to use Class.newInstance()
        // AbstractClothesFactory adidasFactory = (AdidasConcreteFactory) Class.forName("abstractfactory.AdidasConcreteFactory").newInstance();

        // 2. Constructor.newInstance() → Inside java.lang.reflect package
        // In order to use Constructor.newInstance() method we first need to get constructor object for
        // that class and then we can call newInstance() on it to create objects
        Constructor<BossConcreteFactory> constructor = BossConcreteFactory.class.getConstructor();
        AbstractClothesFactory bossFactory = constructor.newInstance();

        Jasper jasper = new Jasper();
        jasper.chooseFactory(adidasFactory);
        System.out.println("-----------------------------");
        jasper.chooseFactory(bossFactory);
    }

}
