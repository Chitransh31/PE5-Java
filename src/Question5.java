import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question5 {

    public static void modifyMap(Map<String, String> stringMap) {
        int i = 0;
        String val1 = null;

        if(stringMap.containsKey("val1")) {
            if(!stringMap.get("val1").equals(" ")) {
                for(Map.Entry<String, String> entry: stringMap.entrySet()) {
                    if(i == 0) {
                        val1 = entry.getValue();
                        entry.setValue(" ");
                    }
                    else if(i == 1) {
                        entry.setValue(val1);
                    }
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> stringMap = new LinkedHashMap<String, String>();
        stringMap.put("val1", "java");
        stringMap.put("val2", "c++");

        System.out.println("Input map: ");
        for(Map.Entry<String, String> entry: stringMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        modifyMap(stringMap);

        System.out.println("Output map: ");
        for(Map.Entry<String, String> entry: stringMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
