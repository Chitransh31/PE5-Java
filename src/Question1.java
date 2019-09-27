import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type 'exit' to exit.Enter elements: ");
        ArrayList<String> strList = new ArrayList<>();

        String element = null;
        while(!(element = in.nextLine()).equals("exit")) {
            strList.add(element);
        }
        System.out.println("Input String: " + strList);

        System.out.println("Enter element to be replaced: ");
        String replaceWord = in.nextLine();

        System.out.println("Enter new element: ");
        String newWord = in.nextLine();

        int index = strList.indexOf(replaceWord);
        strList.remove(index);
        strList.add(index, newWord);

        System.out.println("Output String: " + strList);

        strList.removeAll(strList);
        System.out.println("Output String: " + strList);

    }

}
