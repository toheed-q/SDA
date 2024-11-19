
package BuisnessLayer;

import DataLayer.Student;
import java.util.*;

public class Interview implements Filter {

  
    public List<Student> process(List<Student> students) {
        List<Student> selectedForInterview = new ArrayList<>();
        for (Student student : students) {
            if (student.isSelectedForInterview()) {
                selectedForInterview.add(student);
                System.out.println(student.getName() + " selected for interview.");
            }
        }
        return selectedForInterview;
    }}

    
