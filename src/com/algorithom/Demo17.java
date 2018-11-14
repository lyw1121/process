package com.algorithom;


/**
 *  题目：猴子吃桃问题，猴子第一天摘下若干桃子，当即吃了一半，还不过瘾，又多吃了一个，第二天早上又将剩下的吃了一半，又多吃了一个。
 *        以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少
 */
public class Demo17 {
    public static void main(String[] args) {
        int sum=1;
        for (int i=1; i<10 ;i++){
           sum = (sum+1)*2;            //逆推理过程：从最后一天开始加，因为每次都是剩下(sum/2-1)个
        }
        System.out.println("第一天共摘下 "+sum+" 个桃子");
    }
}
