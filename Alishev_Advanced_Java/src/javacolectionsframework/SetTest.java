package javacolectionsframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        hashSet.add("Bob");
        hashSet.add("Tom");
        hashSet.add("Jon");
        hashSet.add("Fil");
        hashSet.add("Tom");
        hashSet.add("Tom");

        setA.add(0);
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        setB.add(2);
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        //объединение множеств
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println(union);

        //пересечение множеств
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println(intersection);

        //разность множеств
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println(difference);

/*
        for (String name : hashSet) {
            System.out.println(name);
        }
        System.out.println("----------");
        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Bill"));

/*
        linkedHashSet.add("Bob");
        linkedHashSet.add("Tom");
        linkedHashSet.add("Jon");
        linkedHashSet.add("Fil");
        for (String name : linkedHashSet) {
            System.out.println(name);
        }
        System.out.println("----------");

        treeSet.add("Zet");
        treeSet.add("Tom");
        treeSet.add("Jon");
        treeSet.add("Fil");

        for (String name : treeSet) {
            System.out.println(name);
*/
    }
}
