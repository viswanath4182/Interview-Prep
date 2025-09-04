package strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMostRepeatedString {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("david","smith","king","king","smith","king");
//        List<Map.Entry<String, Long>> nameCount = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
//                entrySet()
//                .stream().filter(stringLongEntry -> stringLongEntry.getValue()>=2).toList();
        Map<String, Long> nameCount = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //int max = Math.toIntExact(Collections.max(nameCount.values()));
//        for(Map.Entry<String,Long> v : nameCount.entrySet()) {
//            if (v.getValue() >= max) {
//                System.out.println(v);
//
//            }
//        }
        //Optional<Map.Entry<String,Long>> secondMost = nameCount.entrySet().stream().sorted((Map.Entry<String,Long>.comparingByValue().reversed().skip(1).findFirst();



    }
}
