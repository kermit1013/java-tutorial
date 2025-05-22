package org.example;

import org.example.model.MapExample;
import org.example.model.Student;

import java.util.HashMap;
import java.util.HashSet;

public class CollectionTwo {
    public static void main(String[] args) {

//        HashSet<String> names = new HashSet<>();
//        names.add("小明");
//        names.add("小華");
//        for (String name : names) {
//            System.out.println(name);
//        }
//        HashSet<Student> students = new HashSet<>();
//
//        HashSet<MapExample> mapExamples = new HashSet<>();
//        mapExamples.add(new MapExample("001", "小明"));
//        mapExamples.add(new MapExample("002", "小華"));
//
//        HashMap<String, String> stringHashMap = new HashMap<>();
//        stringHashMap.put("001", "小明");
//        stringHashMap.put("001", "小明");
//        stringHashMap.put("002", "小華");
//        for (String key : stringHashMap.keySet()) {
//            System.out.println(stringHashMap.get(key));
//        }

        HashSet<String> keySet = new HashSet<>();
        keySet.add("小名");
        keySet.add("小名 ".trim());
        for (String key : keySet) {
            System.out.println(key);
        }
    }
}
