import java.util.List;

public class LineAfterEveryThirdItem implements ListConverterStrategy {
        @Override
        public String listToString(List<String> list) {
            String s = "";
            int x = 0;
            for(int i = 0 ; i<list.size();i++){
                s += list.get(i)+ " ";
                x++;
                if(x == 3 ){
                    x = 0;
                    s+= "\n";
                }
            }
            return s;

    }
}
