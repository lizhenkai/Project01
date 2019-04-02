package com.lizk.java;

import java.util.ArrayList;

/**
 * @author lizk
 * @describe
 * @create 2019-04-02 15:33
 */
public class Templates {
//    prsf
//    private static final
    //psf
//    public static final
//    psfi
//    public static final int
//    psfs
//    public static final String

    public static void main(String[] args) {
        System.out.println("hello");
        int num = 10;
        //soutp  形参打印
        //soutv 参数打印
        System.out.println("num = " + num);
        String[] a = new String[]{"a","b"};

        //fori 循环
        for (int i = 0; i < a.length; i++) {
            
        }
        //iter forecah
        for (String s : a) {

        }
        //itar
        for (int i = 0; i < a.length; i++) {
            String s = a[i];

        }

        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        //list.for
        for (Object o : list) {
            
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //list.forr 倒序
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method(){
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }

        //list.null
        if (list == null) {

        }
        //list.nn
        if (list != null) {

        }

    }
}
