package javacolectionsframework;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println(list.get(0) + "; " + list.get(9));

        System.out.println(list.size());

        list.remove(5);
        System.out.println(list);



    }
}
