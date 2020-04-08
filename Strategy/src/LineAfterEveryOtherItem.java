import java.util.Iterator;
import java.util.List;

public class LineAfterEveryOtherItem implements ListConverterStrategy {
    @Override
    public String listToString(List<String>list) {
        String s = "";
        for(int i = 0 ; i<list.size();i++){
            s += list.get(i)+ " ";
            if(i % 2 != 0){
                s+= "\n";
            }
        }
        return s;
    }
}
