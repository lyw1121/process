package com.study;

public class User {
    String name ;
    Boolean isVip = false ;
    void checkIsVip(Boolean isVip){
        if(isVip){
            System.out.println("是会员");
        }else {
            System.out.println("不是会员");
        }

    }
    public static void main(String [] args){
        User user1 = new User();
        user1.name = "虞世南";
        user1.isVip = false;

        User user2 = new User();
        user2.name = "欧阳询";
        user2.isVip = true;

        User user3 = new User();
        user3.name = "柳公权";
        user3.isVip = false;

        User user4 = new User();
        user4.name = "颜真卿";
        user4.isVip = true;

        User[] allUser = new User[] {user1,user2,user3,user4};
        for ( User user : allUser) {
            System.out.print(user.name);
            user.checkIsVip(user.isVip);

        }


    }
}
