package Collections;

import java.util.*;

public class RandomizedSet {


    List<Integer> list;
    Map<Integer,Integer> map;
    Random random;
    public RandomizedSet(){

        list=new ArrayList<>();
        map=new HashMap<>();
    }
    public boolean insert(int val){

        if(map.containsKey(val)) return false;
        int index = list.size()-1;
        list.add(index,val);
        map.put(val,index);
        return true;

    }
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int index=map.get(val);
        int lastElement=list.get(list.size()-1);
        list.set(index,lastElement);
        map.put(lastElement,index);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    public int random(){
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);

    }



    public static void main(String[] args) {

        RandomizedSet rs = new RandomizedSet();
//        System.out.println(rs.insert(10));
//        System.out.println(rs.remove(10));
//        System.out.println(rs.random());

        }
}

