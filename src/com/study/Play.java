package com.study;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Play {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>() {
            private static final long serialVersionUID = 1L;

            {
                add("一");
                add("二");
                add("三");
                add("四");
                add("五");
                add("六");
                add("七");
                add("八");
            }
        };
        List<String> now = new ArrayList<String>(all);
        List<String> used = new ArrayList<String>();
        Date date = new Date();        //取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        for (int j = 0; j < all.size() * 5; j++) {
            if (j % all.size() == 0) {
                System.out.println("------------------------------------");
            }
            now.removeAll(used);
            if (now.size() == 0) {
                used.clear();
                now = new ArrayList<>(all);
            }
            Random me = new Random();
            int i = me.nextInt(now.size());
            String s = now.get(i);

            calendar.add(calendar.DATE, 1);
            date = calendar.getTime();
            calendar.setTime(date);
            String  dateStr = DateFormat.getDateInstance(DateFormat.FULL).format(date);
            System.out.println( dateStr+ ":" + "选中：" + s);
            used.add(s);
        }
    }

}


