package collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapDemo2 {

    public static void main(String[] args) {
        List<Map<String, String>> listof = new ArrayList<>();


        Map<String, String> map1 = new HashMap<>();
        map1.put("sample1", "sample1");
        map1.put("sample2", "sample2");

        Map<String, String> map2 = new HashMap<>();
        map2.put("sample1map2", "sample1map2");
        map2.put("sample2map2", "sample2map2");

        listof.add(map1);
        listof.add(map2);

        for (Map<String, String> map : listof) {
            for (Map.Entry<String, String> m : map.entrySet()) {
                System.out.println(m.getKey() +" - "+ m.getValue());
            }
        }
    }
}

