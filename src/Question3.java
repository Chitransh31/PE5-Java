import java.util.HashMap;
import java.util.Map;

public class Question3 {

    static void countEachWords(String text, Map<String,Integer>words) {
        String[] wordsWithoutDelimiter = text.split("[\\W_]");

        for(int i = 0;i < wordsWithoutDelimiter.length;i++) {
            if(!wordsWithoutDelimiter[i].equals("")) {
                Integer count = words.get(wordsWithoutDelimiter[i]);
                if (count != null) {
                    count++;
                } else {
                    count = 1;
                }
                words.put(wordsWithoutDelimiter[i], count);
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String,Integer> wordCount = new HashMap<String,Integer>();
        Map<String,Boolean> words = new HashMap<String,Boolean>();

        for(int i = 0;i < arr.length;i++) {
            countEachWords(arr[i], wordCount);
        }
        System.out.println(wordCount);

        for(Map.Entry<String, Integer> entry: wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if(entry.getValue() >= 2) {
                words.put(entry.getKey(), true);
            }
            else {
                words.put(entry.getKey(), false);
            }
        }

        System.out.println(words);
    }

}
