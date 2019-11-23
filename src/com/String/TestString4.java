package com.String;

/**
 * @author wangyl
 * @date 2019/6/25 22:05
 */

/**
 * final String bb = getBB();其实与final String bb = new String(“b”);是一样的。
 * 也就是说return “b”会在堆中创建一个String对象保存”b”，虽然bb被定义成了final。
 * 可见并非定义为final的就保存在常量池中，很明显此处bb常量引用的String对象保存在堆中，因为getBB()得到的String已经保存在堆中了，
 * final的String引用并不会改变String已经保存在堆中这个事实。
 */
public class TestString4 {
    public static void main(String[] args) {
        String a = "ab";
        final String bb = getBB();
        String b = "a" + bb;
        System.out.println(a == b);        // false
    }

    private static String getBB() {
        return "b";
    }
}
