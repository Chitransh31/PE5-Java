import java.util.HashSet;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("Harry");
        stringSet.add("Olive");
        stringSet.add("Alice");
        stringSet.add("Bluto");
        stringSet.add("Eugene");

        System.out.println("Input: \n" + stringSet);

        TreeSet<String> treeSet = new TreeSet<String>(stringSet);
        System.out.println("Output: \n" + treeSet);

        ArrayList<String> stringArrayList = new ArrayList<String>(treeSet);
        System.out.println("ArrayList: \n" + stringArrayList);

    }
}
