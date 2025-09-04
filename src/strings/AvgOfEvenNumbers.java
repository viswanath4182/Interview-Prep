package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvgOfEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,5,8,45,65,78,89,90);
        //Integer sumOfEvenNumbers = numbers.stream().filter(integer -> integer % 2 == 0).reduce(0,Integer::sum);
        //OR
        int sumOfEvenNumbers = numbers.stream().filter(integer -> integer%2==0).mapToInt(Integer::intValue).sum();
        //System.out.println(sumOfEvenNumbers);
        System.out.println(sumOfEvenNumbers);

    }
}
