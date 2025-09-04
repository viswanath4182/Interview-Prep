package strings;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueString {
    public static void main(String[] args) {

//        List<String> str1 = Arrays.asList("vvv","sss","bbb");
//        List<String> str2 = Arrays.asList("nnn","mmm","vvv");
//
//        String val = Stream.concat(str1.stream(), str2.stream()).distinct().filter(s -> s.equals("vvv")).collect(Collectors.joining());
//        System.out.println(val);
        Set<String> names = Set.of("vvv","","nnn");
//        names.add("david");
//        names.add("smith");
//        names.add("0");
        System.out.println(names);







    }
}
