
package view;

import model.Student;
import java.util.List;

public class StudentView {

    // Method to print the list of all students
    public void printStudentList(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student student : students) {
            System.out.println(student.getData());
        }
    }
}


