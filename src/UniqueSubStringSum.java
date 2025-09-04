import java.util.HashSet;
import java.util.stream.IntStream;
public class UniqueSubStringSum {
    public static int sumOfUniqueSubstrings(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        HashSet<String> uniqueSubstrings = new HashSet<>();
        IntStream.range(0, str.length())
                .forEach(i -> IntStream.range(i + 1, str.length() + 1)
                        .forEach(j -> uniqueSubstrings.add(str.substring(i, j)))
                );

        return uniqueSubstrings.stream()
                .mapToInt(String::length)
                .sum();
        //return uniqueSubstrings.toArray().length;
    }

    public static void main(String[] args) {
        String input = "aaaaaa";
        int result = sumOfUniqueSubstrings(input);
        System.out.println("Sum of lengths of unique substrings: " + result); // Output: 25
    }

}
