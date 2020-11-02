import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsDemo{

    public static void main(String[] args) {

        manageData();
        
    }

    static void manageData(){


        List<List<String>> mainListNames = new ArrayList<List<String>>();

        mainListNames.add(Arrays.asList("Ashish", "Aakancha", "Arpitha"));
        mainListNames.add(Arrays.asList("Bibhu", "Bansal", "Benoy"));
        mainListNames.add(Arrays.asList("Charlie", "Christopher", "Catherine"));

        System.out.println(mainListNames);

        for(List<String> subListNames: mainListNames){
            for(String name: subListNames){
                System.out.println(name);
            }
            System.out.println("=========================================================");
        }

    }
}