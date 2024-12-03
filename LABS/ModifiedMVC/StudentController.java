package controller;

import model.Student;
import view.StudentView;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students; 
    private StudentView studentView;

    
    public StudentController(StudentView studentView) {
        this.students = new ArrayList<>();
        this.studentView = studentView;
    }

   
    public void addStudent(String name, String ID, double CGPA) {
        Student student = new Student(name, ID, CGPA);
        students.add(student);  
    }

   
    public void showStudents() {
        studentView.printStudentList(students); 
    }

    
    public void updateView() {
        showStudents();  
    }
}
