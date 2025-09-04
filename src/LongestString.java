import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestString {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("vnfj", "ndhjdnd", "bdhfkksls");
        List<String> strNumbers = List.of("1","2","3","4","5");
        //List<String> strNumbers2 = Arrays.asList("1","2","3","4","5");
        List<Integer> parseInt = strNumbers.stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        System.out.println(parseInt);
        Optional<String> longestString = names.stream().max(Comparator.comparingInt(String::length));
        System.out.println(longestString);
        Map<String, Integer> stringCount = names.stream().collect(Collectors.toMap(value -> value, String::length));
        System.out.println(stringCount);



        String initialString = "viswanath";
        Map<Character,Integer> occurenceMap = new HashMap<>();



        for(char i : initialString.toCharArray()){

            int count = (occurenceMap.getOrDefault(i, 0)) + 1;
            occurenceMap.put(i, count);

        }
        System.out.println(occurenceMap);

    }
}
