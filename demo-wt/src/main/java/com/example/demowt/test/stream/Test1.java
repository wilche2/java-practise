package com.example.demowt.test.stream;

import com.example.demowt.test.view.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caowq
 * @date 2021-08-25 11:30
 */
public class Test1 {

    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        String[] strs = { "aaa", "bbb", "ccc" };
        Arrays.stream(strs).map(str -> str.split("")).forEach(System.out::println);// Ljava.lang.String;@53d8d10a
        Arrays.stream(strs).map(str -> str.split("")).flatMap(Arrays::stream).forEach(System.out::println);// aaabbbccc
        Arrays.stream(strs).map(str -> str.split("")).flatMap(str -> Arrays.stream(str)).forEach(System.out::println);// aaabbbccc
    }

    public static void test2() {
        Student s = new Student();
        s.setList(getList1());

        new Thread(() -> {
            try {
                Thread.sleep(99);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s.setList(getList2());
            System.out.println("s.getList线程内 = " + Arrays.toString(s.getList().toArray()));
        }).start();

        System.out.println("s.getList线程外，for循环前 = " + Arrays.toString(s.getList().toArray()));
        for (Integer i : s.getList()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i = " + i);
        }
        System.out.println("s.getList线程外，for循环后 = " + Arrays.toString(s.getList().toArray()));
    }

    private static List<Integer> getList1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        return list;
    }

    private static List<Integer> getList2() {
        List<Integer> list = new ArrayList<>();
        list.add(1000003);
        list.add(1000004);
        return list;
    }

}
