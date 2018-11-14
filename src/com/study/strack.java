package com.study;

public class strack {
    //链表节点
    public static class ListNode{
        int vaule;
        ListNode nextNode=null;
        public  ListNode(int val){
            vaule = val;
        }
    }
    public static void main (String [] args){
        System.out.println("合并两个有序链表");
        //两个升级链表创建及打印
        //创建链表1
        ListNode head1 = new ListNode(1);
        ListNode temp1 = head1;
        temp1.nextNode = new ListNode(3);
        temp1 = temp1.nextNode;
        temp1.nextNode = new ListNode(6);
        //打印链表1
        ListNode printTemp1=head1;
        System.out.print("链表1：");
        while (printTemp1!=null){
            System.out.print(printTemp1.vaule+" ");
            printTemp1 = printTemp1.nextNode;
        }
        //创建链表2
        ListNode head2 = new ListNode(0);
        ListNode temp2 = head2;
        temp2.nextNode = new ListNode(5);
        temp2=temp2.nextNode;
        temp2.nextNode = new ListNode(8);
        temp2=temp2.nextNode;
        temp2.nextNode = new ListNode(9);
        //打印链表2
        ListNode printTemp2 = head2;
        System.out.println();
        System.out.print("链表2: ");
        while (printTemp2!=null){
            System.out.print(printTemp2.vaule+" ");
            printTemp2 = printTemp2.nextNode;
        }
        //进行合并
        ListNode newHead = solution(head1,head2);
        //打印新链表
        ListNode printNew = newHead;
        System.out.println();
        System.out.print("新链表：");
        while (printNew!=null){
            System.out.print(printNew.vaule+" ");
            printNew = printNew.nextNode;
        }
    }
    public static ListNode solution(ListNode head1,ListNode head2){
        ListNode newHead = null,temp3;
        ListNode temp1 = head1,temp2 = head2;
        //新链表表头
        newHead = temp1.vaule<temp2.vaule?temp1:temp2;
        temp3 = newHead;
        //将表头移除我们下面的判定
        if(newHead.equals(temp1)){
            temp1 = temp1.nextNode;
        }else {
            temp2 = temp2.nextNode;
        }
        //循环
        while (temp1!=null&&temp2!=null){
            temp3.nextNode = temp1.vaule<temp2.vaule?temp1:temp2;
            //temp3 = newHead;
            temp3 = temp3.nextNode;
            if (temp3.equals(temp1)){
                temp1 = temp1.nextNode;
            }else {
                temp2 = temp2.nextNode;
            }
        }
        //当一个链表被合并完成，把另一个未合并完的链表继续合并
        while (temp1!=null){
            temp3.nextNode = temp1;
            temp3 = temp3.nextNode;
            temp1 = temp1.nextNode;
        }
        while (temp2!=null){
            temp3.nextNode = temp2;
            temp3 = temp3.nextNode;
            temp2 = temp2.nextNode;
        }
        //合并完成，返回新链表表头
        return newHead;
    }
}
