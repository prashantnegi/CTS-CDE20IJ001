import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class CollectionDemo {

    /*
     * inputMap.forEach((key,value) -> {
     * if(value.getFirstName().contains(inputCriteriaFirstName)){ keys.add(key); }
     * });
     */

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Three Wheeler Auto");
        map.put(2, "Three Wheeler Rickshaw");
        map.put(3, "Fout Wheeler Car");
        map.put(4, "Two Wheeler Scooter");

        List<Integer> keys = new LinkedList<>();

        // map.forEach((key, value) -> {
        // if(value.toLowerCase().contains("three")){
        // keys.add(key);
        // }
        // });

        // System.out.println(map.entrySet());
        // System.out.println(map.keySet());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
            if (entry.getValue().toLowerCase().contains("Three".toLowerCase())) {
                keys.add(entry.getKey());
            }
        }

        System.out.println("\n\n" + keys);
    }
}
