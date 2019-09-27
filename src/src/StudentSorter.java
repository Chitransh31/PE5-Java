package src;
import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    public int compare(Student student1, Student student2) {
        int ageCompare = student1.getAge() - student2.getAge();
        int retValue = 0;

        if(ageCompare == 0) {
            int nameCompare = student1.getName().compareTo(student2.getName());
            if(nameCompare == 0) {
                int idCompare = student1.getId() - student2.getId();
                retValue = idCompare;
            }
            else {
                retValue = nameCompare;
            }
        }
        else {
            retValue = ageCompare;
        }
        return  retValue;
    }
}
