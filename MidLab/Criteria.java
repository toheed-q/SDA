/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuisnessLayer;



import DataLayer.Student;

public class Criteria {

    private double minimumMarks;

    public Criteria(double minimumMarks) {
        this.minimumMarks = minimumMarks;
    }

    public boolean check(Student student) {
        return student.getMarks() >= minimumMarks; // Simple check based on marks
    }
}
