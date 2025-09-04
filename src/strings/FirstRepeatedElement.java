package strings;

import java.util.HashSet;
import java.util.Set;


public class FirstRepeatedElement {

    static Character repeated() {

        Set<Character> elements = new HashSet<>();

        for (Character ch : "vis".toCharArray()) {

            if (!elements.add(ch)) {
                return ch;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(repeated());



    }
}


