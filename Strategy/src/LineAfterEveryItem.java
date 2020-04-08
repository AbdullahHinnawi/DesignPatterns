
import java.util.Iterator;
import java.util.List;

public class LineAfterEveryItem implements ListConverterStrategy {
    @Override
    public String listToString(List<String> list) {
        String s = "";
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            s += iterator.next() + "\n";
        }
        return s;

    }
}
