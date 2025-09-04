package strings;

public class SecondLargestElementUsingForLoop {

    static int secondLargest(int[] numbers){

        if(numbers == null || numbers.length<2){
            throw new IllegalArgumentException("array should contain min two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num:numbers){
            if(num > largest){
                secondLargest=largest;
                largest=num;
            }else if (num > secondLargest && num!=largest){
                secondLargest=num;

            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            throw new RuntimeException("No second element was found or all elements are equal");
        }
        return secondLargest;


    }

    public static void main(String[] args) {

        int[] numbers = {1,45,65,34,54,76,109,250};

        System.out.println(secondLargest(numbers));

    }
}
