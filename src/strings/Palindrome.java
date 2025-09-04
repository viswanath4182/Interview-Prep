package strings;

public class Palindrome {

    public static void main(String[] args) {

        String palString = "dghdjs";
        String reverseString ="";
        for(int i=palString.length()-1;i>=0;i--){
            reverseString=reverseString+palString.charAt(i);

        }
        if(palString.equalsIgnoreCase(reverseString)){
            System.out.println(palString + " " + "is a Palindrome string");
        }
        else {
            System.out.println("Not a palindrome string");
        }

    }
}
