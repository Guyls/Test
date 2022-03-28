package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Maj {
    public static void main(String[] args) {
        List<String> Maj = new ArrayList<>();
        Maj.add ("a1");
        Maj.add("c3");
        Maj.add("a2");
        Maj.add ("a3");
        Maj.add ("b3");
        Maj.add ("b2");
        Maj.add ("c1");
        Maj.add ("c2");
        Maj.add ("b1");

        for (int i =0; i <Maj.size(); i++) {
            String newValue = Maj.get(i).toUpperCase(Locale.ROOT);
            Maj.set(i,newValue);

        }
        System.out.println(Maj);

    }

}


