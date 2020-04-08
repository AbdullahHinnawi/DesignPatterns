
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {

    private List<String> list;
    private ListConverterStrategy strategy;

    public Converter(ListConverterStrategy strategy){
        this.strategy = strategy;
        this.list = new ArrayList<>();
    }
    public void add(String[] array){
        list.addAll(Arrays.asList(array));
    }
    public void print(){
        System.out.println(strategy.listToString(list));
    }

    public void setStrategy(ListConverterStrategy strategy){
        this.strategy = strategy;
    }
}
