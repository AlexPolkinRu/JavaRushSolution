package Javarush.task09.task0926;

//package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/*
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1,2,3,4,5});
        list.add(new int[]{1,2});
        list.add(new int[]{1,2,3,4});
        list.add(new int[]{1,2,3,4,5,6,7});
        list.add(new int[0]);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
