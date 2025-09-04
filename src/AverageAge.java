import java.util.*;

public class AverageAge {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(new Person(100),
                                                new Person(123));


        double averageAge = persons.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println(averageAge);
    }
}
