package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Locale;
import java.util.stream.Collectors;

public class sorted {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a1");
        list.add("c3");
        list.add("a2");
        list.add("a3");
        list.add("b3");
        list.add("b2");
        list.add("c1");
        list.add("c2");
        list.add("b1");

        List<String> cList = list.stream()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(cList);
            }
        }




