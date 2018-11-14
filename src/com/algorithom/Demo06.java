package com.algorithom;

import java.util.*;

public class Demo06 {

    //（BFS）广度优先搜索算法
    public static void main(String[]args){
  /**      List<String> linkList = new LinkedList<>();
        linkList.add("ab");
        linkList.add("cd");
        linkList.add("ef");
        linkList.add("gh");
        System.out.println("入队列：");
        System.out.println(linkList);
        linkList.remove(0);
        System.out.println("出队列：");
        System.out.println(linkList);
        System.out.println("第一个元素:"+linkList.get(0));
        System.out.println(linkList.contains("gh"));  //对比判断集合中是否存在此元素 结果为boolean型 true or false

        LinkedList ll = new LinkedList();

        List<String> arrylist = new ArrayList<>(Arrays.asList("I","will","go","home","by","train"));
        arrylist.add("feel");
        arrylist.add("exscited");
        System.out.println("输出列表："+arrylist.toString());
**/
        search("you");

    }
    //以map集合作为图的各个节点与相邻节点的关系
     public static void search(String name){
        Map<String,List<String>> map = new HashMap<>();
        List<String> one = new ArrayList<>(Arrays.asList("alice","bob","claire"));
        map.put("you",one);

        List<String> two = new ArrayList<>(Arrays.asList("peggy"));
        map.put("alice",two);

        List<String> three = new ArrayList<>();
        map.put("peggy",three);

        List<String> foure = new ArrayList<>(Arrays.asList("peggy","anuj"));
        map.put("bob",foure);

        List<String> five = new ArrayList<>();
        map.put("anuj",five);

        List<String> six = new ArrayList<>(Arrays.asList("thom","jonny"));
        map.put("claire",six);

        List<String> serven = new ArrayList<>();
        map.put("thom",serven);


        List<String> eight = new ArrayList<>();
        map.put("jonny",eight);

        LinkedList<String> queue = new LinkedList<>();    //queue队列用来进行各个节点和相邻节点的入队操作

        map.get(name).forEach(queue::addLast);

        List<String> searched = new ArrayList<>();
        while (!queue.isEmpty()){
            String i=queue.removeFirst();
            System.out.println("出队列节点："+i);
            if(!searched.contains(i)){
                if(i.equals("thom")){
                    System.out.println("找到目的地："+i);
                    return;
                }else {
                    map.get(i).forEach(queue::addLast);
                    searched.add(i);
                }
            }
        }
    }
}






