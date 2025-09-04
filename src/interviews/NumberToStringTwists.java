package interviews;

import java.util.Arrays;

public class NumberToStringTwists {


    public static String[] numberToString(int n){

        String[] s = new String[n];

        for(int i=1;i<=n;i++){

            if(i%15==0){
                s[i-1]="FizBuzz";
            }
            else if(i%3==0){
                s[i-1]="Buzz";
            }
            else if(i%5==0){

                s[i-1]="Fizz";

            }
            else {
                s[i-1] = String.valueOf(i);
            }


        }
        return s;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberToString(45)));


    }
}
