
package BuisnessLayer;

import DataLayer.Student;
import java.util.*;

public class AdmissionSystem extends Observable {

    private List<Student> students = new ArrayList<>();
    private Date testDate;
    private Date interviewDate;
    private Criteria eligibilityCriteria;
    private MeritList meritList;

    public AdmissionSystem(Date testDate, Date interviewDate, Criteria eligibilityCriteria) {
        this.testDate = testDate;
        this.interviewDate = interviewDate;
        this.eligibilityCriteria = eligibilityCriteria;
        this.meritList = new MeritList();
    }

    public void registerStudent(Student student) {
        students.add(student);
        addObserver((Observer) student); // Adding students  observers
    }

    public void checkEligibility() {
        for (Student student : students) {
            if (eligibilityCriteria.check(student)) {
                student.setSelectedForTest(true);
                setChanged();
                notifyObservers("Test date is set: " + testDate);
                meritList.addStudent(student);
            }
        }
    }

    public void notifyTestAndInterview() {
        for (Student student : students) {
            if (student.isSelectedForTest()) {
                setChanged();
                notifyObservers("Interview date is set: " + interviewDate);
                student.setSelectedForInterview(true);
            }
        }
    }

    public void publishMeritList() {
        meritList.notifyMeritList();
    }
}
