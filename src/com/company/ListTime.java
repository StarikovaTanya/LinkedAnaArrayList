package com.company;
import java.util.*;
public class ListTime {
    private static final int NumElement = 100 * 1000;
    public static void main(String[] args) {
	// write your code here
        List arrayList = new ArrayList();
        for (int i = 0; i < NumElement; i++) {
            arrayList.add(i);
        }
        AddandRemoveToFirst(arrayList);
        AddandRemoveToFirst(new LinkedList(arrayList));
        AddandRemoveToMiddle(arrayList);
        AddandRemoveToMiddle(new LinkedList(arrayList));
        AddandRemoveToEnd(arrayList);
        AddandRemoveToEnd(new LinkedList(arrayList));
    }
    public static void AddandRemoveToFirst(List list) {
        long time = System.currentTimeMillis();//�����������
        // long time=System.nanoTime(); //�����������
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
            list.remove(0);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("в начало " +
                list.getClass().getSimpleName() + " время " + time);
    }
    public static void AddandRemoveToMiddle(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(NumElement / 2, new Object());
            list.remove(NumElement / 2);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("в середину    " +
                list.getClass().getSimpleName() + " время " + time);
    }
    public static void AddandRemoveToEnd(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(new Object());
            list.remove(NumElement);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("в конец      " +
                list.getClass().getSimpleName() + " время " + time);
    }
}
