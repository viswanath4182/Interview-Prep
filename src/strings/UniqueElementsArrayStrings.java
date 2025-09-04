package strings;

import java.util.HashMap;
import java.util.Map;

public class UniqueElementsArrayStrings {

    static void uniqueElements(String[] array){
        Map<String,Integer> uniqueElements = new HashMap<>();
        for(String str: array){

            uniqueElements.put(str, uniqueElements.getOrDefault(str,0)+1);
        }
        for(Map.Entry<String,Integer> map : uniqueElements.entrySet()){
            if(map.getValue()==1){
                System.out.println(map.getKey());
            }
        }
    }


    public static void main(String[] args) {

        String[] elements = {"hdd","david","david","smith","smith"};

        uniqueElements(elements);



    }
}
