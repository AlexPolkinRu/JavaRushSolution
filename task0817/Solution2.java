package Javarush.task0817;

//package com.javarush.task.task08.task0817;

import java.util.*;

/*
Нам повторы не нужны
*/

public class Solution2 {
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
        System.out.println(map.size());
        Map<String, String> copy = new HashMap<>(map);
        Set<String> names = new HashSet<>();
        for (String firstName : copy.values()) {
            if (!names.add(firstName)) {
                removeItemFromMapByValue(map, firstName);
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
































