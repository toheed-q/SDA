
package sdamid;
import BuisnessLayer.*;
import DataLayer.Student;
import java.util.*;
import java.text.SimpleDateFormat;

public class SDAMID {

   
    public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date testDate = null;
        Date interviewDate = null;
        Criteria eligibilityCriteria = new Criteria(60.0); // 60 marks as minimum eligibility
        AdmissionSystem admissionSystem = new AdmissionSystem(testDate, interviewDate, eligibilityCriteria);

      
        Student student1 = new Student("Toheed Ahmed", 75);
        Student student2 = new Student("Zain", 55);
        Student student3 = new Student("Arslan", 85);
        Student student4 = new Student("Hussan", 45);

        admissionSystem.registerStudent(student1);
        admissionSystem.registerStudent(student2);
        admissionSystem.registerStudent(student3);
        admissionSystem.registerStudent(student4);

        // Check eligibility for each student
        admissionSystem.checkEligibility();  //  check students eligibility

        // Notify students about test and interview
        admissionSystem.notifyTestAndInterview();

      
        admissionSystem.publishMeritList(); // Notify students who are on the merit list

  
        System.out.println("\nEligibility Filter Result:");
        EligibilityFilter eligibilityFilter = new EligibilityFilter(eligibilityCriteria);
        List<Student> eligibleStudents = eligibilityFilter.process(Arrays.asList(student1, student2, student3, student4));

        System.out.println("\nTest Selection Filter Result:");
        TestSelectionFilter testSelectionFilter = new TestSelectionFilter();
        List<Student> selectedForTest = testSelectionFilter.process(eligibleStudents);

        System.out.println("\nInterview Filter Result:");
        Interview interviewFilter = new Interview();
        List<Student> selectedForInterview = interviewFilter.process(selectedForTest);
    }
}
    
    
