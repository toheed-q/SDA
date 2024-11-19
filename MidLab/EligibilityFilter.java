/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuisnessLayer;

import DataLayer.Student;
import java.util.*;

public class EligibilityFilter implements Filter {

    private Criteria criteria;

    public EligibilityFilter(Criteria criteria) {
        this.criteria = criteria;
    }

   
    public List<Student> process(List<Student> students) {
        List<Student> eligibleStudents = new ArrayList<>();
        for (Student student : students) {
            if (criteria.check(student)) {
                eligibleStudents.add(student);
                System.out.println(student.getName() + " is eligible.");
            }
        }
        return eligibleStudents;
    }

}
