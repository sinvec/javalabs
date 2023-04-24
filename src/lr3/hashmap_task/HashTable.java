package lr3.hashmap_task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable {

    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(1, "hello");
        myHashMap.put(4, "heLlo");
        myHashMap.put(8, "Hello");
        myHashMap.put(2, "hellO2");
        myHashMap.put(5, "helLO");
        myHashMap.put(0, "hELlo");
        myHashMap.put(3, "heLLo");
        myHashMap.put(0, "HELlo");
        myHashMap.put(7, "heLLO7");
        myHashMap.put(9, "hEllO");
        myHashMap.put(6, "HeLLo");

        List<String> stringsWithKeysAbove5 = new ArrayList<>();
        List<String> stringsWithKeyEqual0 = new ArrayList<>();
        int mulOfKeysWithStringLen = 1;
        for (Map.Entry<Integer, String> entry: myHashMap.entrySet()) {
            if (entry.getKey() > 5) {
                stringsWithKeysAbove5.add(entry.getValue());
            } else if (entry.getKey() == 0) {
                stringsWithKeyEqual0.add(entry.getValue());
            }
            if (entry.getValue().length() > 5) {
                mulOfKeysWithStringLen *= entry.getKey();
            }
        }

        System.out.print("Strings with HashMap keys above 5: ");
        System.out.println(stringsWithKeysAbove5);
        System.out.print("Strings with HashMap key equal 0: ");
        System.out.println(stringsWithKeyEqual0);
        System.out.print("Multiplie of keys with HashMap string length above 5: ");
        System.out.println(mulOfKeysWithStringLen);

    }
}
