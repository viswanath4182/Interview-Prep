package interviews;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    static int[] productArray(int[] numbers){
        int n=numbers.length;
        int[] result = new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*numbers[i-1];
        }
        int rightProduct=1;
        for(int i=n-1;i>=0;i--){
            result[i] *= rightProduct;
            rightProduct=rightProduct*numbers[i];
        }
        return result;

    }


    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(productArray(numbers)));

    }
}
