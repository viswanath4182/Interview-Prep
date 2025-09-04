package strings;

public class FindSubString {

    static int findIndexOfSubString(String parent, String child){

        for(int i=0,j=child.length();j<=parent.length();i++,j++){
            if(parent.substring(i,j).equals(child)){
                return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {

        System.out.println(findIndexOfSubString("neelofer", "neelo"));

    }
}
