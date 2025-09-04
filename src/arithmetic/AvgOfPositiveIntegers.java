package arithmetic;

import java.util.Arrays;
import java.util.List;

public class AvgOfPositiveIntegers {

    public static double findAvgOfIntegers(List<Integer> numbers){
        double sum =0;
        int count =0;
        if(numbers == null || numbers.isEmpty()){
            return 0.0;
        }

        for(int number : numbers){
            if(number > 0){
                sum += number;
                count += 1;
            }
        }
        return (sum/count);
    }

    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> numbers2 = Arrays.asList(1,2,3,-4,5,-6,7);
        System.out.println(findAvgOfIntegers(numbers2));




    }
}
