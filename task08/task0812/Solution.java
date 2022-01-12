package Javarush.task08.task0812;

//package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int repeats = 1;
        int maxRepeats = 1;
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1).equals(list.get(i))) {
                repeats++;
            } else {
                repeats = 1;
            }
            if (repeats > maxRepeats) {
                maxRepeats = repeats;
            }
//            System.out.println(list.get(i) + " " + repeats + " " + maxRepeats);
        }
        System.out.println(maxRepeats);
    }
}






























