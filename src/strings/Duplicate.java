package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {

        List<Integer> elemnets = Arrays.asList(1,2,2,3,4,5,6);
        Set<Integer> seen = new HashSet<>();

        Set<Integer> noDuplicates = elemnets.stream().filter(integer -> !seen.add(integer)).collect(Collectors.toSet());
        System.out.println(noDuplicates);

    }
}
