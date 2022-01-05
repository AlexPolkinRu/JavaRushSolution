package Javarush.task0818;

//package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("Первый", 1000);
        salaries.put("Второй", 100);
        salaries.put("Третий", 900);
        salaries.put("Четвертый", 200);
        salaries.put("Пятый", 800);

        salaries.put("Шестой", 300);
        salaries.put("Седьмой", 700);
        salaries.put("Восьмой", 400);
        salaries.put("Девятый", 600);
        salaries.put("Десятый", 500);

        return salaries;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String,Integer> copy = new HashMap<>(map);
        for(Map.Entry<String,Integer> pair : copy.entrySet()){
            if (pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(System.nanoTime());
    }
}






























