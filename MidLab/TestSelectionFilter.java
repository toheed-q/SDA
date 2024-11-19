
package BuisnessLayer;

import DataLayer.Student;
import java.util.*;

public class TestSelectionFilter implements Filter {

  
    public List<Student> process(List<Student> students) {
        List<Student> selectedForTest = new ArrayList<>();
        for (Student student : students) {
            if (student.isSelectedForTest()) {
                selectedForTest.add(student);
                System.out.println(student.getName() + " selected for test.");
            }
        }
        return selectedForTest;
    }
}
