package Javarush.task0814;

//package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> numbers = new HashSet<Integer>();

        numbers.add(81);
        numbers.add(32);
        numbers.add(75);
        numbers.add(44);
        numbers.add(33);

        numbers.add(45);
        numbers.add(53);
        numbers.add(90);
        numbers.add(91);
        numbers.add(80);

        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(13);
        numbers.add(22);

        numbers.add(34);
        numbers.add(65);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        return numbers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        for (Integer i : set) {
            set.removeIf(x -> x > 10);
        }
        return set;
    }

    public static void main(String[] args) {
        //System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}































