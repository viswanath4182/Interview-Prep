import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedLists {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3,5,7,8,9,23,45,65,45,65,5,3);
        List<Integer> list2 = Arrays.asList(43,23,12,32,34,54,67);
        List<Integer> sortedLists = Stream.concat(list1.stream(), list2.stream()).sorted().toList();
        System.out.println(sortedLists);
        List<Integer> intersectionList = list1.stream().filter(list2::contains).toList();
        System.out.println(intersectionList);
        List<Integer> unique = list1.stream().distinct().toList();
        System.out.println(unique);


    }
}
