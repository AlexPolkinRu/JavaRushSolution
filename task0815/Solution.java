package Javarush.task0815;

//package com.javarush.task.task08.task0815;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> human = new HashMap<String, String>();
        human.put("Полочкин", "Александр");
        human.put("Амиров", "Олег");
        human.put("Рогозин", "Роман");
        human.put("Баканов", "Даниил");
        human.put("Бурмакин", "Игорь");

        human.put("Шишкин", "Александр");
        human.put("Конышев", "Роман");
        human.put("Шеревеня", "Сергей");
        human.put("Шашкин", "Денис");
        human.put("Силкин", "Олег");
        return human;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countSameFirstName = 0;
        for (String value : map.values()){
            if (value.equals(name)) countSameFirstName++;
        }
        return countSameFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countSameLastName = 0;
        for (String key : map.keySet()){
            if (key.equals(lastName)) countSameLastName++;
        }
        return countSameLastName;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        Map<String, String> map = createMap();
        Collection<String> firstNames = map.values();
        Collection<String> lastNames = map.keySet();
        System.out.println(firstNames);
        System.out.println(lastNames);
        System.out.println(getCountTheSameFirstName(map, "Александр"));
        System.out.println(getCountTheSameLastName(map, "Пестов"));
        System.out.println(System.nanoTime()-start);

    }
}































