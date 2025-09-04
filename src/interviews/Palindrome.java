package interviews;

public class Palindrome {
    public static void main(String[] args) {
        String str = "1a1";
        System.out.println(isPall(str));
    }

    public static boolean isPall(String str){

        int left = 0;
        int right = str.length() -1;

        if(str.isEmpty()){
            return false;
        }

        while(left < right){
            char cLeft = Character.toLowerCase(str.charAt(left));
            char cRight = Character.toLowerCase(str.charAt(right));

            if(!Character.isLetter(cLeft)){
                left++;
                continue;
            }
            if(!Character.isLetter(cRight)){
                right--;
                continue;
            }
            if(cLeft != cRight){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
