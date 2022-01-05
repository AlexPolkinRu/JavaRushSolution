package Javarush.task0817;

//package com.javarush.task.task08.task0817;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> humans = new HashMap<>();
        humans.put("Полочкин", "Александр");
        humans.put("Амиров", "Олег");
        humans.put("Рогозин", "Роман");
        humans.put("Баканов", "Даниил");
        humans.put("Бурмакин", "Игорь");

        humans.put("Шишкин", "Александр");
        humans.put("Конышев", "Роман");
        humans.put("Шеревеня", "Сергей");
        humans.put("Шашкин", "Денис");
        humans.put("Силкин", "Олег");
        return humans;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, Integer> keys = new HashMap<>();
        for (String firstName : map.values()) {
            System.out.print(firstName + ": ");
            if (keys.containsKey(firstName)) {
                Integer entry = keys.get(firstName);
                keys.put(firstName, ++entry);
                System.out.println(entry);
            } else {
                keys.put(firstName, 1);
                System.out.println(1);
            }
        }
        System.out.println(keys);
        for (Map.Entry<String, Integer> entry : keys.entrySet()) {
            if (entry.getValue() > 1) {
                removeItemFromMapByValue(map, entry.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Date start = new Date();
        Map<String, String> humans = createMap();
        removeTheFirstNameDuplicates(humans);
        System.out.println(humans.size());
        Date finish = new Date();
        System.out.println(finish.getTime() - start.getTime());
    }
}































