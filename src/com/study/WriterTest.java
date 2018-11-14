package com.study;

import java.io.*;

//文件字节输入流和输出流的操作

public class WriterTest {
    public static void main(String [] args) throws IOException {
        String inFile = "D:\\Java\\wang\\pom.xml";
        String outFile = "D:\\Java\\wang\\pom.xml.bak";
        FileInputStream in = new FileInputStream(new File(inFile));
        FileOutputStream out = new FileOutputStream(new File(outFile));
        byte[] buf = new byte[1024];
        int len=0;
        FileReader fileReader = new FileReader(inFile);
        System.out.println(in.getChannel().size());
        while ((len = in.read(buf))!=-1){
            boolean b = (len = in.read(buf)) != -1;     //in.read()=-1时代表读取完毕
            System.out.println(b+","+len);
            out.write(buf,0,len);
            out.flush();
        }

//        BufferedInputStream in = new BufferedInputStream(new StringReader(read(inFile)));inFile
    }
}
