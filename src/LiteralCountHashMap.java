import java.util.*;
import java.lang.*;
public class LiteralCountHashMap {
    public static void main(String[] args) {
        String name = "viswanath";
        Map<Character,Integer> countNames = new HashMap<>();

        for(char ch : name.toCharArray()){
            int count = (countNames.getOrDefault(ch, 0) + 1);

            countNames.put(ch,count);
        }
        System.out.println(countNames);
    }

}
