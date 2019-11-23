package com.study;

import java.util.*;

public class MapTest {
    public static void main(String[]args){

        //map集合的foreach遍历
        Map<Integer,String> map = new HashMap<Integer, String>();
        TreeMap<String,String> treeMap = new TreeMap<>();
        map.put(1,"一");
        map.put(4,"二");
        map.put(5,"三");
        map.put(9,"四");
        map.put(10,"五");
        map.put(3,"六");
        //map.put(null,"dddddd");
        for (Integer key : map.keySet()){
            System.out.println("输出键："+key);
        }
        for (String value :map.values()){
            System.out.println("输出值："+value);
        }
        System.out.println("*********---------------------------------------*********");

       Map<String,HashSet<String>> setMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("interesting");
        hashSet.add("so");
        hashSet.add("wondful");
        setMap.put("first",hashSet);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("boring");
        hashSet1.add("just");
        hashSet1.add("terriable");
        setMap.put("second",hashSet1);
        for(Map.Entry e : setMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //通过interatort 迭代器遍历
        System.out.println("*****************************************");
        Iterator<Map.Entry<String,HashSet<String>>> iterator = setMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,HashSet<String>> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
