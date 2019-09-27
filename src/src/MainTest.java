package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        Student stu1 = new Student(132, "Saurabh", 22);
        Student stu2 = new Student(137, "Saurabh", 25);
        Student stu3 = new Student(120, "Saurabh", 22);
        Student stu4 = new Student(150, "Praveen", 50);
        Student stu5 = new Student(110, "Pushkar", 70);

        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);
        studentList.add(stu4);
        studentList.add(stu5);

        Iterator<Student> studentIterator = studentList.iterator();
        System.out.println("Before Sorting:");
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }

        Collections.sort(studentList, new StudentSorter());
        Collections.reverse(studentList);

        System.out.println("\n\nAfter Sorting:\n");
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
