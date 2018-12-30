package com.dp;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    private static int i;
    private static int i1;
    private static int i11;

    public HelloWorld() {
    }

    public static void main(String[] args) {
        getList();
    }

    private static void getList() {
        System.out.println("hellowqorld!");


        //region Description
        System.out.println("hellowqorld!");
        ArrayList list = new ArrayList();
        list.add("sa");
        final Date date = new Date();
//        method1();
        //endregion
        System.out.println(list);
    }

    public static void method1() {
        int i = 10;

        try {
            FileInputStream fis = new FileInputStream(new File("text.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
