
package BuisnessLayer;

import DataLayer.Student;
import java.util.*;

public class MeritList {

    private List<Student> meritList = new ArrayList<>();

    public void addStudent(Student student) {
        meritList.add(student);
    }

    public void notifyMeritList() {
        for (Student student : meritList) {
            if (student.isSelectedForInterview()) {
                System.out.println(student.getName() + " is on the Merit List.");
            }
        }
    }
}


