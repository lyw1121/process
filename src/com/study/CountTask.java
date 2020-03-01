package com.study;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @author wangyl
 * @date 2020/3/1 9:39
 *
 * 并发框架 fork/join 框架实例：必须继承RecursiveTask
 * 计算任务：计算1+2+3+....+28
 */
public class CountTask extends RecursiveTask<Integer> {

    // 阈值
    private final static int THRESHOLD = 2;
    // 计算任务开始值
    private int start;
    // 计算任务结束值
    private int end;
    public CountTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    /**
     *  ForkJoinTask与一般的任务区别在于需要实现compute方法
     */
    @Override
    protected Integer compute() {
        int sum = 0;
        // 如果拆分任务足够小 则直接计算
        boolean canCompute = (end - start) <= THRESHOLD;
        if (canCompute){
            for (int i = start; i <= end; i++){
                sum +=i;
            }
        }else {
            // 如果任务大于阈值，则分裂成两个子任务计算
            int middle = (start + end) / 2;
            CountTask leftTask = new CountTask(start, middle);
            CountTask rightTask = new CountTask(middle + 1, end);
            // 执行子任务:调用frok方法时,程序会调用ForkJoinWorkerThread的pushTask方法异步执行任务，再返回结果
            leftTask.fork();
            rightTask.fork();
            // 等待子任务执行完成，并得到其结果
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();
            // 合并子任务
            sum = leftResult + rightResult;
        }
        return sum;
    }

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CountTask task = new CountTask(1,28);
        // 执行任务
        Future<Integer> result = forkJoinPool.submit(task);
        try {
            System.out.println(result.get());
        }catch (Exception e){
        }
    }
}
