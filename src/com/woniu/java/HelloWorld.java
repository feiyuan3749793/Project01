package com.woniu.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

//你好吗
public class HelloWorld {

    
    public static void main(String[] args){
        System.out.println("你好");
        ArrayList  s = new ArrayList<>();
        s.add(2);
        s.add(3);
        s.add(4);


        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));

        }


        try {
            FileOutputStream ss = new FileOutputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }


    }


}
