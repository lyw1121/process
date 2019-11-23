package com.dfsandhfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author wangyl
 * @date 2019/6/21 16:13
 */
public class DeepFirstSort {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        head.rightNode = three;
        head.leftNode = second;
        second.rightNode = five;
        second.leftNode = four;
        three.rightNode = seven;
        three.leftNode = six;
        System.out.println("广度优先遍历结果：");
        new DeepFirstSort().broadFirstSearch(head);
        System.out.println();
        System.out.println("深度优先遍历结果：");
        new DeepFirstSort().deptFirstSearch(head);

    }

    // 广度优先遍历使用队列实现
    public void broadFirstSearch(TreeNode nodeHead){
        if (nodeHead == null){
            return;
        }
        Queue<TreeNode> myQueue = new LinkedList<>();  // 创建一个存放树节点的队列
        myQueue.add(nodeHead);
        while (!myQueue.isEmpty()){                    // 队列是先进先出
            TreeNode node = myQueue.poll();
            System.out.print(node.data+" ");
            if (node.leftNode != null){
                myQueue.add(node.leftNode);
            }
            if (node.rightNode != null){
                myQueue.add(node.rightNode);
            }
        }
    }

    // 深度优先遍历
    public void deptFirstSearch(TreeNode nodeHead){
        if (nodeHead == null){
            return;
        }
        Stack<TreeNode> myStack = new Stack<>();     // 深度优先遍历采用栈来存储树节点
        myStack.add(nodeHead);
        while (!myStack.isEmpty()){
            TreeNode node = myStack.pop();    // 弹出栈顶元素
            System.out.print(node.data+" ");
            if (node.rightNode != null){
                myStack.push(node.rightNode);
            }
            if (node.leftNode != null){
                myStack.push(node.leftNode);    // 深度优先遍历，此处采用先序遍历，先遍历左边后遍历右边，栈是先进后出的，所有顺序要相反
            }
        }
    }
}