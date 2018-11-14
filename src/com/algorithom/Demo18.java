package com.algorithom;

/**
 * 两个乒乓球队进行比赛，各出三个人，甲队是a,b,c 乙队是x,y,z 已经抽签决定比赛名单，有人向队员打听比赛的名单，
 * a说他不和x比，c说他不和x,z 比，请找出三队赛手的名单
 */
public class Demo18 {
    public static void main(String[] args) {
        char a;
        char b;
        char c;
        for (a='x';a<='z';a++){
            for (b='x';b<='z';b++){
                if (a!=b){
                    for (c='x';c<='z';c++){
                        if (a!='x'&&c!='x'&&c!='z'&&a!=c&&b!=c){
                            System.out.println("a vs "+a);
                            System.out.println("b vs "+b);
                            System.out.println("c vs "+c);
                        }
                    }
                }
            }
        }
    }
}
