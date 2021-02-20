/*
*Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
Write a function which takes a list of strings and returns each line prepended by the correct number.
The numbering starts at 1. The format is n: string. Notice the colon and space in between.
Examples:
number(Arrays.asList()) # => []
number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing1_2_3 {
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }

    public static List<String> number(List<String> lines) {
        int l = lines.size();
        List<String> rez = new ArrayList<>();
        for (int i = 1; i <= l; i++) {
            rez.add(i+": "+ lines.get(i-1));
        }
        System.out.println(lines + " " + l);
        return rez;
    }
}
