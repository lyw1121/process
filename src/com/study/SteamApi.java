package com.study;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author wangyl
 * @date 2019/8/11 9:52
 */
public class SteamApi {

    /**
     * Stream API 借助于同样新出现的 Lambda 表达式，极大的提高编程效率和程序可读性。
     * 同时它提供串行和并行两种模式进行汇聚操作，并发模式能够充分利用多核处理器的优势，使用 fork/join 并行方式来拆分任务和加速处理过程。
     */
    public static void main(String[] args) {
        List<String> arryList = new ArrayList<>();
        arryList.add("one");
        arryList.add("two");
        arryList.add("three");
        arryList.add("four");
        arryList.add("five");
        arryList.add("five");
        Stream<String> arryList2 = arryList.stream();                // 创建普通流
        Stream<String> stringStream = arryList.parallelStream();     // 创建并行流
        System.out.println(arryList2.distinct().count());            // distinct()方法是去重
    }

    /**
     * map:转换流 将一种类型的流转换为另一种类型的流
     */
    @Test
    public void testMapSream() {
        String[] arry = new String[]{"one", "ONE", "two", "TWO", "three", "THREE", "four", "FOUR", "five", "FIVE"};
        // 将中的大写字母转换为小写字母
        Arrays.stream(arry).map(x -> x.toLowerCase())
                .forEach(System.out::println);
        Arrays.stream(arry).map(x -> x.isEmpty())
                .forEach(System.out::println);
    }

    /**
     * 并行流
     */
    @Test
    public void testParallelStream() {
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);
        lists.add(6);
        Optional<Integer> sum = lists.parallelStream().reduce((a, b) -> a + b);
        if (sum.isPresent()){
            System.out.println("list的总和为："+ sum.get());
        }
        //
        int reduce = IntStream.rangeClosed(0,5)
                .parallel()
                .sum();
        System.out.println(reduce);
    }

    @Test
    public void testCollect(){
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        Integer product = lists.parallelStream().reduce(1, (a, b) -> a *  (b * 2),
                (a, b) -> a * b);
        System.out.println("product:" + product);
    }
}
