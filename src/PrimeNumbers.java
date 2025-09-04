import java.util.*;
import java.lang.*;
public class PrimeNumbers {

    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    void printPrime() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean containsPrime = numbers.stream()
                .anyMatch(this::isPrime);
        System.out.println("List contains a prime number: " + containsPrime);

    }

    public static void main(String[] args) {

        PrimeNumbers p = new PrimeNumbers();
        p.printPrime();

    }
}