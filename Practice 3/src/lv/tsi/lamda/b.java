package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;

public class b {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add ("a1");
        list.add("c3");
        list.add("a2");
        list.add ("a3");
        list.add ("b3");
        list.add ("b2");
        list.add ("c1");
        list.add ("c2");
        list.add ("b1");
        for(String str : list){
            if (str.charAt(0) == 'b'){
                System.out.println(str);
            }
        }
    }
}
