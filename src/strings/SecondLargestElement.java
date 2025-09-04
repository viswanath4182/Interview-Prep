package strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargestElement {

    public static void main(String[] args) {


        int[] numbers = {1,4,5,76,54,67};

        Optional<Integer> secondLargest = Arrays.stream(numbers).distinct().
                boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        System.out.println(secondLargest);




    }
}
