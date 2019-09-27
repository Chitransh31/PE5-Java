import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question2 {

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
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = in.nextLine();

        Map<String,Integer> words = new HashMap<String,Integer>();
        countEachWords(text, words);
        System.out.println(words);
    }

}
