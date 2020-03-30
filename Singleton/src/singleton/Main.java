package singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws Exception {

        Class c = null;
        AbstractClothesFactory adidasFactory= null;
        AbstractClothesFactory bossFactory= null;
        Properties properties = new Properties();
        Jasper jasper = new Jasper();

        try{
            properties.load(new FileInputStream("src/application.properties"));
        }catch(IOException e){
            e.printStackTrace();
        }


        // Luetaan Adidas tehdas (toteuttava tehdas) application.properties tiedostosta
        // Class Class<T>:https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html
        // Class Method : https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html
        c = Class.forName(properties.getProperty("adidas"));
        Method method = c.getMethod("getInstance");
        adidasFactory = (AbstractClothesFactory) method.invoke(null);


        jasper.chooseFactory(adidasFactory);

        System.out.println("-----------------------------");

        // Luetaan Boss tehdas (toteuttava tehdas) application.properties tiedostosta
         c = Class.forName(properties.getProperty("boss"));
        bossFactory = (AbstractClothesFactory) c.getMethod("getInstance").invoke(null);

        jasper.chooseFactory(bossFactory);

    }

}
