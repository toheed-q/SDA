
package modiefiedmvc;


import model.Student;
import view.StudentView;
import controller.StudentController;

public class ModiefiedMVC {
    public static void main(String[] args) {
        
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentView);

        
        studentController.addStudent("Toheed", "FA21-BSE-156", 2.79);
        studentController.addStudent("Zain", "FA21-BSE-166", 2.8);
        studentController.addStudent("Arslan", "FA21-BCS-028", 2.8);

        
        studentController.updateView();
    }
}

