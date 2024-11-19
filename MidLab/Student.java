package DataLayer;

import java.util.Observer;
import java.util.Observable;

public class Student implements Observer {
    private String name;
    private double marks;
    private boolean selectedForTest;
    private boolean selectedForInterview;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
        this.selectedForTest = false;
        this.selectedForInterview = false;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public boolean isSelectedForTest() {
        return selectedForTest;
    }

    public boolean isSelectedForInterview() {
        return selectedForInterview;
    }

    public void setSelectedForTest(boolean selectedForTest) {
        this.selectedForTest = selectedForTest;
    }

    public void setSelectedForInterview(boolean selectedForInterview) {
        this.selectedForInterview = selectedForInterview;
    }

   
    public void update(Observable o, Object arg) {
        // Handle the notifications from AdmissionSystem
        if (arg instanceof String) {
            String message = (String) arg;
            System.out.println(name + " received notification: " + message);
        }
    }
}


