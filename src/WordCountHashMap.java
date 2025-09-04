import java.util.*;
import java.lang.*;

public class WordCountHashMap {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("david","smith","david","smith");
        Map<String,Integer> countNames = new HashMap<>();

        for(String name : names){
            int count = (countNames.getOrDefault(name, 0) + 1);

            countNames.put(name,count);
        }
        System.out.println(countNames);
    }
}
